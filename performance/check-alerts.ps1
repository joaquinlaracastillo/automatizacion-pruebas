# Ruta del archivo de estadísticas generado por JMeter
$statsPath = "$PSScriptRoot\reporte-html\statistics.json"

# Verificar que el archivo existe
if (!(Test-Path $statsPath)) {
    Write-Host "ERROR: No se encontró el archivo statistics.json"
    exit 1
}

# Leer las estadísticas
$data = Get-Content $statsPath -Raw | ConvertFrom-Json

# Obtener las métricas totales
$total = $data.Total

# Límites definidos para las alertas
$maxErrorRate = 5
$maxAverageTime = 500
$maxP95 = 1000

# Variables para controlar alertas
$alerta = $false

Write-Host "======================================"
Write-Host "   ANALISIS DE ALERTAS DE PERFORMANCE"
Write-Host "======================================"

# Mostrar métricas
Write-Host ""
Write-Host "Solicitudes: $($total.sampleCount)"
Write-Host "Errores: $($total.errorCount)"
Write-Host "Error %: $($total.errorPct)"
Write-Host "Tiempo promedio: $($total.meanResTime) ms"
Write-Host "Percentil 95: $($total.pct2ResTime) ms"

Write-Host ""
Write-Host "------------ RESULTADO ---------------"

# Alerta por errores
if ($total.errorPct -gt $maxErrorRate) {
    Write-Host "ALERTA: Porcentaje de errores superior al 5%"
    $alerta = $true
}

# Alerta por tiempo promedio
if ($total.meanResTime -gt $maxAverageTime) {
    Write-Host "ALERTA: Tiempo promedio superior a 500 ms"
    $alerta = $true
}

# Alerta por percentil 95
if ($total.pct2ResTime -gt $maxP95) {
    Write-Host "ALERTA: Percentil 95 superior a 1000 ms"
    $alerta = $true
}

# Resultado final
if ($alerta -eq $false) {
    Write-Host "OK: Todas las métricas están dentro de los límites."
}
else {
    Write-Host "ESTADO FINAL: ALERTA DE PERFORMANCE"
    exit 1
}
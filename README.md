# 🧪 Automatización de Pruebas

## 📌 Descripción del proyecto

Este proyecto corresponde a una implementación de automatización de pruebas para una aplicación básica desarrollada en Java.

La aplicación consiste en una **calculadora** capaz de realizar operaciones de suma y resta. Para validar su correcto funcionamiento se implementaron diferentes niveles de pruebas:

- Pruebas Unitarias con JUnit 5.
- Pruebas BDD con Cucumber y Gherkin.
- Integración Continua mediante GitHub Actions.
- Pruebas de Performance utilizando Apache JMeter.
- Generación y análisis de métricas de rendimiento.
- Dashboard de resultados de performance.

El objetivo principal del proyecto es demostrar un flujo básico de aseguramiento de calidad, integrando pruebas funcionales, automatización, integración continua y pruebas de rendimiento.

---

# 🎯 Objetivos

- Implementar pruebas unitarias automatizadas.
- Utilizar Maven para gestionar dependencias y ejecutar pruebas.
- Aplicar pruebas atómicas e independientes.
- Utilizar Git para el control de versiones.
- Trabajar utilizando ramas y commits.
- Implementar Integración Continua mediante GitHub Actions.
- Ejecutar automáticamente las pruebas funcionales.
- Implementar pruebas BDD utilizando Cucumber.
- Documentar criterios de aceptación mediante Three Amigos.
- Crear escenarios utilizando Gherkin.
- Implementar pruebas básicas de performance.
- Analizar métricas como TPS, latencia y porcentaje de errores.
- Generar un dashboard de resultados.

---

# 🛠 Tecnologías utilizadas

| Tecnología | Uso |
|---|---|
| Java 17 | Desarrollo de la aplicación |
| Maven | Gestión de dependencias y ejecución |
| JUnit 5 | Pruebas unitarias |
| Cucumber | Pruebas BDD |
| Gherkin | Definición de escenarios |
| Git | Control de versiones |
| GitHub | Repositorio remoto |
| GitHub Actions | Integración Continua |
| Apache JMeter | Pruebas de Performance |

---

# 📁 Estructura del proyecto

```text
automatizacion-pruebas/
├── .github/
│   └── workflows/
│       └── ci.yml
├── performance/
│   ├── prueba-performance-calculadora.jmx
│   ├── resultados.jtl
│   └── reporte-html/
│       ├── index.html
│       └── statistics.json
├── src/
│   ├── main/java/org/example/Calculadora.java
│   └── test/
│       ├── java/org/example/
│       │   ├── CalculadoraTest.java
│       │   ├── CucumberTestRunner.java
│       │   └── steps/CalculadoraSteps.java
│       └── resources/features/calculadora.feature
├── .gitignore
├── pom.xml
└── README.md
```

---

# 🧮 Funcionalidades implementadas

La aplicación contiene una clase llamada `Calculadora` que permite realizar las siguientes operaciones:

- Suma de dos números.
- Resta de dos números.

Estas funcionalidades fueron validadas mediante pruebas unitarias y pruebas BDD.

---

# 👥 Simulación de sesión Three Amigos

Para definir correctamente el comportamiento esperado de la calculadora se realizó una simulación de la técnica **Three Amigos**.

Esta técnica permite reunir diferentes perspectivas antes de implementar una funcionalidad.

## Participantes

### 👤 Product Owner

Representa las necesidades del usuario y define el comportamiento esperado.

> Como usuario, quiero realizar operaciones de suma y resta para obtener resultados matemáticos correctos.

### 👨‍💻 Desarrollador

Se definió que la clase `Calculadora` debía contener métodos independientes:

```text
sumar()
restar()
```

Cada método recibe dos números como parámetros y devuelve el resultado correspondiente.

### 🧪 QA / Tester

Se propusieron:

- Pruebas Unitarias.
- Escenarios BDD.
- Pruebas de Performance.

---

# ✅ Criterios de aceptación

1. La calculadora debe sumar correctamente dos números.
2. La calculadora debe restar correctamente dos números.
3. Cada operación debe poder validarse de manera independiente.
4. Los resultados deben coincidir con los valores esperados.
5. Las pruebas unitarias deben ejecutarse correctamente.
6. Los escenarios BDD deben ejecutarse correctamente.
7. Las pruebas deben ejecutarse automáticamente mediante CI.
8. La aplicación debe responder correctamente durante una prueba básica de carga.

---

# 🧪 Pruebas Unitarias

Las pruebas unitarias fueron implementadas utilizando **JUnit 5**.

## Prueba de suma

```text
5 + 3 = 8
```

## Prueba de resta

```text
10 - 4 = 6
```

Las pruebas fueron diseñadas de forma:

- Atómica.
- Independiente.
- Automatizada.

### Resultado

```text
Tests ejecutados: 2
Pruebas exitosas: 2
Fallos: 0
Errores: 0
```

---

# 🥒 Pruebas BDD

Las pruebas BDD fueron implementadas utilizando:

- Cucumber.
- Gherkin.
- Maven.

Los escenarios fueron definidos en:

```text
src/test/resources/features/calculadora.feature
```

## Escenario de suma

```gherkin
Scenario: Sumar dos números

Given tengo una calculadora
When sumo 5 y 3
Then el resultado debe ser 8
```

También se implementaron diferentes ejemplos para validar la operación de resta.

### Resultado de ejecución

```text
4 tests passed
4 tests total
Process finished with exit code 0
```

Esto confirma que todos los escenarios BDD fueron ejecutados correctamente.

---

# ⚙️ Ejecución de pruebas

Las pruebas pueden ejecutarse utilizando Maven:

```bash
./mvnw.cmd test
```

Este comando permite:

1. Compilar el proyecto.
2. Ejecutar las pruebas unitarias.
3. Ejecutar las pruebas configuradas en el proyecto.

---

# 🌿 Control de versiones

Para el desarrollo se utilizó Git como sistema de control de versiones.

Se trabajó utilizando ramas para separar funcionalidades. Entre las ramas utilizadas se encuentran:

```text
main
feature/pruebas-unitarias
feature/pruebas-rendimiento
```

Los cambios fueron registrados mediante commits y posteriormente enviados al repositorio remoto en GitHub.

---

# 🚀 Integración Continua

Se configuró un pipeline de Integración Continua utilizando **GitHub Actions**.

El archivo de configuración se encuentra en:

```text
.github/workflows/ci.yml
```

## Flujo del pipeline

El proceso realiza las siguientes acciones:

1. Descarga el código del repositorio.
2. Configura Java.
3. Configura Maven.
4. Compila el proyecto.
5. Ejecuta las pruebas unitarias.
6. Ejecuta los escenarios BDD.
7. Genera los resultados correspondientes.
8. Publica reportes como Artifacts cuando corresponde.

Los resultados observados muestran ejecuciones exitosas del pipeline.

---

# 📊 Pruebas de Performance

Para evaluar el rendimiento de la aplicación se implementó una prueba básica utilizando **Apache JMeter**.

El archivo de configuración se encuentra en:

```text
performance/prueba-performance-calculadora.jmx
```

La prueba fue ejecutada contra una API HTTP.

---

# 📈 Resultados de Performance

Durante la ejecución se realizaron:

```text
Solicitudes ejecutadas: 200
Errores: 0
Porcentaje de error: 0.00%
Solicitudes exitosas: 100%
```

## Métricas obtenidas

| Métrica | Resultado |
|---|---:|
| Solicitudes ejecutadas | 200 |
| Solicitudes exitosas | 100% |
| Errores | 0 |
| Porcentaje de error | 0.00% |
| Tiempo promedio | 169.21 ms |
| Tiempo mínimo | 112 ms |
| Tiempo máximo | 896 ms |
| Mediana | 133 ms |
| Percentil 90 | 338 ms |
| Percentil 95 | 369.90 ms |
| Percentil 99 | 804.84 ms |
| Throughput | 0.64 TPS |

---

# 🔍 Análisis de TPS, Latencia y Errores

## ⚡ TPS / Throughput

El throughput obtenido fue:

```text
0.64 TPS
```

Esto representa aproximadamente la cantidad de transacciones procesadas por segundo durante la prueba realizada.

Debido a que se trata de una prueba básica y controlada, este valor debe analizarse considerando la configuración utilizada en JMeter.

## ⏱ Latencia y tiempos de respuesta

El tiempo promedio de respuesta fue:

```text
169.21 ms
```

La mediana fue:

```text
133 ms
```

Esto indica que una gran parte de las solicitudes tuvo tiempos de respuesta cercanos a ese valor.

Sin embargo, se registró un tiempo máximo de:

```text
896 ms
```

Esto demuestra que algunas solicitudes presentaron tiempos de respuesta superiores al promedio.

Los percentiles obtenidos fueron:

| Percentil | Tiempo |
|---|---:|
| P90 | 338 ms |
| P95 | 369.90 ms |
| P99 | 804.84 ms |

El percentil 99 muestra que el 99% de las solicitudes tuvo un tiempo de respuesta igual o inferior a aproximadamente 804.84 ms.

## ❌ Errores

La prueba obtuvo:

```text
0 errores
0.00% de error
```

Esto significa que las 200 solicitudes ejecutadas fueron procesadas correctamente.

El dashboard de JMeter mostró:

```text
PASS: 100%
FAIL: 0%
```

---

# 📊 Dashboard de Performance

JMeter generó un reporte HTML navegable con las métricas de la prueba.

El reporte se encuentra en:

```text
performance/reporte-html/index.html
```

El dashboard permite visualizar:

- Estado de las solicitudes.
- Solicitudes exitosas y fallidas.
- Número de muestras ejecutadas.
- Tiempo promedio.
- Tiempo mínimo y máximo.
- Mediana.
- Percentiles.
- Throughput.
- Errores.

## Resultado del Dashboard

🟢 **200 solicitudes ejecutadas**

🟢 **100% exitosas**

🟢 **0 errores**

🟢 **0.00% de error**

---

# 🚨 Propuesta de Alertas Automáticas

Como propuesta para una futura implementación de monitoreo automático, se podrían definir alertas basadas en las métricas de rendimiento.

| Métrica | Condición de alerta |
|---|---|
| Porcentaje de errores | Mayor a 5% |
| Tiempo promedio | Mayor a 500 ms |
| Percentil 95 | Mayor a 1 segundo |
| Percentil 99 | Mayor a 2 segundos |
| Disponibilidad | Menor al 95% |

## Ejemplo de alerta

```text
ALERTA DE PERFORMANCE

Porcentaje de errores superior al límite permitido.

Límite: 5%
Resultado actual: 6%
Estado: ALERTA
```

Esta propuesta podría integrarse en el futuro con:

- GitHub Actions.
- Correo electrónico.
- Slack.
- Microsoft Teams.
- Sistemas de monitoreo.

---

# 📊 Dashboard General de Calidad

| Área | Herramienta | Estado | Resultado |
|---|---|---|---|
| Pruebas Unitarias | JUnit 5 | 🟢 PASS | 2 pruebas exitosas |
| Pruebas BDD | Cucumber | 🟢 PASS | 4 escenarios ejecutados |
| Integración Continua | GitHub Actions | 🟢 PASS | Pipeline exitoso |
| Pruebas Performance | Apache JMeter | 🟢 PASS | 200 solicitudes |
| Errores Performance | Apache JMeter | 🟢 PASS | 0 errores |
| Dashboard Performance | JMeter HTML Report | 🟢 PASS | Reporte navegable |

---

# 🟢 Estado General del Proyecto

🟢 **Pruebas Unitarias:** Correctas

🟢 **Pruebas BDD:** Correctas

🟢 **Pipeline de Integración Continua:** Funcionando

🟢 **Pruebas de Performance:** Correctas

🟢 **Errores de Performance:** 0%

🟢 **Dashboard de Métricas:** Generado correctamente

⚠️ **Alertas Automáticas:** Propuesta documentada para futura implementación

---

# 📋 Flujo de trabajo realizado

1. Creación del proyecto Maven.
2. Configuración de Java y Maven.
3. Implementación de la clase `Calculadora`.
4. Implementación de pruebas unitarias con JUnit 5.
5. Ejecución local de pruebas unitarias.
6. Creación de ramas para organizar el trabajo.
7. Uso de Git y commits.
8. Configuración del repositorio remoto.
9. Implementación de GitHub Actions.
10. Ejecución automática de pruebas en CI.
11. Simulación de sesión Three Amigos.
12. Definición de criterios de aceptación.
13. Creación de escenarios Gherkin.
14. Configuración de Cucumber.
15. Implementación de Step Definitions.
16. Ejecución de pruebas BDD.
17. Generación de reportes BDD.
18. Implementación de una prueba básica de Performance.
19. Ejecución de pruebas utilizando Apache JMeter.
20. Análisis de TPS, latencia y errores.
21. Generación de un Dashboard HTML de Performance.
22. Documentación de una propuesta de alertas automáticas.

---

# 🏁 Conclusión

El proyecto permitió implementar un flujo completo y básico de automatización de pruebas utilizando diferentes herramientas y metodologías.

Las pruebas unitarias permitieron validar individualmente las operaciones principales de la calculadora.

Las pruebas BDD permitieron definir el comportamiento esperado utilizando escenarios escritos en lenguaje comprensible mediante Gherkin y ejecutados con Cucumber.

Git y GitHub permitieron gestionar el código fuente mediante ramas y commits, mientras que GitHub Actions permitió automatizar la ejecución de pruebas mediante un pipeline de Integración Continua.

Finalmente, Apache JMeter permitió realizar una prueba básica de rendimiento y analizar métricas importantes como:

- Tiempo promedio de respuesta.
- Latencia.
- Percentiles.
- Throughput.
- Porcentaje de errores.

Los resultados obtenidos fueron satisfactorios para la prueba realizada, alcanzando un **100% de solicitudes exitosas y 0 errores**.

El proyecto demuestra la integración de pruebas funcionales, BDD, Integración Continua y pruebas de Performance dentro de un mismo flujo de aseguramiento de calidad.

---

# 📸 Evidencias

Las evidencias del proyecto incluyen capturas de:

- Ejecución exitosa de pruebas unitarias.
- Ejecución exitosa de pruebas BDD.
- Pipeline exitoso en GitHub Actions.
- Dashboard de Apache JMeter.
- Métricas de Performance.
- Reportes generados.

Estas evidencias pueden utilizarse como respaldo para la documentación y entrega final del proyecto.

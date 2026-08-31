# Automatización de Pruebas

## Descripción del proyecto

Este proyecto corresponde a una implementación de automatización de pruebas utilizando Java, Maven, JUnit 5, Git y GitHub Actions.

El proyecto consiste en una calculadora básica que permite realizar operaciones de suma y resta. Para comprobar el correcto funcionamiento de estas operaciones, se implementaron pruebas unitarias automatizadas.

Además, se configuró un pipeline de Integración Continua (CI) mediante GitHub Actions, permitiendo ejecutar automáticamente las pruebas cada vez que se realizan cambios en el repositorio.

---

## Objetivos

- Implementar pruebas unitarias automatizadas.
- Utilizar Maven para la gestión de dependencias y ejecución de pruebas.
- Aplicar pruebas atómicas e independientes.
- Utilizar Git para el control de versiones.
- Trabajar utilizando ramas y commits.
- Implementar un pipeline de Integración Continua con GitHub Actions.
- Ejecutar automáticamente las pruebas.
- Generar y almacenar reportes de pruebas.

---

## Tecnologías utilizadas

El proyecto utiliza las siguientes tecnologías:

- Java 17
- Maven
- JUnit 5
- Git
- GitHub
- GitHub Actions

---

## Estructura del proyecto

```text
automatizacion-pruebas/
│
├── .github/
│   └── workflows/
│       └── ci.yml
│
├── src/
│   ├── main/
│   │   └── java/
│   │       └── org/
│   │           └── example/
│   │               └── Calculadora.java
│   │
│   └── test/
│       └── java/
│           └── org/
│               └── example/
│                   └── CalculadoraTest.java
│
├── .gitignore
├── pom.xml
└── README.md
```

---

## Funcionalidades implementadas

La aplicación contiene una clase llamada `Calculadora` que implementa las siguientes operaciones:

- Suma de dos números.
- Resta de dos números.

---

## Pruebas unitarias

Las pruebas unitarias fueron implementadas utilizando JUnit 5.

### Prueba de suma

Se verifica que la suma de los números 5 y 3 sea igual a 8.

### Prueba de resta

Se verifica que la resta de los números 10 y 4 sea igual a 6.

Las pruebas fueron diseñadas de manera atómica e independiente, permitiendo validar cada funcionalidad por separado.

---

## Ejecución de pruebas

Las pruebas pueden ejecutarse desde IntelliJ IDEA o mediante Maven.

Para ejecutar las pruebas desde la terminal se utiliza el siguiente comando:

```bash
./mvnw.cmd test
```

Este comando compila el proyecto y ejecuta automáticamente las pruebas unitarias.

---

## Control de versiones

Para el desarrollo del proyecto se utilizó Git como sistema de control de versiones.

Se creó una rama para trabajar en la implementación de las pruebas unitarias:

```text
feature/pruebas-unitarias
```

Durante el desarrollo se realizaron commits para registrar los cambios realizados.

Posteriormente, los cambios fueron integrados con la rama principal `main`.

---

## Integración Continua

Se configuró un pipeline de Integración Continua utilizando GitHub Actions.

El archivo de configuración del pipeline se encuentra en:

```text
.github/workflows/ci.yml
```

El pipeline se ejecuta automáticamente cuando se realiza un `push` al repositorio.

Las principales acciones realizadas por el pipeline son:

1. Descargar el código del repositorio.
2. Configurar Java 17.
3. Compilar el proyecto.
4. Ejecutar las pruebas unitarias.
5. Generar los reportes de pruebas.
6. Guardar los reportes como un Artifact en GitHub Actions.

---

## Resultados de las pruebas

Las pruebas unitarias fueron ejecutadas correctamente tanto de forma local como mediante el pipeline de GitHub Actions.

Resultados obtenidos:

- Tests ejecutados: 2
- Fallos: 0
- Errores: 0
- Pruebas exitosas: 2

El proceso de compilación finalizó correctamente con:

```text
BUILD SUCCESS
```

El pipeline de GitHub Actions también finalizó con estado:

```text
Success
```

---

## Reportes de pruebas

Los resultados de las pruebas son generados durante la ejecución del proyecto.

El pipeline de GitHub Actions guarda los reportes generados como un Artifact llamado:

```text
reporte-pruebas
```

Este Artifact permite descargar y revisar los resultados generados durante la ejecución automática del pipeline.

---

## Flujo de trabajo realizado

El flujo de trabajo del proyecto fue el siguiente:

1. Creación del proyecto Maven.
2. Configuración de Java y Maven.
3. Implementación de la clase `Calculadora`.
4. Implementación de pruebas unitarias con JUnit 5.
5. Ejecución local de las pruebas.
6. Creación de una rama para las pruebas unitarias.
7. Registro de cambios mediante Git.
8. Integración de los cambios en la rama principal.
9. Creación del repositorio remoto en GitHub.
10. Configuración del pipeline de Integración Continua.
11. Ejecución automática de las pruebas mediante GitHub Actions.
12. Generación y almacenamiento de reportes de pruebas.

---

## Conclusión

El proyecto permitió implementar un flujo básico de automatización de pruebas utilizando herramientas de desarrollo modernas.

Mediante JUnit 5 se realizaron pruebas unitarias para validar las funcionalidades de la calculadora. Maven permitió gestionar las dependencias y ejecutar las pruebas, mientras que Git permitió mantener el control de versiones del proyecto.

Finalmente, GitHub Actions permitió implementar un proceso de Integración Continua, ejecutando automáticamente las pruebas y almacenando los resultados como reportes.

Este flujo permite detectar errores de forma temprana y mantener un proceso de desarrollo más automatizado y confiable.
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


## Simulación de sesión Three Amigos

Para definir y validar la funcionalidad de la calculadora se realizó una simulación de una sesión **Three Amigos**.

Esta técnica permite reunir diferentes perspectivas antes de implementar y automatizar las pruebas de una funcionalidad.

### Participantes y roles

#### Product Owner

Representa las necesidades del usuario y define el comportamiento esperado de la funcionalidad.

En esta simulación, el Product Owner definió la siguiente necesidad:

> Como usuario, quiero realizar operaciones de suma y resta para obtener resultados matemáticos correctos.

### Desarrollador

Es responsable de analizar la implementación técnica de la funcionalidad.

Durante la sesión se definió que la clase `Calculadora` debía contener métodos independientes para las operaciones:

- `sumar()`
- `restar()`

Cada método recibe dos números como parámetros y devuelve el resultado correspondiente.

### QA / Tester

Es responsable de definir los criterios de aceptación y los escenarios que permitirán comprobar que la funcionalidad cumple con los requisitos.

Se propusieron pruebas automatizadas unitarias y escenarios BDD para validar las operaciones.

---

## Criterios de aceptación

Durante la sesión se definieron los siguientes criterios de aceptación:

1. La calculadora debe sumar correctamente dos números.
2. La calculadora debe restar correctamente dos números.
3. Cada operación debe poder validarse de manera independiente.
4. Los resultados obtenidos deben coincidir con los valores esperados.
5. Las pruebas automatizadas deben ejecutarse correctamente de forma local.
6. Las pruebas deben ejecutarse automáticamente mediante el pipeline de Integración Continua.

---

## Ejemplos discutidos

Durante la simulación se analizaron los siguientes ejemplos:

### Ejemplo 1: Suma

**Dado** que el usuario tiene los números 5 y 3.

**Cuando** realiza una operación de suma.

**Entonces** el resultado debe ser 8.

### Ejemplo 2: Resta

**Dado** que el usuario tiene los números 10 y 4.

**Cuando** realiza una operación de resta.

**Entonces** el resultado debe ser 6.

### Ejemplo 3: Diferentes valores de resta

También se consideraron diferentes combinaciones de números para validar que la operación de resta funcione correctamente con distintos valores.

Estos ejemplos fueron utilizados posteriormente para definir escenarios automatizados utilizando Gherkin y Cucumber.

---

## Resultado de la sesión

La simulación Three Amigos permitió definir de manera conjunta el comportamiento esperado de la calculadora desde tres perspectivas diferentes:

- **Negocio:** necesidad y comportamiento esperado.
- **Desarrollo:** implementación técnica de las operaciones.
- **Testing:** criterios de aceptación y escenarios de prueba.

Como resultado, se obtuvo una definición clara de la funcionalidad antes de su automatización, facilitando la creación de pruebas unitarias y escenarios BDD.

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
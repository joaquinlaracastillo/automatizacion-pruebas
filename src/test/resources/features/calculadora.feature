Feature: Operaciones de la calculadora
  Como usuario de una calculadora
  Quiero realizar operaciones matemáticas básicas
  Para obtener resultados correctos

  Scenario: Sumar dos números
    Given tengo una calculadora
    When sumo 5 y 3
    Then el resultado debe ser 8

  Scenario Outline: Restar diferentes números
    Given tengo una calculadora
    When resto <numero1> y <numero2>
    Then el resultado debe ser <resultado>

    Examples:
      | numero1 | numero2 | resultado |
      | 10      | 4       | 6         |
      | 20      | 5       | 15        |
      | 8       | 3       | 5         |
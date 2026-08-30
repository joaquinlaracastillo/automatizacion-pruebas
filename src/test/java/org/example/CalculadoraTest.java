package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {

    @Test
    void debeSumarDosNumerosCorrectamente() {
        Calculadora calculadora = new Calculadora();

        int resultado = calculadora.sumar(5, 3);

        assertEquals(8, resultado);
    }

    @Test
    void debeRestarDosNumerosCorrectamente() {
        Calculadora calculadora = new Calculadora();

        int resultado = calculadora.restar(10, 4);

        assertEquals(6, resultado);
    }
}
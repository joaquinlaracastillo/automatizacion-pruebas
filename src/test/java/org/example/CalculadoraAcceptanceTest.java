package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraAcceptanceTest {

    @Test
    void usuarioPuedeRealizarUnaSuma() {

        CalculadoraService servicio = new CalculadoraService();

        int resultado = servicio.sumar(20, 10);

        assertEquals(30, resultado);
    }

    @Test
    void usuarioPuedeRealizarUnaResta() {

        CalculadoraService servicio = new CalculadoraService();

        int resultado = servicio.restar(20, 5);

        assertEquals(15, resultado);
    }
}
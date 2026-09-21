package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraIntegrationTest {

    @Test
    void debeIntegrarServicioConCalculadoraParaSumar() {

        CalculadoraService servicio = new CalculadoraService();

        int resultado = servicio.sumar(10, 5);

        assertEquals(15, resultado);
    }

    @Test
    void debeIntegrarServicioConCalculadoraParaRestar() {

        CalculadoraService servicio = new CalculadoraService();

        int resultado = servicio.restar(10, 4);

        assertEquals(6, resultado);
    }
}
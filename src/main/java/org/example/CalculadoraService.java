package org.example;

public class CalculadoraService {

    private final Calculadora calculadora;

    public CalculadoraService() {
        this.calculadora = new Calculadora();
    }

    public int sumar(int a, int b) {
        return calculadora.sumar(a, b);
    }

    public int restar(int a, int b) {
        return calculadora.restar(a, b);
    }
}
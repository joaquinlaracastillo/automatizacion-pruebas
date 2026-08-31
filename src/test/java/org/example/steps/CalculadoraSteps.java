package org.example.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Calculadora;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraSteps {

    private Calculadora calculadora;
    private int resultado;

    @Given("tengo una calculadora")
    public void tengo_una_calculadora() {
        calculadora = new Calculadora();
    }

    @When("sumo {int} y {int}")
    public void sumo_dos_numeros(int numero1, int numero2) {
        resultado = calculadora.sumar(numero1, numero2);
    }

    @When("resto {int} y {int}")
    public void resto_dos_numeros(int numero1, int numero2) {
        resultado = calculadora.restar(numero1, numero2);
    }

    @Then("el resultado debe ser {int}")
    public void el_resultado_debe_ser(int resultadoEsperado) {
        assertEquals(resultadoEsperado, resultado);
    }
}
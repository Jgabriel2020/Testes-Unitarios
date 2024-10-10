package tech.angelofdiasg.unittests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tech.angelofdiasg.calculadora.Calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorTestFixtures {

    private Calculator calculator;
    private int positiveNumber;
    private int zeroNumber;
    private int negativeNumber;

    // Configuração que ocorre antes de cada teste
    @BeforeEach
    void setUp() {
        calculator = new Calculator();     // Instância da calculadora
        positiveNumber = 5;                // Número positivo para testar fatorial
        zeroNumber = 0;                    // Número zero para testar fatorial
        negativeNumber = -1;               // Número negativo para testar exceção
    }

    // Teste para o fatorial de um número positivo
    @Test
    void testFatorialPositive() {
        assertEquals(120, calculator.factorial(positiveNumber));  // 5! = 120
    }

    // Teste para o fatorial de zero
    @Test
    void testFatorialZero() {
        assertEquals(1, calculator.factorial(zeroNumber));        // 0! = 1
    }

    // Teste para fatorial de um número negativo, que deve lançar exceção
    @Test
    void testFatorialNegative() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.factorial(negativeNumber);  // Exceção para número negativo
        }, "Fatorial não definido para números negativos");
    }

    @Test
    void testFatorialMultipleNumbers() {
        // Reutilizando o mesmo objeto calculator e testando outros valores
        assertEquals(120, calculator.factorial(positiveNumber));  // 5! = 120
        assertEquals(6, calculator.factorial(3));                 // 3! = 6
        assertEquals(24, calculator.factorial(4));                // 4! = 24
        assertEquals(1, calculator.factorial(zeroNumber));        // 0! = 1
    }
}
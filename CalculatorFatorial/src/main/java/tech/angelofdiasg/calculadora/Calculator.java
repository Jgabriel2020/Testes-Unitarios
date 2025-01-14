package tech.angelofdiasg.calculadora;

public class Calculator {

    public int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Negative number");
        }
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}


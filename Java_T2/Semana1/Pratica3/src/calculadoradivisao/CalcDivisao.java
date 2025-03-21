package calculadoradivisao;

public class CalculadoraDivisao {

    public static int somar(int a, int b) {
        return a + b;
    }

    public static int subtrair(int a, int b) {
        return a - b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static int efetuarDivisaoInteira(int dividendo, int divisor) throws DivisaoPorZeroException {
        if (divisor == 0) {
            throw new DivisaoPorZeroException("Divisão por zero não é permitida.");
        }
        return dividendo / divisor;
    }

    public static float efetuarDivisao(float dividendo, float divisor) throws DivisaoPorZeroException {
        if (divisor == 0.0f) {
            throw new DivisaoPorZeroException("Divisão por zero não é permitida.");
        }
        return dividendo / divisor;
    }

    public static void main(String[] args) {
        try {
            int resultadoDivisaoInteira = efetuarDivisaoInteira(10, 2);
            System.out.println("Resultado da Divisão de Inteiros: " + resultadoDivisaoInteira);

            float resultadoDivisaoFloat = efetuarDivisao(10.0f, 2.0f);
            System.out.println("Resultado da Divisão de Floats: " + resultadoDivisaoFloat);
        } catch (DivisaoPorZeroException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}

class DivisaoPorZeroException extends Exception {
    private static final long serialVersionUID = 1L;

    public DivisaoPorZeroException(String message) {
        super(message);
    }
}


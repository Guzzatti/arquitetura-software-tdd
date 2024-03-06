public class calculo {
    public static int Soma(int a, int b) {
        return a + b;
    }

    public static int Subtracao(int a, int b) {
        return a - b;
    }

    public static int Multiplicacao(int a, int b) {
        return a * b;
    }

    public static float Divisao(float a, float b) {
        if(b == 0) {
            throw new ArithmeticException("Divisão por zero.");
        }
        return a / b;
    }
}

public class calculation {
    public static int Sum(int a, int b) {
        return a + b;
    }

    public static int Subtraction(int a, int b) {
        return a - b;
    }

    public static int Multiplication(int a, int b) {
        return a * b;
    }

    public static float Division(float a, float b) {
        if(b == 0) {
            throw new ArithmeticException("Divisão por zero.");
        }
        return a / b;
    }
}

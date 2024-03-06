import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class testCalculator {
    public testCalculator() {
    }

    @Test
    public void testSoma(){
        System.out.println("Soma");
        int a = 10;
        int b = 20;
        int expResult = 30;
        int result = calculo.Soma(a, b);
        assertEquals(expResult, result);
    }

    @Test
    public void testSubtracao(){
        System.out.println("Subtração");
        int a = 20;
        int b = 10;
        int expResult = 10;
        int result = calculo.Subtracao(a, b);
        assertEquals(expResult, result);
    }

    @Test
    public void testMultiplicacao(){
        System.out.println("Multiplicação");
        int a = 5;
        int b = 10;
        int expResult = 50;
        int result = calculo.Multiplicacao(a, b);
        assertEquals(expResult, result);
    }

    @Test
    public void testDivisao(){
        System.out.println("Divisão");
        float a = 20;
        float b = 10;
        float expResult = 2.0f;
        float result = calculo.Divisao(a, b);
        assertEquals(expResult, result, 0);
    }
}

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class testCalculator {
    public testCalculator() {
    }

    @Test
    public void testSumSucess(){
        System.out.println("Teste Soma Correta");
        int a = 10;
        int b = 20;
        int expResult = 30;
        int result = calculation.Sum(a, b);
        assertEquals(expResult, result);
    }
    /*
    @Test
    public void testSumFailed(){
        System.out.println("Teste Soma incorreta");
        int a = 10;
        int b = 25;
        int expResult = 30;
        int result = calculation.Sum(a, b);
        assertEquals(expResult, result);
    }
    */
    @Test
    public void testSubtractionSucess(){
        System.out.println("Teste Subtração Correta");
        int a = 20;
        int b = 10;
        int expResult = 10;
        int result = calculation.Subtraction(a, b);
        assertEquals(expResult, result);
    }

    @Test
    public void testMultiplicationSucess(){
        System.out.println("Teste Multiplicação Correta");
        int a = 5;
        int b = 10;
        int expResult = 50;
        int result = calculation.Multiplication(a, b);
        assertEquals(expResult, result);
    }

    @Test
    public void testDivisionSucess(){
        System.out.println("Teste Divisão Correta");
        float a = 20;
        float b = 10;
        float expResult = 2.0f;
        float result = calculation.Division(a, b);
        assertEquals(expResult, result, 0);
    }
}

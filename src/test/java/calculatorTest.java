import com.mycompany.calculator.operaciones;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author 52981
 */
public class calculatorTest {
    
    public calculatorTest() {
    }
    operaciones calculator1 = new operaciones();
    @Test
    public void testSuma1(){
        assertEquals(5, calculator1.suma(2, 3));
    }
    @Test
    public void testSuma2(){
        assertEquals(6, calculator1.suma(3,3));
    }
    @Test
    public void testResta1(){
        assertEquals(2, calculator1.resta(5, 3));
    }
    @Test
    public void testResta2(){
        assertEquals(3, calculator1.resta(6, 3));
    }
    @Test
    public void testMultiplicacion1(){
        assertEquals(6, calculator1.multiplicacion(2, 3));
    }
    @Test
    public void testMultiplicacion2(){
        assertEquals(9, calculator1.multiplicacion(3,3));
    }
    @Test
    public void testDivision1(){
        assertEquals(1, calculator1.division(5, 3));
    }
    @Test
    public void testDivision2(){
        assertEquals(2, calculator1.division(6, 3));
    }
    
    
}

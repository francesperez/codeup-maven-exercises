import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class MyFirstTest {

    @Test
    public void additionalMethodTest() {
        int input1 = 20;
        int input2 = 30;
        int expected = 50;
        assertEquals(expected, MathOperations.add(input1, input2));
    }

}

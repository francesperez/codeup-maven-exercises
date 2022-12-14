import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class MyFirstTest {
//    ArrayList<Integer> arrayList = new ArrayList<>();
//    ArrayList<Integer> arrayList2 = new ArrayList<>();
//
//    @Before
//    public void setUpValues(){
//    //you can use the before annotation to run a method before any of the tests run.
//        arrayList.add(1);
//        arrayList.add(2);
//        arrayList2.add(1);
//        arrayList2.add(2);
//    }
//
//    @Test
//    public void testObjectSameness(){
//        //this will fail. because the values are in the setUpValues method, which were already initialized in with
//        // the before annotation.
//        assertSame(arrayList,arrayList2);
//    }
//
//    @Test
//    public void additionMethodTest() {
//        int input1 = 20;
//        int input2 = 30;
//        int expected = 50;
//        assertEquals(expected, MathOperations.add(input1, input2));
//    }
//
//    @Test
//    public void tipAppTest(){
//        double cost = 22.56;
//        double tipPercentage = 20;
//        double expected = 4.51;
//        assertEquals(expected, MathOperations.tip(cost, tipPercentage), 0.01);
//    }
//
//    @Test
//    public void testArrayExpected(){
//        int[] startArray = {1,2,3,4,5};
//        int[] endArray = {2,3,4,5,6};
//        assertArrayEquals(endArray, MathOperations.addOneToArray(startArray));
//    }

    @Test
    public void codeupSameness(){
        String c1 = "Codeup";
        String c2 = "CodeUp";
        assertNotEquals(c1, c2);
    }

    @Test
    public void arraySameness(){
        List<String> languages = new ArrayList<>();
        List<String> moreLanguages = new ArrayList<>();
        assertNotSame(languages,moreLanguages);
    }

    @Test
    public void areTheyEqual(){
        int[] numbers = {1, 2, 3};
        int[] otherNumbers = new int[3];
        otherNumbers[0] = 1;
        otherNumbers[1] = 2;
        otherNumbers[2] = 3;
        assertArrayEquals(numbers,otherNumbers);
    }

    @Test
    public void trueORfalse(){
        String language = "PHP";
        assertTrue(language.contains("H"));
        assertFalse(language.contains("J"));
    }

}

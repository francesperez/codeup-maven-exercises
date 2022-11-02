public class MathOperations {

    public static long add(long input1, long input2){
        return input1 + input2;
    }

    public static double tip(double cost, double tipPercentage){
        return cost * (tipPercentage / 100);
    }


    public static int[] addOneToArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            array[i] += 1;
        }
        return array;
    }
}

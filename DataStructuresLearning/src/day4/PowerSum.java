package day4;

import java.util.Arrays;

public class PowerSum {
    public static void main(String[] args) {
        var array = new Object[]{1,2,new Object[]{7,new int[]{3,4},2}};
        var result = sumOfArray(1,array);
        System.out.println(result);
    }
    public static int sumOfArray(int depth,Object... array) {
        int sum = 0;
        for (var i = 0;i < array.length; i++) {
            if(array[i] instanceof Integer number)
                sum += number;
            else {
                var result = 0;
                if (array[i] instanceof int[] intArray) {
                    result = sumOfArray(depth+1, Arrays.stream(intArray).mapToObj(o -> o).toArray());
                }
                else if (array[i] instanceof  Object[] objectArray) {
                    result = sumOfArray(depth+1, objectArray);
                }
                sum += result;
            }
        }
        return (int) Math.pow(sum,depth);
    }
}

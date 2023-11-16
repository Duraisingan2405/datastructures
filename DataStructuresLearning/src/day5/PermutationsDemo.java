package day5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationsDemo {
    private static final List<int[]> listArray = new ArrayList<>();

    public static void main(String[] args) {
        var testArray = new int[]{1,2,3};
        permutations(testArray);
    }
    private static void permutations(int[] testArray){
         permutations(testArray,0);
    }
    private static void permutations(int[] array, int i) {
        if ( i == array.length - 1) {
            listArray.add(Arrays.copyOfRange(array,0,array.length));
        }
        for (int j = i; j < array.length; j++) {
            var temp1 = array[j];
            array[j] = array[i];
            array[i] = temp1;
            permutations(array,i+1);
            var temp2 = array[j];
            array[j] = array[i];
            array[i] = temp2;
        }
    }
}

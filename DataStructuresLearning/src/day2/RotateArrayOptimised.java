package day2;

import java.util.Arrays;

public class RotateArrayOptimised {
    public static void main(String[] args) {
        var result = rotateArray(new int[]{1,2,3,4,5},2);
        System.out.println(result);
    }
    public static int[] rotateArray(int[] testArray,int k) {
        if(testArray.length == 0) {
            return testArray;
        }
        var modulo = testArray.length / k;
        reverseArray(testArray,0,testArray.length-1); //5 4 3 2 1
        reverseArray(testArray,0,modulo - 1);
        reverseArray(testArray,modulo,testArray.length-1);
        return testArray;
    }
    public static void reverseArray(int[] targetArray, int start, int end) {
        while (start <  end) {
            var rightElm = targetArray[end];
            var leftElm = targetArray[start];
            targetArray[end] = leftElm;
            targetArray[start] = rightElm;
            start++;
            end--;
        }
    }
}

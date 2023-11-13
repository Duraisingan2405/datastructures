package day2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RotateArrayNrml {
    public static void main(String[] args) {
        var testArray = new int[]{};
        var k = 3; // rotations
        var result = rotateArray(testArray,k);
    }

    public static int[] rotateArray(int[] testArray, int k) {
        if (testArray.length == 0) {
            return testArray;
        }
        var modulo = k % testArray.length;
        var temp = Arrays.copyOfRange(testArray,testArray.length - modulo,testArray.length);
        for (var i = 0;i < testArray.length - modulo;i++) {
            testArray[testArray.length-1-i] = testArray[modulo - i]; //adding from the reverse to ensure the because wee are cahnging in the existing array
        }
        for (var i = 0;i < modulo;i++) {
            testArray[i] = temp[i];
        }
        return testArray;
    }
}

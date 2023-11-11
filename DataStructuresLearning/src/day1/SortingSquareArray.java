package day1;


import java.util.Arrays;

public class SortingSquareArray {
    public static void main(String[] args) {
         var result1 =  sortArraySquaredNormalImpl(new int[] {-7,-6,1,2,4});
         Arrays.stream(result1).forEach(System.out::println);
         var result2 =  sortArraySquaredOptimised(new int[] {-7,-6,1,2,4});
         Arrays.stream(result2).forEach(System.out::println);
    }
    public static int[] sortArraySquaredNormalImpl(int[] testArray) {
        var resultArray = new int[testArray.length];
        for(var i  = 0; i < testArray.length; i++) {
            resultArray[i] = (int) Math.pow(testArray[i],2);
        }
        Arrays.sort(resultArray);
        return resultArray;
    }
    public static int[] sortArraySquaredOptimised(int[] testArray) {
        var resultArray = new int[testArray.length];
        var leftPointer = 0;
        var rightPointer = testArray.length -1;
        for(var i  = testArray.length -1; i >= 0 ; i--) {
           if (Math.pow(testArray[rightPointer],2) > Math.pow(testArray[leftPointer],2)) {
               resultArray[i] = (int) Math.pow(testArray[rightPointer],2);
               rightPointer --;
           }
           else {
               resultArray[i] = (int) Math.pow(testArray[leftPointer],2);
               leftPointer ++;
           }
        }
        return resultArray;
    }
}

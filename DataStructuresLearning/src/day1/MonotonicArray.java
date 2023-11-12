package day1;

public class MonotonicArray {
    public static void main(String[] args) {
         var result1 = checkMonotonic(new int[]{1,2,3,4,5});
         var result2 = checkMonotonic(new int[]{5,4,3,2,1});
         var result3 = checkMonotonic(new int[]{});
         var result4 = checkMonotonic(new int[]{4});
         System.out.println(result1);
         System.out.println(result2);
         System.out.println(result3);
         System.out.println(result4);
    }
    public static boolean checkMonotonic(int[] testArray) {

        if(testArray.length > 0) {
            var firstElm = testArray[0];
            var lastElm = testArray[testArray.length - 1];

            if (firstElm == lastElm) {
                for (var i = 0; i < testArray.length - 1; i++) {
                    if (testArray[i] != testArray[i + 1]) {
                        return false;
                    }
                }
            } else if (firstElm > lastElm) {
                for (var i = 0; i < testArray.length - 1; i++) {
                    if (testArray[i] < testArray[i + 1]) {
                        return false;
                    }
                }
            } else {
                for (var i = 0; i < testArray.length - 1; i++) {
                    if (testArray[i] > testArray[i + 1]) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}


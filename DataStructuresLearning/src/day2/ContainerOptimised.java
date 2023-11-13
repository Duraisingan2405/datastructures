package day2;

public class ContainerOptimised {
    public static void main(String[] args) {
            var result = getMaximumArea(new int[]{3,7,5,6,8,4});
            System.out.println(result);
    }
        public static int getMaximumArea(int[] containerArray) {
            int area = 0;
            int leftPointer = 0;
            int rightPointer = containerArray.length - 1;
            while (leftPointer < rightPointer) {
                 var calculatedResult = Math.min(containerArray[leftPointer],containerArray[rightPointer]) * (rightPointer - leftPointer);
                 if (calculatedResult > area)
                     area = calculatedResult;
                 if (containerArray[leftPointer] < containerArray[rightPointer])
                     leftPointer++;
                 else
                     rightPointer--;
            }
            return area;
        }
}

package day3;

public class TwoSumNrml {
    public static void main(String[] args) {
        var result = getPair(new int[]{2,7,3,-1,4},2);
        System.out.println(result[0]+","+result[1]);
    }
    public static int[] getPair(int[] testArray,int targetValue) {
        for (int i = 0; i < testArray.length; i ++) {
            for (int j = i + 1; j < testArray.length; j++) {
                if ((testArray[i]+testArray[j]) == targetValue){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
}

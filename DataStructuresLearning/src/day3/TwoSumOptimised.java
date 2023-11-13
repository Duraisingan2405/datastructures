package day3;

import java.util.Hashtable;

public class TwoSumOptimised {
    public static void main(String[] args) {
        var result = getPair(new int[]{1,-2,3,4,5},3);
        System.out.println(result[0]+","+result[1]);
    }
    public static int[] getPair(int[] testArray,int targetValue) {
        Hashtable<Integer,Integer> integerHashtable = new Hashtable<>();
        for (var i = 0; i < testArray.length; i++) {
          //  if(!integerHashtable.containsKey(testArray[i])) {  not required but if want to ensure we should not override the index again we can keep
                integerHashtable.put(testArray[i],i);
                var requiredNum = targetValue - testArray[i];
                var result = integerHashtable.getOrDefault(requiredNum,null);
                if (result != null) {
                    return new int[]{integerHashtable.get(testArray[i]),result};
                }
          //  }
        }
        return new int[]{};
    }
}

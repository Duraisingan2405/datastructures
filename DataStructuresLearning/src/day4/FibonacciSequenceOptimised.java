package day4;

import java.util.HashMap;

public class FibonacciSequenceOptimised {
    private static HashMap<Integer,Integer> numberLookup = new HashMap<>(){{  //initialised globally because if it is initialized iniside the method it has to reinitialize for every recursive call
       put(0,0);
       put(1,1);
    }};

    public static void main(String[] args) {
         var result = fibonacci(20);
         System.out.println(result);
    }
    public static int fibonacci(int number) {

        if(!numberLookup.containsKey(number)) {
            var result = fibonacci(number -1) + fibonacci(number - 2);
            numberLookup.put(number,result);
            return result;
        }
        else {
            return numberLookup.get(number);
        }
    }
}

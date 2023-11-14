package day4;

public class FibonacciSequence {
    public static void main(String[] args) {
        var result =  fibonacci(10);
        System.out.println(result);
    }
    public static int fibonacci(int number) {
        if(number <= 1 ) {
            return number;
        }
        return fibonacci(number -1 ) + fibonacci(number - 2);
    }
}

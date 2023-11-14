package day4;

public class FibonacciIteration {
    public static void main(String[] args) {
        var result = fibonacci(1000);
        System.out.println(result);
    }
    public static int fibonacci(int number) {
        int prev = 0;
        int next = 1;
        int count = 1;
        int current = prev + next;
        while (count <  number) {
            current = prev + next;
            prev = next;
            next = current;
            count ++;
        }
        return current;
    }
}

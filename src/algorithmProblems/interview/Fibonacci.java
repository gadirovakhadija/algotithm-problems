package algorithmProblems.interview;

public class Fibonacci {


    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static int fibonacci2(int n) {
        int first = 0;
        int second = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(" "  + first);
            int next = first + second;

            first = second;
            second = next;

        }
        return first;
    }

    public static void main(String[] args) {
        System.out.println( fibonacci2(10));;
    }
}

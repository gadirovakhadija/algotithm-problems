package algorithmProblems.interview;

public class Factorial {

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int result = 1;

        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static int fact(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        int result = fact(n - 1) * n;//3
        return result;
    }

    public static void main(String[] args) {
        System.out.println(fact(4));
    }

}

package algorithmProblems.CodingChallenge;

public class Factorial {
    public static int factLoop(int n){
        int result = 1;
        if (n==0||n==1){
            return 1;
        }else {
            for (int i = n; i > 0; i--) {
                result *= i;
            }
            return result;
        }
    }
    public static int factRecursion(int n){
        if (n==0||n==1){
            return 1;
        }else {
            return n*factRecursion(n-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(factRecursion(5));
    }
}

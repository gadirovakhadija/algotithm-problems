import algorithmProblems.LeetCode.TwoSum;

public class Main {

    public static int fib(int n) {
        int before = 0;
        int current = 1;
        for (int i = 0; i < n; i++) {
            int next = before + current;
            before = current;
            current = next;
//            System.out.println(before);
        }
        return before;
    }
public static int factorial(int n){
        int result = 1;
        for (int i=n;i>1;i--){
         result*=i;
        }
        return result;

}
public static int fact(int n){

        if (n==0||n==1){
            return 1;
        }

        return n*fact(n-1);

}
    public static int fibb(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibb(n) + fibb(n - 1);
        }
    }

    public static boolean isPalindr(int x) {
        int z = 0;
        int f = x;
        while (x != 0) {
            int t = x % 10;
            z = z * 10 + t;
            x /= 10;
        }
        if (f != z || f < 0) {
            return false;
        }
        return true;
    }

    public static boolean isPalindrome(int number){
        int newNumber=number;
        int t = 0;
        while(number!=0){
            int x = number%10;
            t=t*10+x;
            number/=10;

        }
        if (t==newNumber){
            return true;
        }
        return false;

    }



    public static void main(String[] args) {
        int[] n = new int[]{2,4,5,2,5};
        System.out.println(TwoSum.twoSum(n,7));
    }

}

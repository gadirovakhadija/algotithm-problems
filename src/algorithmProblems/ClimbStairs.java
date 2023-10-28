package algorithmProblems;

public class ClimbStairs {
    public int climbStairs(int n) {

        if (n <= 3) return n;

        int left = 0;
        int right = 1;
        for (int i = 0; i < n; i++) {
            int temp = right;
            right = left + right;
            left = temp;
        }

        return right;
    }
}

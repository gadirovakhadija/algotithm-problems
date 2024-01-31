package algorithmProblems.LeetCode;

public class IsPalindrome {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
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
}

package algorithmProblems.LeetCode;

import java.util.Arrays;

public class ValidPalindromeLetter {
    public static boolean isPalindrome(String s) {
        char[] c = s.toLowerCase().toCharArray();
        String s1 = "", s2 = "";
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(c[i])) {
                s1 += c[i];
            }
        }
        for (int i = c.length - 1; i >= 0; i--) {
            if (Character.isLetterOrDigit(c[i])) {
                s2 += c[i];
            }
        }
        return s1.equals(s2);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("Khadi12ja"));
    }
}

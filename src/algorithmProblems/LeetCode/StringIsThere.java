package algorithmProblems.LeetCode;

public class StringIsThere {

    public static boolean stringIsThere(String str1, String str2) {

        String bigger = str1.length() > str2.length() ? str1 : str2;
        String smaller = str1.length() > str2.length() ? str2 : str1;

        if (bigger.equals(smaller)) {
            return true;
        }

        if (!bigger.startsWith(smaller)) {
            return false;
        }

        return stringIsThere(bigger.substring(smaller.length()), smaller);

    }

}

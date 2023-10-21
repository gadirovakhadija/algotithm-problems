package algorithmProblems;

public class ReverseString {
    public static StringBuilder reverseString(String s) {
        StringBuilder reversed = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed.append(s.charAt(i));
        }
        return reversed;
    }

    public static String reverseString2(String str) {
        if (str == null) {
            return null;
        }

        StringBuilder reversed = new StringBuilder(str);

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {

            char temp = reversed.charAt(left);
            reversed.setCharAt(left, reversed.charAt(right));
            reversed.setCharAt(right, temp);

            left++;
            right--;
        }

        return reversed.toString();
    }

    public static void main(String[] args) {
        reverseString("khadija");
    }

}

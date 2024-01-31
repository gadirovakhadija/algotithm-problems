package algorithmProblems.LeetCode;

public class CountLetter {

    public static int countLetter(String s) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetter(c)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countLetter("sgdhwh23:6s"));
    }
}

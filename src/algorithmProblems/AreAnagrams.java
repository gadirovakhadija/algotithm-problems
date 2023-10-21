package algorithmProblems;

import java.util.Arrays;

public class AreAnagrams {
    public static boolean areAnagrams(String s1, String s2) {


        String trimmedS1 = s1.replace("//s", "").toLowerCase();
        String trimmedS2 = s2.replace("//s", "").toLowerCase();

        if (trimmedS1.length() != trimmedS2.length()) {
            return false;
        }
        char[] charS1 = trimmedS1.toCharArray();
        char[] charS2 = trimmedS2.toCharArray();

        Arrays.sort(charS1);
        Arrays.sort(charS2);
        return Arrays.equals(charS1, charS2);

    }

    public boolean areAnagrams2(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        int[] charCount = new int[26]; // Assuming only lowercase letters
        for (char c : s1.toCharArray()) {
            charCount[c - 'a']++;
        }
        for (char c : s2.toCharArray()) {
            if (charCount[c - 'a'] == 0) {
                return false;
            }
            charCount[c - 'a']--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(areAnagrams("khady", "hadyk"));
    }

}

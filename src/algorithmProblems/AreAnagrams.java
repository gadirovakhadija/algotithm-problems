package algorithmProblems;

public class AreAnagrams {
    public boolean areAnagrams(String s1, String s2) {
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

}

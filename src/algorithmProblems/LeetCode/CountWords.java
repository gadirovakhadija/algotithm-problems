package algorithmProblems.LeetCode;

public class CountWords {
    public int countWords(String s) {
        String[] words = s.split("\\s+");
        return words.length;
    }

}

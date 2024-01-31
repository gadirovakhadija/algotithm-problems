package algorithmProblems.LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindSubstring {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<>();
        int wordLength = words[0].length();
        int totalLength = wordLength * words.length;

        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        for (int i = 0; i <= s.length() - totalLength; i++) {
            String sub = s.substring(i, i + totalLength);
            Map<String, Integer> subCount = new HashMap<>();

            for (int j = 0; j < totalLength; j += wordLength) {
                String word = sub.substring(j, j + wordLength);
                subCount.put(word, subCount.getOrDefault(word, 0) + 1);
            }

            if (subCount.equals(wordCount)) {
                result.add(i);
            }
        }

        return result;
    }
}

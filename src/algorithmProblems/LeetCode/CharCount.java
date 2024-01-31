package algorithmProblems.LeetCode;

import java.util.*;

public class CharCount {

            public static void main(String[] args) {
                String sentence = "Cumlede herf sayini tap";
                Map<Character, Integer> charCountMap = new HashMap<>();

                for (char c : sentence.toCharArray()) {
                    if (Character.isLetter(c)) {
                        c = Character.toLowerCase(c);
                        charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
                    }
                }

                for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
                    System.out.println("Herf: " + entry.getKey() + ", Sayi: " + entry.getValue());
                }
            }
        }


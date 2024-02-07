package algorithmProblems.CodingChallenge.ArrayString;

import java.util.Arrays;

public class AnagramString {

    public static boolean anagramString(String string1, String string2){

        char[] c1 = string1.trim().toLowerCase().toCharArray();
        char[] c2 = string2.trim().toLowerCase().toCharArray();

        if (c1.length!=c2.length){
            return false;
        }
        Arrays.sort(c1);
        Arrays.sort(c2);

        return Arrays.equals(c1,c2);
    }

    public static void main(String[] args) {
        System.out.println(anagramString("xadica","Xadica1"));
    }
}

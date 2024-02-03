package algorithmProblems.CodingChallenge.Foundations;

public class PalindromeString {

    public static boolean palindromeLoop(String s){
        String reversed = "";
        for (int i=s.length()-1;i>=0;i--){
            reversed+=s.charAt(i);
        }
        if (s.equals(reversed)){
            return true;
        }
        return false;
    }


    public static boolean palindromeReversed(String s){
        if (s.equals(ReverseString.reverseStringLoop(s))){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(palindromeLoop("salas"));
    }
}

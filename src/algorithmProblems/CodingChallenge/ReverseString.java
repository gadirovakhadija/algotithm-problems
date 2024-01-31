package algorithmProblems.CodingChallenge;

import java.util.Stack;

public class ReverseString {

    public static String reverseStringLoop(String s){
        char[] charArray = s.toCharArray();
        String reversed= "";
        for (int i=charArray.length-1;i>=0;i--){
            reversed += charArray[i];
        }
        return reversed;
    }

    public static StringBuilder reverseStringBuilder(String s){
        StringBuilder reversed= new StringBuilder();

        for (int i=s.length()-1;i>=0;i--){
            reversed.append(s.charAt(i));
        }
        return reversed;
    }

    public static String reverseStringStack(String s){
        Stack<Character> stack = new Stack<>();
        String reversed ="";
        for (int i=0;i<s.length();i++){
            stack.add(s.charAt(i));
        }
        while (!stack.isEmpty()){
            reversed+=stack.pop();
        }
        return reversed;
    }

    public static void main(String[] args) {
        System.out.println(reverseStringStack("khadija"));
    }
}

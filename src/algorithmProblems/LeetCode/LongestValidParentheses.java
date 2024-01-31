package algorithmProblems.LeetCode;

import java.util.Stack;

public class LongestValidParentheses {
    public static int longestValidParentheses(String s) {
        Stack<Integer> parantheses = new Stack<>();
        int ans = 0;
        parantheses.push(-1);

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                parantheses.push(i);
            } else if (c == ')') {
                parantheses.pop();
                if (parantheses.isEmpty()) {
                    parantheses.push(i);
                }else {
                    ans=Math.max(ans,i-parantheses.peek());
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(longestValidParentheses("()((())"));
    }
}

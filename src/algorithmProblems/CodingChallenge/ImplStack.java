package algorithmProblems.CodingChallenge;

import java.util.Stack;

public class ImplStack {

    public static int[] implStackReverseArr(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int[] reverseArr = new int[arr.length];

        for (int j : arr) {
            stack.add(j);
        }

        for (int i = 0; i < arr.length; i++) {
            reverseArr[i] = stack.pop();
        }
        return reverseArr;
    }

    public static void main(String[] args) {
        int[] newArr = new int[]{2, 4, 3, 2, 2, 2};
        printArray(implStackReverseArr(newArr));
    }

    static void printArray(int[] array) {
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

}

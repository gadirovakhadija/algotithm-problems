package algorithmProblems.LeetCode;

import java.util.Arrays;

public class MaxAndMin {

    public static int findMax(int[] numbers) {

        int max = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }
        return max;
    }

    public static int findMax2(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length - 1];
    }


    public static int findMin(int[] numbers) {
        int min = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (min > numbers[i]) {
                min = numbers[i];
            }
        }
        return min;
    }

    public static int findMin2(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[0];
    }

    public static void main(String[] args) {
        System.out.println(findMin2(new int[]{4, 2, -9, 2, 4, 8, 1}));
    }

}

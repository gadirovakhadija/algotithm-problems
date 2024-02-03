package algorithmProblems.CodingChallenge.ArrayString;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDublArr {
    public static int[] removeDublArr(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            Arrays.stream(arr).distinct().toArray();
        }
        return arr;
    }

    public static int[] removeDublArrStream(int[] arr) {
        return Arrays.stream(arr).distinct().toArray();

    }

    public static int[] removeDublArrStreamSet(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        int[] nums = new int[set.size()];
        int i = 0;
        for (int num : set) {
            nums[i++] = num;
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] newArr1 = new int[]{2, 2, 3, 2, 2, 2, 3, 5, 2, 6, 3, 2, 6, 3, 5};
        System.out.println(removeDublArrStream(newArr1));
    }

}

package algorithmProblems;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MergeSortedArray {
    public static void mergeSortedArray(int[] nums1, int m, int[] nums2, int n) {

        List<Integer> numbers = new LinkedList<>();

        for (int i = 0; i < m; i++) {
            numbers.add(nums1[i]);
        }
        for (int i = 0; i < n; i++) {
            numbers.add(nums2[i]);
        }

        Collections.sort(numbers);
        System.out.println(numbers);
    }

    public static void mergeSortedArray2(int[] nums1, int m, int[] nums2, int n) {

        for (int j = 0, i = m; j < n; j++) {
            nums1[i] = nums2[j];
            i++;
        }
        Arrays.sort(nums1);


    }

    public static int[] mergeTwoArray(int[] nums1, int[] nums2) {
        int num1Length = nums1.length;
        nums1 = new int[num1Length + nums2.length];
        for (int j = 0, i = num1Length; i < num1Length; j++) {
            nums1[i] = nums2[j];
            num1Length++;
        }
        return nums1;
    }

    public static void main(String[] args) {
        int[] num1 = new int[]{1, 2, 3, 0, 0, 0};
        int[] num2 = new int[]{2, 5, 6};

        System.out.println(mergeTwoArray(num1, num2));

    }
}

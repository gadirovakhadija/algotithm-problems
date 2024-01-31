package algorithmProblems.LeetCode;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MedianSortedArray {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Double> list = new LinkedList<>();
        double answer;
        for (double num : nums1) {
            list.add(num);
        }
        for (double num : nums2) {
            list.add(num);
        }
        Collections.sort(list);
        Double[] array = list.toArray(new Double[0]);
        int arraySize = array.length;
        if (arraySize % 2 != 0) {
            int index = (arraySize - 1) / 2;
            answer = array[index];
        } else {
            int index = arraySize / 2;
            int index2 = index - 1;

            answer = (array[index] + array[index2]) / 2;
        }
        return answer;
    }


    public static void main(String[] args) {
        int[] num1 = {4, 5, 6, 2, 10,44,6};
        int[] num2 = {3, 3, 8, 9, 7, 8,7};

        System.out.println(findMedianSortedArrays(num1, num2));
    }
}

package algorithmProblems.LeetCode;

public class FirstLastPosition {

    public int[] searchRange(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        boolean checkStart = false;
        boolean checkEnd = false;
        while (start <= end) {
            if (nums[start] == target && !checkStart) {
                checkStart = true;
            }
            if (nums[end] == target && !checkEnd) {
                checkEnd = true;
            }
            if (!checkStart) {
                start++;
            }
            if (!checkEnd) {
                end--;
            }
            if (checkEnd && checkStart) {
                return new int[]{start, end};
            }
        }
        return new int[]{-1, -1};
    }
}

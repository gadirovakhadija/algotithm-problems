package algorithmProblems.CodingChallenge.ArrayString;

public class RotateArrStep {

    public static void rotateArray(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // in case k is greater than array length

        reverse(nums, 0, n - 1);

        reverse(nums, 0, k - 1);

        reverse(nums, k, n - 1);
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        rotateArray(nums, k);

        // Print the rotated array
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

}

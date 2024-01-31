package algorithmProblems.LeetCode;

public class FindMissingNumber {
    public static void main(String[] args) {
        // Original array from 1 to 10
        int[] originalArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Delete one number, let's say 7
        int[] modifiedArray = {1, 2, 3, 4, 5, 6, 8, 9, 10};

        // Find the missing number
        int missingNumber = findMissingNumber( modifiedArray);

        // Output the missing number
        System.out.println("The missing number is: " + missingNumber);
    }

    public static int findMissingNumber(int[] originalArray, int[] modifiedArray) {
        int originalSum = 0;
        int modifiedSum = 0;

        // Calculate the sum of the original array
        for (int num : originalArray) {
            originalSum += num;
        }

        // Calculate the sum of the modified array
        for (int num : modifiedArray) {
            modifiedSum += num;
        }

        // The missing number is the difference between the original sum and the modified sum
        return originalSum - modifiedSum;
    }
    public static int findMissingNumber(int[] array) {
        // Iterate through the array
        for (int i = 0; i < array.length - 1; i++) {
            // Check if the next number is not equal to the current number plus one
            if (array[i] + 1 != array[i + 1]) {
                // The missing number is found
                return array[i] + 1;
            }
        }

        // If no missing number is found, return -1 or another appropriate value
        return -1;
    }
}


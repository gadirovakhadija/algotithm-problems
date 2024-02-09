package algorithmProblems.CodingChallenge.ArrayString;

public class DynamicArray {

    public static int[] dynamicArray(int[] arr, int n) {
        int length = arr.length;
        int[] newArr = new int[length + 1];
        for (int i = 0; i < length; i++) {
            newArr[i] = arr[i];
        }

        newArr[length] = n;
        return newArr;
    }

    public static void main(String[] args) {
        int[] newArr = new int[]{2, 4, 3, 2, 2, 2};
        printArray(dynamicArray(newArr, 4));
    }

    static void printArray(int[] array) {
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

}

package algorithmProblems.CodingChallenge.Agency;

public class MergArraysNotFunc {

    public static void main(String[] args) {
        int[] array1 = {1, 33};
        int[] array2 = {-2, -1};

        int[] mergedArray = merge(array1, array2);

        for (int num : mergedArray) {
            System.out.print(num + " ");
        }
    }

    public static int[] merge(int[] array1, int[] array2) {
        int[] mergedArray = new int[array1.length + array2.length];



        int i = 0, j = 0, k = 0;
        while (i < array1.length && j < array2.length) {
            if (array1[i] < array2[j]) {
                mergedArray[k++] = array1[i++];
            } else {
                mergedArray[k++] = array2[j++];
            }
        }


        while (i < array1.length) {
            mergedArray[k++] = array1[i++];
        }
        while (j < array2.length) {
            mergedArray[k++] = array2[j++];
        }

        return mergedArray;
    }


}

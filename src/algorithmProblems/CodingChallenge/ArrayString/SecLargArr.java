package algorithmProblems.CodingChallenge.ArrayString;

import java.util.Arrays;

public class SecLargArr {

    public static int secLargArrSort(int[] arr) {

        Arrays.sort(arr);

        return arr[arr.length - 2];

    }

    public static int secLargArr(int[] arr) {

        int larg = arr[0];
        int secLarg = arr[0];

        for (int j : arr) {
            if (j > larg) {
                secLarg = larg;
                larg = j;
            } else if (j > secLarg && j != larg) {
                secLarg = j;
            }
        }
        return secLarg;
    }

    public static void main(String[] args) {
        int[] array = {11, 34, 25, 12, 22, 11};

        System.out.println(secLargArr(array));
    }

}

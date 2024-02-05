package algorithmProblems.CodingChallenge.ArrayString;

public class FindMissingNum {

    public static int findMissNumSum(int[] arr, int[] newArr) {
        int arrSum = 0, newArrSum = 0;
        for (int i = 0; i < arr.length; i++) {
            arrSum += arr[i];
        }
        for (int i = 0; i < newArr.length; i++) {
            newArrSum += newArr[i];
        }
        return arrSum - newArrSum;

    }

    public static int findMissNum(int[] arr, int[] newArr) {
        int missNum = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != newArr[i]) {
                return arr[i];
            }
        }
        return arr[arr.length - 1];
    }

    public static void main(String[] args) {
        int[] array = {64, 34, 25, 12, 22, 11, 90};
        int[] array1 = {64, 34, 25, 22, 11, 90};
        System.out.println(findMissNum(array, array1));
    }

}

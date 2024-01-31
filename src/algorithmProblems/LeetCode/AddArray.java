package algorithmProblems.LeetCode;

import java.lang.reflect.Array;
import java.util.Scanner;

public class AddArray {
//    public static void main(String[] args) {
//
//        int[] array = {1, 2, 3, 4};
//        displayArray(array);
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the new number");
//        int newElement = sc.nextInt();
//
//        int newLength = array.length;
//        System.out.println(newLength);
//        int[] newArray = new int[newLength + 1];
//        for (int i = 0; i < array.length; i++) {
//            newArray[i] = array[i];
//        }
//
//        newArray[newLength] = newElement;
//        displayArray(newArray);
//    }


    public static void displayArray(int[] array) {
        for (int j : array) {
            System.out.println(j);
        }

    }

    public static int[] mergeTwoArr(int[] arr, int[] addArr) {
        int newLength = arr.length + addArr.length;//5 5
        int[] newArr = new int[newLength];//10
        for (int i = 0; i < arr.length; i++) {
            newArr[i]=arr[i];
        }
        for (int i=0;i<addArr.length;i++){
            newArr[arr.length+i]=addArr[i];
        }
        return newArr;

    }

    public static void main(String[] args) {
        int[] one = new int[]{1,2,22,3,2};
        int[] two = new int[]{4,3,34,9,7};
        System.out.println(mergeTwoArr(one,two));
        for (int i:mergeTwoArr(one,two)){
            System.out.println(i);
        }
    }
}


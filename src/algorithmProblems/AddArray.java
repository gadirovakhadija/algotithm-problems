package algorithmProblems;

import java.util.Scanner;

public class AddArray {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4};
        displayArray(array);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the new number");
        int newElement = sc.nextInt();

        int newLength = array.length ;
        System.out.println(newLength);
        int[] newArray = new int[newLength+1];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }

        newArray[newLength] = newElement;
        displayArray(newArray);
    }


    public static void displayArray(int[] array) {
        for (int j : array) {
            System.out.println(j);
        }

    }

}


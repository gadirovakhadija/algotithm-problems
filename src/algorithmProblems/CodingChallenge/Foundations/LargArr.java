package algorithmProblems.CodingChallenge.Foundations;

import java.util.Arrays;

public class LargArr {

    public static int largArr(int[] arr){

        int largest=arr[0];
        for (int i=1;i<arr.length;i++){
            if (arr[i]>largest){
                largest=arr[i];
            }
        }
        return largest;
    }

    public static int largArrSort(int[] arr){
        Arrays.sort(arr);

        return arr[arr.length-1];
    }



    public static void main(String[] args) {
        System.out.println(largArrSort(new int[]{2,5,2,-4,3,3}));
    }

}

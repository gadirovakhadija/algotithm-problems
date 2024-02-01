package algorithmProblems.CodingChallenge;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class IntersectionOfArrays {

    public static List<Integer> interArrs(int[] arr1,int[] arr2){
        List<Integer> list =new ArrayList<>();
        int k=0;
        for (int i=0;i<arr1.length;i++){
            for (int j=0;j<arr2.length;j++){
                if (arr1[i]==arr2[j]){
                    list.add(arr1[i]);
                }
            }

        }
        return list;
    }

    public static void main(String[] args) {
        int[] newArr1 = new int[]{2,2,3,2,2,2};
        int[] newArr = new int[]{2,4,2,21,5,3};
        System.out.println(interArrs(newArr1,newArr));
    }
}

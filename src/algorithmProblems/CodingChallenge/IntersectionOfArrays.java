package algorithmProblems.CodingChallenge;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;

public class IntersectionOfArrays {

    public static List<Integer> interArrs(int[] arr1,int[] arr2){
        List<Integer> list =new ArrayList<>();
        int k=0;
        for (int i=0;i<arr1.length;i++){
            for (int j=0;j<arr2.length;j++){
                if (arr1[i]==arr2[j]&&!list.contains(arr1[i])){
                    list.add(arr1[i]);
                    break;
                }
            }

        }
        return list;
    }

    public static int[] findIntersection(int[] array1, int[] array2) {
        return IntStream.of(array1)
                .distinct()
                .filter(x -> Arrays.stream(array2).anyMatch(y -> y == x))
                .toArray();
    }

    public static void main(String[] args) {
        int[] newArr1 = new int[]{2,2,3,2,2,2};
        int[] newArr = new int[]{2,4,2,21,5,3};
        System.out.println(findIntersection(newArr1,newArr));
    }
}

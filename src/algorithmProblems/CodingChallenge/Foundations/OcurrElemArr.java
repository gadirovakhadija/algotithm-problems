package algorithmProblems.CodingChallenge.Foundations;

import java.util.HashMap;
import java.util.Map;

public class OcurrElemArr {

    public static Map<Integer, Integer> occurElemArr(int[] arr) {

        Map<Integer, Integer> countElem = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            if (!countElem.containsKey(arr[i])) {
                countElem.put(arr[i], 1);
            } else {
                countElem.replace(arr[i], countElem.get(arr[i]) + 1);
            }
        }
        return countElem;
    }

    public static Map<Integer, Integer> occurElemArrOr(int[] arr) {
        Map<Integer, Integer> countElem = new HashMap<>();

        /*getOrDefault using for if have like this value at container get it
         or give it 0 valueh*/

        for (int num : arr) {
            countElem.put(num, countElem.getOrDefault(num, 0) + 1);
        }
        return countElem;
    }

    public static void main(String[] args) {
        int[] newArr1 = new int[]{2, 2, 3, 2, 2, 2, 3, 5, 2, 6, 3, 2, 6, 3, 5};

        System.out.println(occurElemArrOr(newArr1));
    }

}

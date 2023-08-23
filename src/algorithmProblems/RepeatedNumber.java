package algorithmProblems;

import java.util.HashMap;
import java.util.Map;

public class RepeatedNumber {
    public static void main(String[] args) {
        int[] numbers ={1,5,6,3,5,2,6,2,8,3,8,4,2,4};

        Map<Integer,Integer> insideOfMap = new HashMap<>();

        for (int number : numbers) {
            if (insideOfMap.containsKey(number)) {
                int numberCount = insideOfMap.get(number);
                insideOfMap.put(number, numberCount + 1);
            } else {
                insideOfMap.put(number, 1);
            }
        }
        for(Map.Entry<Integer, Integer> entry : insideOfMap.entrySet()){
            if(entry.getValue()>1){
                System.out.println(entry.getKey()+" reqemi "+entry.getValue()+" defe tekrarlanib");
            }
        }

    }
}

package algorithmProblems.interview;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

   public static int[] twoSum(int[] num, int target){
      Map<Integer,Integer> value = new HashMap<>();

      for (int i=0;i<num.length;i++){
         int delta = target-num[i];
         if (value.containsKey(delta)){
            return new int[]{i,value.get(delta)};
         }
         value.put(num[i],i );
      }
      return new int[]{-1,-1};
   }
}

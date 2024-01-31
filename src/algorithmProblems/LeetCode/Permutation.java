package algorithmProblems.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Permutation {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> values = new ArrayList<>();
        if (nums.length == 1) {
            values.add(nums[0]);
            List<List<Integer>> r = new ArrayList<>();
            r.add(values);
            return r;
        }
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            arr.add(nums[i]);
        }
        for (int i = 0; i < arr.size(); i++) {
            int n = arr.get(0);
            arr.remove(0);
            int[] n1 = new int[arr.size()];
            for (int j = 0; j < arr.size(); j++) {
                n1[j] = arr.get(j);
            }
            List<List<Integer>> r = permute(n1);
            for (List<Integer> per : r) {
                per.add(n);
                result.add(per);
            }
            arr.add(n);
        }
        return result;
    }
}

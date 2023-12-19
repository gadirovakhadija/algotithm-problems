package algorithmProblems;

import java.util.Arrays;
import java.util.Stack;

public class SingleNumber {
    public static int singleNumber(int[] nums) {

        Arrays.sort(nums);//we rank the modes from smallest to largest
        for (int i=0;i<nums.length-1;i+=2){//we increase the index by two steps
            if (nums[i]!=nums[i+1]){// we check whether two adjacent numbers are   equal to each other
                return nums[i];
            }
        }
        return nums[nums.length-1];//if don't thats mean last number is single
        //We didn't do this above because if we did +2 in the loop would throw an ArrayİndexBoundOfException
    }

    public static void main(String[] args) {
        int[] n ={2,2,5,5,6};
        System.out.println(singleNumber(n));
    }
}

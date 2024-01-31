package algorithmProblems.LeetCode;

public class SortColors {
        public void sortColors(int[] nums) {
            int zero = 0;
            int two = nums.length - 1;
            int temp = 0;
            int n = nums.length;

            while(temp < n && temp <= two){
                if(nums[temp] == 0)
                    swap(nums,temp++,zero++);
                else if(nums[temp] == 2)
                    swap(nums,temp,two--);
                else
                    temp++;

            }
        }

        public void swap(int[] nums,int i,int j){
            int temp = nums[j];
            nums[j] = nums[i];
            nums[i] = temp;
        }
}

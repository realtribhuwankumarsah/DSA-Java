import java.util.Arrays;



/*Question 5:Given an integer array nums, return all the triplets [nums[i], nums[j],  nums[k]] such that 
i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.Notice that the solution set must not contain duplicate triplets.
Example 1:
Input:nums = [-1, 0,  1, 2, -1, -4]   Output:   [ [-1, -1, 2] , [-1, 0, 1] ]*/

//THIS IS NOT A GOOD APPROACH, WILL BE LEARNING BETTER APPROACH IN FUTURE.

public class Triplets {
    public static void TripletsSum (int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            if(i>0&&nums[i]==nums[i-1]){
                    continue;
                }
            
            for (int j = i+1; j < nums.length; j++) {
                if(j>i+1&&nums[j]==nums[j-1]){
                    continue;
                }
                for (int k = j+1; k < nums.length; k++) {
                    if(k>j+1&&nums[k]==nums[k-1]){
                    continue;
                }
                    if(nums[i]+nums[j]+nums[k]==0) {
                        System.out.println("{"+nums[i]+","+nums[j]+","+nums[k]+"}");
                    }
                    
                }
            }
        }

    }
    public static void main(String[] args) {
        int nums[] = {-1,0,1,2,-1,-4};
        Arrays.sort(nums);
        TripletsSum(nums);
    }
    
}

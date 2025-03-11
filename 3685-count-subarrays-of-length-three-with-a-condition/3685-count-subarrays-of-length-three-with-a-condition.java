class Solution {
    public int countSubarrays(int[] nums) {
        if(nums.length < 3) return 0;
        int count = 0;
        for(int i = 1; i < nums.length-1; i++){
            if(nums[i-1]+nums[i+1] == nums[i]/2.0) count++;
        }
        return count;
    }
}
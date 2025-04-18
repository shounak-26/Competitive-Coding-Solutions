class Solution {
    public  int maxProduct(int[] nums) {

       int prefix = 1;
       int suffix = 1;
       int maxi = 0;
       if(nums.length == 1)return nums[0];
       for(int i = 0; i < nums.length; i++){
            if(prefix == 0){
                prefix = 1;
            }

            if(suffix == 0){
                suffix = 1;
            }

            prefix = nums[i] * prefix;
            suffix = nums[nums.length - i - 1] * suffix;
            maxi = Math.max(maxi, Math.max(prefix,suffix));
       }
       return maxi;
    }
}
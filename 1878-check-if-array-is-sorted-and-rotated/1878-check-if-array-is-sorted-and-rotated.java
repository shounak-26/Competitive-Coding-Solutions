class Solution {
    public boolean check(int[] nums) {
        boolean rotated = false;
        int count = 0;
        int n = nums.length - 1;
         if(n == 0) return true;
        if(nums[0] >= nums[n]){
            rotated = true;
        }
        for(int i = 0; i <= n-1; i++){
            if(nums[i] > nums[i+1]){
                count++;
            }
        }
        if((rotated == true && count <= 1) || (rotated == false && count <= 0)){
            return true;
        }else{
            return false;
        }
    }
}
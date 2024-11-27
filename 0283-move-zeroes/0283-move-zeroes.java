class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int p = 0;
        for (int i = 0; i < n; i++) {
        if(nums[i] != 0){
            nums[p] = nums[i];
            p++;
            }
        }
        for(int j = p; j<n; j++){
            nums[j] = 0;
        }
    }
}
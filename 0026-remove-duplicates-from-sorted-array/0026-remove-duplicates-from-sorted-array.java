class Solution {
    public int removeDuplicates(int[] nums) {
    int count = 0;
    int n = nums.length - 1;
    int ptr = 0;
    for(int i = 1; i <= n; i++){
        if(nums[i] == nums[i-1] ){
            count++;
        }else{
        nums[ptr] = nums[i-1];
          ptr++;
        }
    } 
    nums[ptr] = nums[n];
    return (n+1)-count;
    }
}
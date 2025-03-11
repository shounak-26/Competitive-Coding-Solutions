class Solution {
    public int countSubarrays(int[] nums) {
        int start = 0;
        int count = 0;
        int mid = 0;
        int end = 0;                 // -2 -2  -4+4=0
        while(end < nums.length-1){
            mid = start + 1;
            end = mid + 1;
            System.out.println("Start " + nums[start] + " " + " End " + nums[end] + " Mid " + nums[mid]/2);
            if((double)(nums[start]+nums[end]) == (double)(nums[mid]/2.0)){
                count++;
                start++;
            }else{
                start++;
            }
            
        }
        return count;
    }
}

 
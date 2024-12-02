class Solution {
    public void sortColors(int[] nums) {
        boolean swapped; 
		// Run the array for n-1 times.
		for (int i = 0; i < nums.length; i++) {
		swapped = false;
		 // For each step, max item will come at last respective index.
		 for (int j = 1; j < nums.length-i; j++) {
		if(nums[j] < nums[j-1]){
		 int temp = nums[j];
		 nums[j] = nums[j-1];
		 nums[j-1] = temp;
		 swapped = true;
		}
		 }
		 if(!swapped) {
         }
         
         
		}		 
    }
}
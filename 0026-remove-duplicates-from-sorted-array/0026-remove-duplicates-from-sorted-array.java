class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        while(i < nums.length - 1){
            if(nums[i] == nums[i+1]){
                nums[i] = Integer.MAX_VALUE;
                i++;
            }
            else{
                i++;
            }
        }

        bubbleSort(nums);
        int count = 0;
        for(int j : nums ){
            
            if(j != Integer.MAX_VALUE) count++;
        }
        return count;
    }

   static int[] bubbleSort(int[] nums) {
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
		      if(!swapped) {return nums;} 
		   }
		   return nums;
  }
}
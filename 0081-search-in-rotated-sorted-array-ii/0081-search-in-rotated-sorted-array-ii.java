class Solution {
    public boolean search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while(left <= right){
            int mid = left + (right-left)/2;
            if(nums[mid] == target){
                return true;
            }
            if(nums[left] <= nums[mid]){
                while(left != right && left != mid && nums[left] == nums[mid]){
                    left++;
                }
                while(left != right && right != mid && nums[right] == nums[mid]){
                    right--;
                }   
                if(nums[left] == target || nums[right] == target){
                    return true;
                } 
                if(nums[left] <= target && nums[mid] > target){
                    right = mid - 1;
                }else{
                    left = mid + 1;
                }
            }else{
                if(nums[right] >= target && nums[mid] < target){
                    left = mid + 1;
                }else{
                    right = mid - 1;
                }
            }
        }
        return false;
    }
}
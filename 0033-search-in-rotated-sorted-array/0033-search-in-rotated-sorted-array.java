class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        if(left == right && nums[left] == target) return left;
        while(left <= right){
            int mid = left + (right-left)/2;
            if(nums[mid] == target ){
                return mid;
            }

            // Looking at left portion
            if(nums[left] <= nums[mid]){
                // Checking if target lies strictly in left portion only liikie between left to mid
                if(nums[left] <= target && target < nums[mid]){
                    right = mid - 1;
                }else{
                    left = mid + 1;
                }
            }else{
                if(nums[right] >= target && target > nums[mid] ){
                    left = mid + 1;
                }else{
                    right = mid - 1;
                }
            }
        }
        return -1;
    }
}

/*

if(nums[mid] < target){
    left = mid + 1;
}
else if (nums[mid] > target)
{
    right = mid - 1;
}


1. In non-rotated array mid can be equal to target of greater then left or equal to target and less then right.

nums[mid] >= nums[left] && nums[mid] <= nums[right]

2. In rotated array mid will be equal or greater then right & equal to greater then left.

nums[mid] >= nums[left] && nums[mid] >= nums[right]



if(nums[mid] > nums[left]){
    if(nums[mid] > nums[right]){
        left = mid + 1;
    }else{
        left = mid;
    }
}else{
    right = mid - 1;
}



*/
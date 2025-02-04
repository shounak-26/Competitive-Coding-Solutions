class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> myMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++ ){
            if(!myMap.containsKey(target - nums[i])){
                myMap.put(nums[i],i);
            }else{
                return new int[]{myMap.get(target - nums[i]),i};
            }
        }
        return null;
    } 
}



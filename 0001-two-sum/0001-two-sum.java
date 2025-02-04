class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer,Integer> myMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++ ){
            if(!myMap.containsKey(target - nums[i])){
                myMap.put(nums[i],i);
            }else{
                result[0] = myMap.get(target - nums[i]);
                result[1] = i;
                return result;
            }
        }
        return null;
    } 
}



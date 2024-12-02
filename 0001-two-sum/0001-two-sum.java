class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> indexStoringMap = new HashMap<>();
        int[] result = new int[2];
        int sub = 0;
        for(int i = 0; i < nums.length; i++){
            sub = target - nums[i];
            if(!indexStoringMap.containsKey(sub)){
                indexStoringMap.put(nums[i],i);
                sub = 0;
            }
            else{
                result[0] = indexStoringMap.get(sub);
                result[1] = i;
                return result;
            }
        }
        return new int[2];
    }
}
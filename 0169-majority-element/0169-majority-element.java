class Solution {
    public int majorityElement(int[] nums) {
        // HashMap<Integer,Integer> myMap = new HashMap<>();
        // for(int i = 0; i < nums.length; i++){
        //     if(!myMap.containsKey(nums[i])){
        //         myMap.put(nums[i],1);
        //     }else{
        //         myMap.put(nums[i], myMap.get(nums[i]) + 1);
        //     }
        // }

        // int maxFrequency = 0;
        // int maxKey = 0;

        // for (Map.Entry<Integer, Integer> entry : myMap.entrySet()) {
        //     if (entry.getValue() > maxFrequency) {
        //         maxFrequency = entry.getValue();
        //         maxKey = entry.getKey();
        //     }
        // }
        // return maxKey;

        // Optimal solution using moon's algorithm
        int count = 0;
        int el = 0;
        for (int i = 0; i < nums.length; i++) {
        if(count == 0){
            count = 1;
            el = nums[i];
        }else if(nums[i] == el){
            count++;
        }else{
            count--;
            }
        }
        return el;
    }
}
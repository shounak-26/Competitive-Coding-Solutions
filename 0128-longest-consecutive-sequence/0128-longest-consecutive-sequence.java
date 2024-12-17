class Solution {
    public  int longestConsecutive(int[] nums) {
      TreeMap<Integer, Integer> myTreeMap = new TreeMap<>();

      if(nums.length==0) return 0;

      for (int i = 0; i < nums.length; i++) {
         if (!myTreeMap.containsKey(nums[i])) {
            myTreeMap.put(nums[i], 1);
         } else {
            myTreeMap.put(nums[i], myTreeMap.get(nums[i]) + 1);
         }
      }

      int maxVal = 0;
      Integer firstKey = myTreeMap.firstKey();
      Integer currentKey = myTreeMap.higherKey(firstKey);
      int temp = 0;
      for (int i = 1; i < myTreeMap.size(); i++) {
         Integer prevKey = myTreeMap.lowerKey(currentKey);
         if ((currentKey - prevKey) == 1) {
            temp++;
            maxVal = Math.max(maxVal, temp);
         } else {
            temp = 0;
         }
         currentKey = myTreeMap.higherKey(currentKey);
      }
      return maxVal+1;
   }
}
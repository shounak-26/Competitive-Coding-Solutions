class Solution {
    public int longestConsecutive(int[] nums) {
      int maxVal = 0;
      if(nums.length == 0) return 0;
      TreeSet<Integer> sortedSet = new TreeSet<>();  
      for (int i : nums) {
         sortedSet.add(i);
      }
      List<Integer> list = new ArrayList<>(sortedSet);
      int temp = 0;
      for (int i = 1; i < list.size(); i++) {
         if((list.get(i) - list.get(i-1)) <= 1){
            temp++;
            maxVal = Math.max(maxVal, temp);
         }else{
            maxVal = Math.max(maxVal, temp);
            temp = 0;
         }
      }
      return maxVal+1;
   }
}
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // Better Approch O(n^2)

        HashSet<List<Integer>> st = new HashSet<>(); 
        for(int i = 0; i < nums.length; i++){
            HashSet<Integer> mySet = new HashSet<>();
            for(int j = i+1; j < nums.length; j++){
                if(mySet.contains(-(nums[i] + nums[j]))){
                    List<Integer> myList = new ArrayList<>();
                    myList.add(nums[i]);
                    myList.add(nums[j]);
                    myList.add(-(nums[i] + nums[j]));
                    Collections.sort(myList);
                    st.add(myList);
                }
                mySet.add(nums[j]);
            }
        }
        List<List<Integer>> result = new ArrayList<>();
        result.addAll(st);
        return result;
    }
}
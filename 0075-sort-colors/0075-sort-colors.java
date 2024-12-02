class Solution {
    public void sortColors(int[] nums) {
    HashMap<Integer, Integer> myMap = new HashMap<>();
    myMap.put(0, 0);
    myMap.put(1, 0);
    myMap.put(2, 0);

    // Count occurrences of each number
    for (int i = 0; i < nums.length; i++) {
      if (myMap.containsKey(nums[i])) {
        myMap.put(nums[i], myMap.get(nums[i]) + 1); // Increment the count
      }
    }

    // Rebuild the sorted array
    int index = 0;
    for (int key : myMap.keySet()) {
      int count = myMap.get(key);
      for (int i = 0; i < count; i++) {
        nums[index++] = key;
      }
    }


    }
}
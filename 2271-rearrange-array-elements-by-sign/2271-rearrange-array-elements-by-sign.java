class Solution {
public int[] rearrangeArray(int[] nums) {
    int positive = 0;
    int negative = 1;
    int[] result = new int[nums.length];
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] > 0) {
        result[positive] = nums[i];
        positive+=2;
      } else {
        result[negative] = nums[i];
        negative+=2;
      }
    }
    return result;
  }
}
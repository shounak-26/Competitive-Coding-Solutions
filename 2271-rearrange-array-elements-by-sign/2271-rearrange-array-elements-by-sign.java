class Solution {
//     public int[] rearrangeArray(int[] nums) {
//     int positive = 0;
//     int negative = 1;
//     int n = nums.length;
//     for (int i = 0; i < n; i++) {
//       if (nums[i] > 0) {
//         if ((positive % 2) == (i % 2) && positive < n) {
//           positive += 2;
//         } else {
//           int temp = nums[i];
//           nums[i] = nums[positive];
//           nums[positive] = temp;
//         }
//       } else {
//         if ((negative % 2) == (i % 2) && negative < n) {
//           negative += 2;
//         } else {
//           int temp = nums[i];
//           nums[i] = nums[negative];
//           nums[negative] = temp;
//         }
//       }
//     }
//     return nums;
//   }

public int[] rearrangeArray(int[] nums) {
    int positive = 0;
    int negative = 1;
    int n = nums.length;
    int[] result = new int[n];
    for (int i = 0; i < n; i++) {
      if (nums[i] > 0) {
        result[positive] = nums[i];
        positive+=2;
      } else {
        result[negative] = nums[i];
        negative+=2;
      }
    }
    System.gc();return result;
  }
}
class Solution {
    public int maxProduct(int[] nums) {
        int maxProduct = nums[0];
        int product = 1;
        for(int i = 0; i < nums.length; i++){
            product = nums[i];
            for(int j = i+1; j < nums.length; j++){
                product = product * nums[j];
                maxProduct = Math.max(maxProduct, product);
            }
            maxProduct = Math.max(maxProduct, nums[i]);
        }
        return maxProduct;
    }
}
class Solution {
    public int reversePairs(int[] nums) {
        if (nums == null || nums.length <= 1) return 0;
        int[] temp = new int[nums.length];
        return mergeSort(nums, temp, 0, nums.length - 1);
    }

    private int mergeSort(int[] nums, int[] temp, int left, int right) {
        int count = 0;
        if (left >= right) return count;
        int mid = left + (right - left) / 2;
        count += mergeSort(nums, temp, left, mid);
        count += mergeSort(nums, temp, mid + 1, right);
        count += countPairs(nums, left, mid, right);
        merge(nums, temp, left, mid, right);
        return count;
    }

    private int countPairs(int[] nums, int low, int mid, int high) {
        int right = mid + 1;
        int count = 0;
        for (int i = low; i <= mid; i++) {
            while (right <= high && (long)nums[i] > 2L * nums[right]) {
                right++;
            }
            count += (right - (mid + 1));
        }
        return count;
    }

    private void merge(int[] nums, int[] temp, int left, int mid, int right) {
        // Copy data to temp
        for (int i = left; i <= right; i++) {
            temp[i] = nums[i];
        }
        int i = left;     // Left subarray index
        int j = mid + 1;  // Right subarray index
        int k = left;     // Merged array index

        while (i <= mid && j <= right) {
            if (temp[i] <= temp[j]) {
                nums[k++] = temp[i++];
            } else {
                nums[k++] = temp[j++];
            }
        }
        while (i <= mid) {
            nums[k++] = temp[i++];
        }
    }
}
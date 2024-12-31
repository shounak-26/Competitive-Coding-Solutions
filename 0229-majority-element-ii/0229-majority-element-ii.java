class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int el1 = 0 , el2 = 0;
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (count1 == 0 && nums[i] != el2) {
                el1 = nums[i];
                count1 = 1;
            }else if(count2 == 0 && nums[i] != el1){
                el2 = nums[i];
                count2 = 1;
            }else {
                if (el1 == nums[i]) {
                    count1++;
                } else if(el2 == nums[i]){
                    count2++;
                }else{
                    count1--;
                    count2--;   
                }
            }
        }

        count1 = 0;
        count2 = 0;
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] == el1){
                count1++;
            }else if(nums[index] == el2){
                count2++;
            }
        }
        
        if (count1 > nums.length / 3) {
            list.add(el1);
        }
        if (count2 > nums.length / 3) {
            list.add(el2);
        }
        
        return list;
    }
}
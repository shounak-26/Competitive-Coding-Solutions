class Solution {
    public void sortColors(int[] nums) {
    int zero = 0;
    int one = 0;
    int two = 0;
    for(int i = 0; i < nums.length; i++){
        if(nums[i] == 0){
            zero++;
        }else if(nums[i] == 1){
            one++;
        }else{
            two++;
        }
    }
    int pointer = 0;
    for(int j = 0; j<zero; j++){
        nums[pointer] = 0;
        pointer++;
    }
    for(int j = 0; j<one; j++){
        nums[pointer] = 1;
        pointer++;
    }
    for(int j = 0; j<two; j++){
        nums[pointer] = 2;
        pointer++;
    }
    }
}
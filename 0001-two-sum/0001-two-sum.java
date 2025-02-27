class Solution {
    public int[] twoSum(int[] arr, int target){
        HashMap<Integer,Integer> mymap = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            if(mymap.containsKey(target - arr[i])){ // 9-7 = 2
                return new int[]{i,mymap.get(target-arr[i])}; // 1,0
            }else{
                mymap.put(arr[i],i); // 2:0
            }
        }
        return null;
    }
}



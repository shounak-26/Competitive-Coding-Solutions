class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;
        int n = piles.length;
        int ans = 0;
        for(int i:piles){
            high = (i > high) ? i : high;
        }

        int hours = 0;
        while(low < high){
            
            int mid = (low+ high)/2;
            hours = 0;
            for(int i : piles){
                hours += (i+mid -1 )/mid;
            }
            
            if(hours > h){
                low = mid + 1;
            }else{
                high = mid;
            }
        }
        return low;
    }
}
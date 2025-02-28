class Solution {
    public int reverse(int x) {
        long reverse = 0;
        while(x != 0){
            long temp = x % 10;
            reverse = 10 * reverse + temp;
            x = x / 10;
            if(reverse < -2147483648 || reverse > 2147483647) return 0;
        }
         return (int)reverse;
    }
}
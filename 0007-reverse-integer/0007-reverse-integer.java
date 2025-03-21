class Solution {
    public  int reverse(int x) {
        int reverse = 0;
        while (x != 0) {
            int temp = x % 10;
            if (reverse > Integer.MAX_VALUE / 10 || (reverse == Integer.MAX_VALUE / 10 && temp > 7)) {
                return 0;
            }
            if (reverse < Integer.MIN_VALUE / 10 || (reverse == Integer.MIN_VALUE / 10 && temp < -8)) {
                return 0;
            }
            reverse = 10 * reverse + temp;
            x = x / 10;
        }
        return reverse;
    }
}
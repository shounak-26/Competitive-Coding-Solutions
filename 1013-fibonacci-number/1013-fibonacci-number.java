class Solution {
    public int fib(int n) {
        int first = 0;
        int second = 1;
        if(n == 0) return first;
        if(n == 1 || n == 2) return second;
        for(int i = 2; i <= n; i++){
            int sum = first + second; // 1
            first = second; 
            second = sum;
        }
        return second;
    }
}

// 0 1 1 2 3
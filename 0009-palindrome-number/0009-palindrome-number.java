class Solution {
    public boolean isPalindrome(int x) {
    //     String s = x+"";
    //     int start = 0;
    //     int end = s.length()-1;
    //     while(start < end){
    //         if(s.charAt(start) != s.charAt(end)){
    //             return false;
    //         }
    //         start++;
    //         end--;
    //     }
    // return true;

    int s = x;
    if(x < 0) return false;
    int reverse = 0;
    while(x != 0){
        int temp = x % 10;
        reverse = reverse*10 + temp;
        x = x / 10;
    }
    System.out.println(reverse);
    if(s==reverse) return true;
    else return false;

    }
    
}
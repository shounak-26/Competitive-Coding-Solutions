class Solution {
    public boolean isPalindrome(String s) {
        if(s.isEmpty())return true;
        s = s.toLowerCase();
        int start = 0;
        int end = s.length() - 1;
        String normal = "";
        String reversse = "";
        while(start < s.length() && end >= 0){
            char first = s.charAt(start);
            char second = s.charAt(end);
            if(Character.isLetterOrDigit(first)){
                normal = normal + first;
                start++;
            }else{
                start++;
            }
            if(Character.isLetterOrDigit(second)){
                reversse = reversse + second;
                end--;
            }else{
                end--;
            }
        }
        if(normal.equals(reversse)) return true;
        else return false;
    } 
}
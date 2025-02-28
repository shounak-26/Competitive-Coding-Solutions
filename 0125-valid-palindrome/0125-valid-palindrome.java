class Solution {
    public  boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int start = 0;
        int end = s.length() - 1;

        while (start < end) { // Changed to strictly start < end
            if (!Character.isLetterOrDigit(s.charAt(start)) && start < end) { 
                start++;
            } else if (!Character.isLetterOrDigit(s.charAt(end)) && start < end) {
                end--;
            } else {
                if (s.charAt(start) != s.charAt(end)) {
                    return false;
                }
                start++;
                end--;
            }
        }
        return true;
    }
}
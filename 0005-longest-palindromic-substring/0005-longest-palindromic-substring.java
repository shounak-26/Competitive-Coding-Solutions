class Solution {
    public String longestPalindrome(String s) {
        if (s.length() <= 1) {
            return s;
        }

        String result = "";
        for (int i = 1; i < s.length(); i++) {

            // Checking for odd
            int low = i;
            int high = i;

            while (s.charAt(low) == s.charAt(high)) {
                low--;
                high++;
                if (low == -1 || high == s.length())
                    break;
            }
            String palidrome = s.substring(low + 1, high);
            if (result.length() < palidrome.length()) {
                result = palidrome;
            }

            // Checking for even
            low = i - 1;
            high = i;
            while (s.charAt(low) == s.charAt(high)) {
                low--;
                high++;
                if (low == -1 || high == s.length())
                    break;
            }
            String pali = s.substring(low + 1, high);
            if (pali.length() > result.length()) {
                result = pali;
            }
        }
        return result;
    }
}
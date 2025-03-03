class Solution {
    public static String longestPalindrome(String s) {
    if (s.length() <= 1)
        return s;
    else if (s.length() == 2) {
        if (s.charAt(0) == s.charAt(1))
            return s;
        else return s.charAt(0) + "";
    }

    // Default to the first character in case no longer palindrome is found
    String result = s.charAt(0) + "";

    for (int i = 0; i < s.length(); i++) {
        for (int j = i + 1; j < s.length(); j++) {
            String pali = s.substring(i, j + 1);
            if (pali.length() > 1) {
                int low = 0;
                int high = pali.length() - 1;
                boolean isPalindrome = true;

                while (low < high) {
                    if (pali.charAt(low) != pali.charAt(high)) {
                        isPalindrome = false;
                        break;
                    }
                    low++;
                    high--;
                }

                if (isPalindrome && pali.length() > result.length()) {
                    result = pali;
                }
            }
        }
    }
    return result;
}

}
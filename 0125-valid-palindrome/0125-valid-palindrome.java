class Solution {
    public static boolean isPalindrome(String s) {
        s = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        StringBuilder sb = new StringBuilder(s);
        System.out.println(sb + " " + sb.reverse());
        if((sb+"").equals(sb.reverse()+""))
        return true;
        else return false;
    }
}
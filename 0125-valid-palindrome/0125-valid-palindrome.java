class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        int right = s.length()-1;
        String reverse = "";
        while(right >= 0){
            reverse =  reverse + s.charAt(right);
            right--;
        }
        System.out.println(s);
        System.out.println(reverse);
        if(s.equals(reverse))return true;
        else return  false;
        
    }
}
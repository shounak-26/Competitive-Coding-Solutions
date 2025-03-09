class Solution {
    public int firstUniqChar(String s) {
        // Approch 1
        // int[] charArray = new int[26];
        // for(char i : s.toCharArray()){
        //     charArray[i - 'a']++;
        // }

        // for(int i = 0; i < s.length(); i++){
        //     if(charArray[s.charAt(i) - 'a'] == 1){
        //         return i;
        //     }
        // }
        // return -1;

        // Approch: 2
        for(int i = 0; i < s.length(); i++){
            if(s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))){
                return i;
            }
        }
        return -1;
    }
}
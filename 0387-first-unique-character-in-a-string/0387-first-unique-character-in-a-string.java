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

        // Approch: 2 less better
        for(int i = 0; i < s.length(); i++){
            if(s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))){
                return i;
            }
        }
        return -1;

        // Approch 3: Worst Solution other then using two inside for loop also 
        // HashMap<Character,Integer> myMap = new HashMap<>();
        // for(int i = 0; i < s.length(); i++){
        //     if(!myMap.containsKey(s.charAt(i))){
        //         myMap.put(s.charAt(i),1);
        //     }else{
        //         myMap.put(s.charAt(i), myMap.get(s.charAt(i))+1);
        //     }
        // }
        // for(int i = 0; i < s.length(); i++){
        //     if(myMap.get(s.charAt(i)) == 1){
        //         return i;
        //     }
        // }
        // return -1;
    }
}
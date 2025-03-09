class Solution {
    public String frequencySort(String s) {
        int[] frequency = new int[256];
        for(char c : s.toCharArray()){
            frequency[c]++;
        }
        List<Character> list = new ArrayList<>();
        for(char c : s.toCharArray()){
            if(!list.contains(c)){
                list.add(c);
            }
        }
        list.sort((a,b) -> frequency[b] - frequency[a]);
        String result = "";
        for(int i = 0; i < list.size(); i++){
            for(int j = 0; j < frequency[list.get(i)]; j++){
                result = result + list.get(i);
            }
        }
        return result;

    }
}
class Solution {
    public static int[][] merge(int[][] intervals) {
        List<int[]> result = new ArrayList<>();

        // Corner case
        if (intervals.length == 1) return intervals;

        // Sort based on the start of the interval
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        // Main case
        result.add(intervals[0]);
        for(int i = 1; i < intervals.length; i++){
            int[] current = intervals[i];
            int[] last = result.get(result.size()-1);
            if(last[1] >= current[0]){
                last[0] = last[0];
                last[1] = Math.max(current[1],last[1]);
            }else{
                result.add(current);
            }
        }
        // Convert the list to a 2D array and return
        return result.toArray(new int[result.size()][]);
    }
}
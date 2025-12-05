class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);
        ArrayList<int[]> res = new ArrayList<>();
        int start = intervals[0][0];
        int end = intervals[0][1];
        int n = intervals.length;
        for(int i=1;i<n;i++){
            if(intervals[i][0] <= end){
                end = Math.max(end, intervals[i][1]);
            }else{
                res.add(new int[]{start, end});
                start = intervals[i][0];
                end = intervals[i][1];
            }   
        }
        res.add(new int[]{start,end});
        int len = res.size();
        int result[][] = new int[len][2];

        for(int i=0;i<len;i++){
            result[i][0] = res.get(i)[0];
            result[i][1] = res.get(i)[1];
        }
        return result;
    }
}
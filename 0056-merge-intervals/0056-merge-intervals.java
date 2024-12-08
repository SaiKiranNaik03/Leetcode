class Solution {
    public int[][] merge(int[][] intervals) {
        List<int []> res = new ArrayList<>();

        Arrays.sort(intervals,(a,b)-> a[0] - b[0]);

        if(intervals.length == 0){
            return res.toArray(new int[0][]);
        }

        int st = intervals[0][0];
        int ed = intervals[0][1];
        for(int[] inter : intervals){
            if(inter[0] <= ed){
                ed = Math.max(ed,inter[1]);
            }
            else{
                res.add(new int[]{st, ed});
                st = inter[0];
                ed = inter[1];
            }
        }
        res.add(new int[]{st, ed});
        return res.toArray(new int[0][]);
    }
}
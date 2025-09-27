class Solution {
    public int[][] merge(int[][] intervals) {

        ArrayList<ArrayList<Integer>> res = new ArrayList<>();

        Arrays.sort(intervals,(a,b) -> a[0] - b[0]);
        for(int i=0;i<intervals.length;i++){
            if(res.size() == 0 || intervals[i][0] > res.get(res.size()-1).get(1)){
                res.add(new ArrayList<>(Arrays.asList(intervals[i][0], intervals[i][1])));
            }
            else{
                res.get(res.size()-1).set(1,Math.max(intervals[i][1],res.get(res.size()-1).get(1)));
            }
        }
        int row = res.size();
        int result[][] = new int[row][2];
        for(int i=0;i<row;i++){
            for(int j=0;j<2;j++){
                result[i][j] = res.get(i).get(j);
            }
        }
        return result;
    }
}
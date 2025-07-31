class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        int n = points.length;
        for(int i=0;i<n;i++){
            int start = points[i][0];
            int ed = points[i][1];
            int end = ed;
            if(res.size() > 0 && start <= res.get(res.size()-1).get(1)) continue;
            for(int j=i+1;j<n;j++){
                if(points[j][0] <= ed){
                    end = Math.max(end, ed);
                }
            }
            ArrayList<Integer> temp = new ArrayList<>(Arrays.asList(start, end));
            res.add(temp);
        }
        return res.size();
    }
}
class Solution {
    List<Integer> genrateRow(int row){
        long ans = 1;
        List<Integer> r = new ArrayList<>();
        r.add((int)ans);
        for(int col=1;col<row;col++){
            ans = ans*(row-col);
            ans = ans/col;
            r.add((int)ans);
        }
        return r;
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            res.add(genrateRow(i));
        }
        return res;
    }
}
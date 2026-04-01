class Solution {
    public int nCr(int n, int r){
        int res = 1;
        for(int i=0;i<r;i++){
            res *= (n-i);
            res /= (i+1);
        }
        return res;
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            List<Integer> temp = new ArrayList<>();
            for(int j=0;j<i;j++){
                temp.add(nCr(i-1,j));
            }
            res.add(temp);
        }
        return res;
    }
}
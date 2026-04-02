class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int hash[] = new int[n*m+1];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                hash[grid[i][j]]++;
            }
        }
        int missing = -1;
        int repeat = -1;
        for(int i=1;i<n*m+1;i++){
            if(hash[i] == 0) missing = i;
            if(hash[i] == 2) repeat = i;

            if(missing != -1 && repeat != -1) break;
        }
        return new int[]{repeat,missing};
    }
}
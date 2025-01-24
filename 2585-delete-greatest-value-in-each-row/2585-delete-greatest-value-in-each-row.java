class Solution {
    public int deleteGreatestValue(int[][] grid) {
        for(int i=0;i<grid.length;i++){
            Arrays.sort(grid[i]);
        }
        int res=0;
        for(int j=0;j<grid[0].length;j++){
            int maxi=0;
            for(int i=0;i<grid.length;i++){
                maxi=Math.max(maxi,grid[i][j]);
            }
            res+=maxi;
        }
        return res;
    }
}
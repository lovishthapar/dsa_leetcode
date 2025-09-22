class Solution {
    int dp[][][]; 
    int mod = (int)1e9 + 7;
    int ways(int grid[][],int row,int col,int dir){
        int m = grid.length;
         int n = grid[0].length;
        if(row<0 || col<0 || row>=m || col>=n || grid[row][col]==-1) return 0; 
        if(row==m-1 && col==n-1){
            return 1;
        }
        if(dp[row][col][dir]!=-1)
         return dp[row][col][dir];
        int temp = grid[row][col];
        int ans=0;
        grid[row][col]=-1;
        if(temp==1){
            if(dir==1) ans = (ans + ways(grid,row+1,col,0))%mod;
            else ans = (ans + ways(grid,row,col+1,1))%mod;
        }
        else ans = (ans + ways(grid,row+1,col,0) + ways(grid,row,col+1,1))%mod;
        grid[row][col] = temp;
        return dp[row][col][dir] = ans%mod;
    }
    public int uniquePaths(int[][] grid) {
        int m = grid.length; int n = grid[0].length;
        dp = new int[m][n][2];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++) Arrays.fill(dp[i][j],-1);
        }
        return Math.max(ways(grid,0,0,0),ways(grid,0,0,1));
    }
}
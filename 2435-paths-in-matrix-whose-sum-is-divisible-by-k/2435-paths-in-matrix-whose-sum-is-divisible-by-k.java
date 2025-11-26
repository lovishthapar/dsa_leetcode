class Solution {
    public int numberOfPaths(int[][] g, int k) {
        int MOD = 1000000007;
        int m = g.length;
         int n = g[0].length;

        int[][][] dp = new int[m][n][k];
        dp[0][0][g[0][0] % k] = 1;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int mod = 0; mod < k; mod++) {

                    if (i == 0 && j == 0) 
                    continue;

                    int val = g[i][j];

                    
                    if (i > 0) {
                        int prev = (mod - val % k + k) % k;
                        dp[i][j][mod] = (dp[i][j][mod] + dp[i - 1][j][prev]) % MOD;
                    }

                   
                    if (j > 0) {
                        int prev = (mod - val % k + k) % k;
                        dp[i][j][mod] = (dp[i][j][mod] + dp[i][j - 1][prev]) % MOD;
                    }
                }
            }
        }

        return dp[m - 1][n - 1][0];
    }
}

import java.util.Arrays;

class Solution {
    public int[] row = {-1, 0, 1};
    public int[] col = {1, 1, 1};
    public int max = 0;
    public int[][] dp;

    public int maxMoves(int[][] g) {
        int ro = g.length;
        int co = g[0].length;
        dp = new int[ro][co];
        for (int[] d : dp) Arrays.fill(d, -1);

        for (int i = 0; i < ro; i++) {
            max = Math.max(max, dfs(i, 0, g));
        }
        return max - 1;
    }

    public int dfs(int r, int c, int[][] g) {
        if (dp[r][c] != -1) return dp[r][c];
        int moves = 1;
        for (int tf = 0; tf < 3; tf++) {
            int nr = r + row[tf];
            int nc = c + col[tf];
            if (nr >= 0 && nc >= 0 && nr < g.length && nc < g[0].length && g[nr][nc] > g[r][c]) {
                moves = Math.max(moves, 1 + dfs(nr, nc, g));
            }
        }
        dp[r][c] = moves;
        return moves;
    }
}

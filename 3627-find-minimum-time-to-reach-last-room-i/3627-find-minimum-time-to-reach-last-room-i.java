class Solution {
    public int rg[] = {0, 0, 1, -1};
    public int cg[] = {1, -1, 0, 0};
    public int minTime = Integer.MAX_VALUE;

    public int minTimeToReach(int[][] m) {
        int n = m.length;
        int ml = m[0].length;
        
        // Instead of vis=0/1, store min time to reach each cell
        int[][] best = new int[n][ml];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < ml; j++) {
                best[i][j] = Integer.MAX_VALUE;
            }
        }

        // Start from (0,1) and (1,0)
        dfs(0, 1, best, m, 0);
        dfs(1, 0, best, m, 0);

        return minTime;
    }

    public void dfs(int i, int r, int[][] best, int[][] m, int ct) {
        // Adjust current time based on moveTime constraint
        if (ct < m[i][r]) {
            ct = m[i][r] + 1;
        } else {
            ct = ct + 1;
        }

        // Prune if already worse than current best
        if (ct >= minTime) return;
        if (ct >= best[i][r]) return; // already visited faster or equal
        best[i][r] = ct; // store best time so far

        // Goal check
        if (i == m.length - 1 && r == m[0].length - 1) {
            minTime = Math.min(minTime, ct);
            return;
        }

        // Explore neighbors
        for (int e = 0; e < 4; e++) {
            int nr = i + rg[e];
            int nc = r + cg[e];
            if (nr >= 0 && nc >= 0 && nr < m.length && nc < m[0].length) {
                dfs(nr, nc, best, m, ct);
            }
        }
    }
}

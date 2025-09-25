import java.util.List;

class Solution {
    private Integer[][] dp;  

    public int minimumTotal(List<List<Integer>> t) {
        int l = t.size();
        dp = new Integer[l][l]; 
        return dfs(0, 0, l, t);  
    }

    public int dfs(int r, int c, int l, List<List<Integer>> t) {
        if (r == l)  
            return 0;

        if (dp[r][c] != null)  
            return dp[r][c];

        int currentVal = t.get(r).get(c);  

       
        int leftPath = dfs(r + 1, c, l, t);       
        int rightPath = dfs(r + 1, c + 1, l, t);  


        dp[r][c] = currentVal + Math.min(leftPath, rightPath);

        return dp[r][c]; 
    }
}

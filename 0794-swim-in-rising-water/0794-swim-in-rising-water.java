class Solution {
    public int nr[]={0,0,1,-1};
    public int nc[]={1,-1,0,0};
    public int mint=Integer.MAX_VALUE;
    public int[][] best;   // memoization table
    
    public int swimInWater(int[][] g) {
        int r=g.length;
        int c=g[0].length;
        int vis[][]=new int[r][c];
        best = new int[r][c];
        
        // initialize best[][] with large values
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                best[i][j] = Integer.MAX_VALUE;
            }
        }
        
        dfs(0,0,vis,g,g[0][0],g[0][0]);
        return mint;
    }

    public void dfs(int r,int c,int vis[][],int g[][],int pm,int cm) {
        cm = Math.max(cm, g[r][c]);   // max elevation along path

        // pruning with memoization
        if (cm >= best[r][c]) return;
        best[r][c] = cm;

        if(r==(vis.length-1) && c==(vis[0].length-1)) {
            mint = Math.min(mint, cm);
            return;
        }

        vis[r][c]=1;
        for(int i=0;i<4;i++) {
            int nro=nr[i]+r;
            int nco=nc[i]+c;
            if(nro>=0 && nro<vis.length && nco>=0 && nco<vis[0].length && vis[nro][nco]==0) {
                dfs(nro,nco,vis,g,pm,cm);
            }
        }
        vis[r][c]=0;
    }
}

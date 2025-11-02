class Solution {
    public int countUnguarded(int m, int n, int[][] g, int[][] w) {
        int[][] a = new int[m][n]; 
        int le = g.length;
        int er = w.length;
         
        for(int f=0;f<le;f++)
        {
            a[g[f][0]][g[f][1]]=1;

        

        }
            for(int f=0;f<er;f++)
        {
            a[w[f][0]][w[f][1]]=-1;
        }

        int[][] vis = new int[m][n];
        int nog = 0;

        for (int f = 0; f < le; f++) {
            int xw = g[f][0];
            int yw = g[f][1];

          
            for (int s = xw + 1; s < m; s++) {
                if (a[s][yw] == -1 || a[s][yw] == 1) break;
                if (vis[s][yw] == 0) {
                    vis[s][yw] = 1;
                    nog++;
                }
            }

         
            for (int s = xw - 1; s >= 0; s--) {
                if (a[s][yw] == -1 || a[s][yw] == 1) break;
                if (vis[s][yw] == 0) {
                    vis[s][yw] = 1;
                    nog++;
                }
            }

            for (int s = yw + 1; s < n; s++) {
                if (a[xw][s] == -1 || a[xw][s] == 1) break;
                if (vis[xw][s] == 0) {
                    vis[xw][s] = 1;
                    nog++;
                }
            }

    
            for (int s = yw - 1; s >= 0; s--) {
                if (a[xw][s] == -1 || a[xw][s] == 1) break;
                if (vis[xw][s] == 0) {
                    vis[xw][s] = 1;
                    nog++;
                }
            }
        }

        return (m * n - nog - le - er);
    }
}
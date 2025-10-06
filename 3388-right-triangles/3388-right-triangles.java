class Solution {
    public long numberOfRightTriangles(int[][] g) {
        int r = g.length;
        int c = g[0].length;
        int[] rowCount = new int[r];
        int[] colCount = new int[c];
        long cou = 0;

        
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (g[i][j] == 1) {
                    rowCount[i]++;
                    colCount[j]++;
                }
            }
        }

        
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (g[i][j] == 1) {
                    cou += (long)(rowCount[i] - 1) * (colCount[j] - 1);
                }
            }
        }

        return cou;
    }
}

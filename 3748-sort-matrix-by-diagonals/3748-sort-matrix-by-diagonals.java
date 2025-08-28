class Solution {
    public int[][] sortMatrix(int[][] g) {
        int ro = g.length;
        int nod = 1 + 2 * (ro - 1);
        if (nod == 1)
            return g;

        int noud = nod / 2;
        int nold = nod - noud;

        ArrayList<Integer>[] doArr = new ArrayList[ro]; // decreasing order
        ArrayList<Integer>[] ioArr = new ArrayList[ro-1];  // increasing order

        for (int i = 0; i < ro; i++) {
            doArr[i] = new ArrayList<>();
        }
        for (int i = 0; i < ro-1; i++) {
            ioArr[i] = new ArrayList<>();
        }

        for (int i = 0; i < ro; i++) {
            int x = i;
            int y = 0;
            doArr[i].add(g[x][y]);
            while (oub(x+1, y+1, ro)) {
                x++;
                y++;
                doArr[i].add(g[x][y]);
            }
            Collections.sort(doArr[i], Collections.reverseOrder());
        }

        for (int i = 0; i < ro - 1; i++) {
            int x = 0;
            int y = i + 1;
            ioArr[i].add(g[x][y]);
            while (oub(x+1, y+1, ro)) {
                x++;
                y++;
                ioArr[i].add(g[x][y]);
            }
            Collections.sort(ioArr[i]);
        }

for (int i = 0; i < ro; i++) {
    int x = i, y = 0;
    int k = 0;
    g[x][y] = doArr[i].get(k++);

    while (oub(x+1, y+1, ro)) {
        x++;
        y++;
        g[x][y] = doArr[i].get(k++);
    }
}
for (int i = 0; i < ro - 1; i++) {
    int x = 0, y = i+1;
    int k = 0;
    g[x][y] = ioArr[i].get(k++);

    while (oub(x+1, y+1, ro)) {
        x++;
        y++;
        g[x][y] = ioArr[i].get(k++);
    }
}



return g;
    }

    boolean oub(int x, int y, int ro) {
        if (x >= 0 && y >= 0 && x < ro && y < ro)
            return true;

        return false;
    }
}

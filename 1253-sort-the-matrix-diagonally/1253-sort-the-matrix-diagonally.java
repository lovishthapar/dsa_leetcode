import java.util.*;

class Solution {
    public int[][] diagonalSort(int[][] m) {
        int ro = m.length;
        int co = m[0].length;

        ArrayList<Integer>[] ar = new ArrayList[ro];
        ArrayList<Integer>[] ac = new ArrayList[co];

        for (int i = 0; i < ro; i++) {
            ar[i] = new ArrayList<>();
            int x = i;
            int y = 0;
            while (ib(x, y, ro, co)) {
                ar[i].add(m[x][y]);
                x++;
                y++;
            }
            Collections.sort(ar[i]);
        }

        for (int i = 1; i < co; i++) {
            ac[i] = new ArrayList<>();
            int x = 0;
            int y = i;
            while (ib(x, y, ro, co)) {
                ac[i].add(m[x][y]);
                x++;
                y++;
            }
            Collections.sort(ac[i]);
        }

        for (int i = 0; i < ro; i++) {
            int x = i;
            int y = 0;
            int k = 0;
            while (ib(x, y, ro, co)) {
                m[x][y] = ar[i].get(k++);
                x++;
                y++;
            }
        }

        for (int i = 1; i < co; i++) {
            int x = 0;
            int y = i;
            int k = 0;
            while (ib(x, y, ro, co)) {
                m[x][y] = ac[i].get(k++);
                x++;
                y++;
            }
        }

        return m;
    }

    public boolean ib(int x, int y, int ro, int co) {
        return x >= 0 && x < ro && y >= 0 && y < co;
    }
}

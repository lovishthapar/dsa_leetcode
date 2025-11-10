import java.util.*;

class Solution {
    public int minimumLines(int[][] sp) {
        int n = sp.length;
        if (n == 1) 
        return 0;

        Arrays.sort(sp, (a, b) -> Integer.compare(a[0], b[0]));

        int li = 1;
        for (int i = 1; i < n - 1; i++) {
            long x1 = sp[i - 1][0], y1 = sp[i - 1][1];
            long x2 = sp[i][0], y2 = sp[i][1];
            long x3 = sp[i + 1][0], y3 = sp[i + 1][1];

            if ((y2 - y1) * (x3 - x2) != (y3 - y2) * (x2 - x1)) {
                li++;
            }
        }

        return li;
    }
}

import java.util.Arrays;

class Solution {
    public int sumDistance(int[] n, String s, int d) {
        int le = n.length;
        long[] ps = new long[le];
        long[] newPositions = new long[le];

        for (int i = 0; i < n.length; i++) {
            if (s.charAt(i) == 'R') {
                newPositions[i] = (long)n[i] + d;
            } else {
                newPositions[i] = (long)n[i] - d;
            }
        }

        Arrays.sort(newPositions);
        long dis = 0;
        ps[0] = newPositions[0];

        for (int i = 1; i < le; i++) {
            ps[i] = ps[i - 1] + newPositions[i];
            dis = (dis + Math.abs((long)i * newPositions[i] - ps[i - 1]))% 1_000_000_007;
        }

        return (int)(dis );
    }
}
class Solution {
    public int numberOfPairs(int[][] points) {
        Arrays.sort(points , (a , b) -> {
            if (a[0] == b[0]) return b[1] - a[1];
            return a[0] - b[0];
        });

        int cntPairs = 0;
        for (int i = 0; i < points.length; i++) {
            int b = points[i][1] , last = -1;
            for (int j = i + 1; j < points.length; j++) {
                int a = points[j][1];
                if (a <= b && a > last) {
                    last = a;
                    cntPairs++;
                }
            }
        }
        return cntPairs;
    }
}
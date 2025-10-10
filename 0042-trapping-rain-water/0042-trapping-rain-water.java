class Solution {
    public int trap(int[] h) {

        int s = 0;
        int ans = 0;
        int e = h.length-1;
        while (s < e) {
            if (h[s] == 0)
                s++;
            if (h[e] == 0)
                e--;
            int min = Math.min(h[s], h[e]);
            if (h[e] < h[s]) {
                int i = 0;
                for (i = e - 1; i > s; i--) {
                    if (h[i] > min) {
                        e = i;
                        break;
                    }
                    if (min != 0)
                        ans = ans + (Math.abs(min - h[i]));

                }
                e = i;

            } 
            else {
                int i = 0;
                for (i = s + 1; i < e; i++) {
                    if (h[i] > min) {
                        s = i;
                        break;
                    }
                    if (min != 0)
                        ans = ans + (Math.abs(min - h[i]));

                }
                s = i;

            }

        }
        return ans;
    }

}
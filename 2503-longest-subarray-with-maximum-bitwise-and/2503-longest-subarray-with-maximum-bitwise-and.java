class Solution {
    public int longestSubarray(int[] n) {
        int maxa = Integer.MIN_VALUE;
  
        for (int val : n) {
            if (val > maxa) {
                maxa = val;
            }
        }

       
        int c = 0;  
        int maxCount = 0;

        for (int i = 0; i < n.length; i++) {
            if (n[i] == maxa) {
                c++;
                maxCount = Math.max(maxCount, c);
            } else {
                c = 0;  
            }
        }

        return maxCount;
    }
}

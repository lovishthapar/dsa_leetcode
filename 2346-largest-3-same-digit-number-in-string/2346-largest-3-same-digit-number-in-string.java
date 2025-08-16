class Solution {
    public String largestGoodInteger(String n) {
        String ans = "";
        int m = -1;  
        for (int f = 0; f <= n.length() - 3; f++) {
            String g = n.substring(f, f + 3);

  
            if (g.charAt(0) == g.charAt(1) && g.charAt(1) == g.charAt(2)) {
                int t = g.charAt(0) - '0';
                if (t > m) {
                    m = t;
                    ans = g;
                }
            }
        }

        return ans;
    }
}

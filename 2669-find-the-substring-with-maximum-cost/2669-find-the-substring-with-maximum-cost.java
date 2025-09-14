class Solution {
    public int maximumCostSubstring(String s, String c, int[] v) {
       
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < c.length(); i++) {
            map.put(c.charAt(i), v[i]);
        }

        int maxSoFar = 0, curr = 0;
        for (int i = 0; i < s.length(); i++) 
        {
            int val = map.getOrDefault(s.charAt(i), s.charAt(i) - 'a' + 1);

            
            curr = Math.max(val, curr + val);
            maxSoFar = Math.max(maxSoFar, curr);
        }

        return maxSoFar;
    }
}

class Solution {
    public int minEatingSpeed(int[] p, int h) {
        int n = p.length;
        Arrays.sort(p);
        
        int s = 1;
        int e = p[n-1];
        
        while (s < e) {
            int mid = s + (e - s) / 2;
            
            if (req(p, mid) > h) {
                s = mid + 1;  
            } else {
                e = mid;      
            }
        }
        
        return s;
    }
    
    public int req(int[] p, int r) {
        int tt = 0;
        for (int i = 0; i < p.length; i++) {
            tt += (int)Math.ceil((double)p[i] / r);
        }
        return tt;
    }
}

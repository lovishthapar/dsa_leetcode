class Solution {
    public int maxArea(int[] h)
     {
        int le=h.length;
        int maxw=0;
        int s=0;
        int l=le-1;
        while(s<l)
        {
            int w=(Math.min(h[s],h[l])*(l-s));

            if(maxw<w)
            maxw=w;
            if(h[s]>h[l])
            l--;
            else if(h[s]<=h[l])
            s++;

        }
        return maxw;

        
    }
}
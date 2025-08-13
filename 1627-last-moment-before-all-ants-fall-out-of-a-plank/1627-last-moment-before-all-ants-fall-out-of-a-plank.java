class Solution {
    public int getLastMoment(int n, int[] l, int[] r) 
    {
        Arrays.sort(l);
        Arrays.sort(r);
        int m=0;
        int b=0;
        if(l.length==0)
        return n-r[0];
        if(r.length==0)
        return l[l.length-1];
        if(l.length!=0)
        m=l[l.length-1];
        if(r.length!=0)
          b=r[0];
          
        int t=Math.max(m,(n-b));
        return t;
    }
}
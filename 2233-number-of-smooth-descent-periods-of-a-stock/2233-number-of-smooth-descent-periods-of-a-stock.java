class Solution {
    public long getDescentPeriods(int[] p)
     {
        int le=p.length;
        int c=0;
        long nc=(long)le;
        for(int i=0;i<(le-1);i++)
        {
            if((p[i]-p[i+1])==1)
            {
                c++;

            }
            else
            {
               nc=nc+((long)(c+1)*(long)(c))/2;
               c=0;

            }

        }
        if(c!=0)
        nc=nc+((long)(c+1)*(long)(c))/2;

return nc;
        
    }

}
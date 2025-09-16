class Solution {
    public int minimumArea(int[][] g)
     {
        int ro=g.length;
        int co=g[0].length;
        int xg=ro-1;
        int xm=0;
        int yg=co-1;
        int ym=0;
        for(int i=0;i<ro;i++)
        {
            for(int t=0;t<co;t++)
            {
                if(g[i][t]==1)
                {
                    xg=Math.min(i,xg);
                    yg=Math.min(t,yg);
                    ym=Math.max(ym,t);
                    xm=Math.max(xm,i);
                }

            }
        }
        int sql=xm-xg+1;
        int sqb=ym-yg+1;
        return sql*sqb;

        
        
    }
}
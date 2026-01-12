class Solution {
    public int minTimeToVisitAllPoints(int[][] p)
    {
        int ro=p.length;
        int cx=p[0][0];
        int cy=p[0][1];
        int tt=0;
        for(int i=1;i<ro;i++)
        {
            int mx=Math.abs(p[i][0]-cx);
            int my=Math.abs(p[i][1]-cy);
            if(mx==my)
            tt=tt+mx;
            else if(mx>my)
            {
                tt=tt+(my)+(mx-my);

            }
            else if(my>mx)
            {
                 tt=tt+(mx)+(my-mx);
            }

           cx=p[i][0];
           cy=p[i][1];
            

        }
        return tt;

        
    }
}
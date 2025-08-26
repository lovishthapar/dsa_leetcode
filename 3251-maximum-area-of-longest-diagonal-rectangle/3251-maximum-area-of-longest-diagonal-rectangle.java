class Solution {
    public int areaOfMaxDiagonal(int[][] d) 
    {
        int ro=d.length;
        double mxd=0;
        int im=0;
      int ar=0;
        for(int i=0;i<ro;i++)
        {
            double cdl=0;
            cdl=Math.sqrt(Math.pow(d[i][0],2)+Math.pow(d[i][1],2));
            if(cdl>mxd)
            {
                mxd=cdl;
                im=i;
                ar=d[im][0]*d[im][1];
            }
            if(cdl==mxd)
            {
                if(ar>d[i][0]*d[i][1])
                {

                }
                else
                {
                    ar=d[i][0]*d[i][1];

                }


            }
            
        }
        return ar;
        
    }
}
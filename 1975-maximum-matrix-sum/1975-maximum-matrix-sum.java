class Solution {
    public long maxMatrixSum(int[][] m)
    {

        int ro=m.length;
        int co=m[0].length;
        int nn=0;
        int smn=Integer.MAX_VALUE;
        long sum=0;
        for(int i=0;i<ro;i++)
        {

            for(int f=0;f<co;f++)
            {  
                if(m[i][f]<0)
                {
                nn++;
                }
              
            sum=sum+Math.abs(m[i][f]);

                if(Math.abs(m[i][f])<smn)
                smn=Math.abs(m[i][f]);

            }
           
        }
         if(nn%2==0)
            return sum;
            else
            return sum-2*smn;

    }


    }
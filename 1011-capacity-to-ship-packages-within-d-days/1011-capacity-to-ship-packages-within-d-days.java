class Solution {
    public int shipWithinDays(int[] we, int d)
     {
        int le=we.length;
        int min=0;
        int max=0;
        for(int i=0;i<le;i++)
        {
            if(min<we[i])
            min=we[i];

            max+=we[i];

        }
        int st=min;
        int en=max;
        while(st<en)
        {
            int mid=(en+st)/2;

            int reqd=1;
            int cs=0;
            for(int f=0;f<le;f++)
            {
                
                if(cs+we[f]>mid)
                {
                    reqd++;
                    cs=0;
                }
                cs+=we[f];

            }
            if(reqd>d)
            st=mid+1;
            else
            {
                en=mid;
            }
        }
        return en;



        }
   
    }
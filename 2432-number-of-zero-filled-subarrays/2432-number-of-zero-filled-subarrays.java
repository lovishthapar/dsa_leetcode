class Solution {
    public long zeroFilledSubarray(int[] n)
     {
        int le=n.length;
        long mco=0;
        long co=0;
               for(int i=0;i<le;i++)
        {
            if(n[i]==0)
            {
                co++;
                mco=mco+co;
                

            }
            else
            {
                co=0;

            }


        }
        return mco;
        
    }
}
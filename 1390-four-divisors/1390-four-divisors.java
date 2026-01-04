class Solution {
    public int sumFourDivisors(int[] n)
     {
        int le=n.length;
        int su=0;
        for(int i=0;i<le;i++)
        {
            int no=2;
            int cs=1+n[i];
            for(int g=2;g<n[i];g++)
            {
                if(n[i]%g==0)
                {
                    cs=cs+g;
                    no++;
                }
                if(no>4)
                break;


            }
            if(no==4)
            {
                su+=cs;
            }

        }
        return su;
        
    }
}
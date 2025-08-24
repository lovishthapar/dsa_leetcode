class Solution {
    public int maximum69Number (int n)
    {
        int g=n;
        int arr[]=new int[6];
        int noi=0;
        while(g>0)
        {
            int t=g%10;
            g=g/10;
            arr[noi]=t;
            noi++;
            

        }
        int c=0;
        for(int t=noi;t>=0;t--)
        {
            if(arr[t]==6)
            {
                arr[t]=9;
                c=1;
                break;

            }

        }
        if(c==0)
        return n;
        
        int nn=0;
        for(int i=noi;i>=0;i--)
        {
            nn=nn*10+arr[i];


        }
        return nn;


    }
        
}
class Solution {
    public int bestClosingTime(String c)
     {
        int n=c.length();
        int min=Integer.MAX_VALUE;
    int ys=0;
    int ns=0;
    for(int i=0;i<n;i++)
    {
        if(c.charAt(i)=='N')
        ns=ns+1;
        else
        ys=ys+1;
    }
    int cn=0;
    int cy=ys;
    int mi=0;
    int p=0;
    p=cy+cn;
        if(min>p)
        {
            min=p;
            mi=0;
        }
    for(int i=0;i<n;i++)
    {  

        if(c.charAt(i)=='N')
        {
            cn++;
        }
        else
        {
            cy--;
        }
        p=cy+cn;
        if(min>p)
        {
            min=p;
            mi=i+1;
        }
        
        
    }


return mi;
        
    }
}
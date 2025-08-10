class Solution {
    public int mod=1000000007;
    public int countOrders(int n)
     {
        if(n==1)
        return 1;
        long f[]=new long[n+1];
        f[1]=1;
        for(int i=1;i<n;i++)
        {
            f[i+1]=f[i]*(i+1)*(2*i+1)%mod;

        }
        return (int)f[n];
        
    }
}
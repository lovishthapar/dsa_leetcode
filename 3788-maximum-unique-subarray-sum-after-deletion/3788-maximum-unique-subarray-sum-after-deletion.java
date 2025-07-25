class Solution {
    public int maxSum(int[] n)
     {
        int mx=Integer.MIN_VALUE;
        HashMap<Integer,Integer> a=new HashMap<>();
        int sum=0;
        for(int i=0;i<n.length;i++)
        {
            if(n[i]>mx)
            {
                mx=n[i];
            }
            if(!a.containsKey(n[i]) && n[i]>0)
            {
                
                a.put(n[i],1);
                sum=sum+n[i];
            }

        }
        if(mx<0)
        return mx;
        else
        return sum;
    }
}
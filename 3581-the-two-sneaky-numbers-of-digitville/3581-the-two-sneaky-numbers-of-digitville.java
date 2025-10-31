class Solution {
    public int[] getSneakyNumbers(int[] n)
    {
        int le=n.length;
        int ans[]=new int[2];
        HashMap<Integer,Integer> a=new HashMap<>();
        int co=0;
        for(int i=0;i<le;i++)
        {
            if(!a.containsKey(n[i]))
            a.put(n[i],1);
            else
            {
                ans[co]=n[i];
                 co++;           }

        }

        return ans;
    }
}
class Solution {
    public int mf=1;
    public int maxFrequencyElements(int[] n)
     {
        HashMap<Integer,Integer> a=new HashMap<>();
        int le=n.length;
        if(le==0)
        return 0;
        int ec=0;
        for(int i=0;i<le;i++)
        {
            if(!a.containsKey(n[i]))
            {
            a.put(n[i],1);
            if(mf==1)
            ec++;
            }
            else
            { int t=a.get(n[i])+1;
                a.put(n[i],t);
                if(t==mf)
                {
                    ec++;
                }
                if(t>mf)
                {
                mf=t;
                 ec=1;
                }
            }
        }
        return ec*mf;

        
    }
}
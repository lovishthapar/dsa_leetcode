class Solution {
    public int maximumCostSubstring(String s, String c, int[] v)
     {
        HashMap<Character,Integer> a=new HashMap<>();
        for(int i=0;i<c.length();i++)
        {
            a.put(c.charAt(i),v[i]);


        }
      
        int ds=0;
        if(a.containsKey(s.charAt(0)))
            {
                ds=a.get(s.charAt(0));


            }
            else
            {
                ds=((int)(s.charAt(0))-96);

            }
            int res=ds;
        
        for(int i=1;i<s.length();i++)
        {
            int t=0;
            if(a.containsKey(s.charAt(i)))
            {
                t=a.get(s.charAt(i));


            }
            else
            {
                t=((int)(s.charAt(i))-96);

            }
            ds=Math.max(ds+t,t);
            res=Math.max(res,ds);
            


        }
        if(res<0)
        return 0;
        return res;
        
    }
}
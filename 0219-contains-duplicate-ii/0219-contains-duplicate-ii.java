class Solution {
    public boolean containsNearbyDuplicate(int[] n, int k) 
    {
        int le=n.length;
         if(k==0)
        return false;
        if(le==2)
        {
            if(n[0]==n[1])
            return true;
        }
       
        
        if(k>=le)
        {
            HashMap<Integer,Integer> a=new HashMap<>();
            for(int i=0;i<le;i++)
            {
                if(a.containsKey(n[i]))
                return true;
                else
                {

                    a.put(n[i],1);
                }

            }

        }
       

        for(int i=0;i<(le-1);i++)
        {
            if(i<(le-k))
            {
            for(int f=i+1;f<=(i+k);f++)
            {
                if(n[i]==n[f])
                {
                    return true;
                }

            }

        }
        else
        {
             for(int f=i+1;f<le;f++)
            {
                if(n[i]==n[f])
                {
                    return true;
                }

            }



        }
    
       

        
    }
     return false;
}
}
class Solution {
    public int removeDuplicates(int[] n)
     {
        int l=n.length;
       int co=0;
               HashMap<Integer,Integer> map = new HashMap<>();
                int ansq[]=new int[l];
        for(int i=0;i<l;i++)
        {
            if(map.containsKey(n[i]))
               { 
                int gf=0;
                map.put(n[i],(map.get(n[i])+1));
                 gf=map.get(n[i]);
                if(gf<=2)
                {
                    ansq[co]=n[i];
                     co++;
                }
               
            }
            else
            {
                map.put(n[i],1);
                ansq[co]=n[i];
                co++;
            }
        }
        System.arraycopy(ansq,0,n,0,l);

    
        return co;
    }
}
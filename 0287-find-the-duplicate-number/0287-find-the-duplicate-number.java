class Solution {
    public int findDuplicate(int[] n)
     {
           HashMap<Integer,Integer> b=new HashMap<>();
           for(int t=0;t<n.length;t
           ++)
           {
            if(!b.containsKey(n[t]))
            b.put(n[t],1);
            else
            return n[t];

           }
         
       return 0;

        
    }
}
class Solution {
    public int repeatedNTimes(int[] n)
     {
        int le=n.length;
        HashMap<Integer,Integer> a=new HashMap<>();
        for(int i=0;i<le;i++)
        {
            if(!a.containsKey(n[i]))
            a.put(n[i],1);
            else
            return n[i];

        }
        return 0;
    }
}
class Solution {
    public int earliestTime(int[][] t)
     {
        int e=Integer.MAX_VALUE;
        for(int i=0;i<t.length;i++)
        {
            int val=t[i][0]+t[i][1];
            if(val<e)
            e=val;

        }
        return e;
        
    }
}
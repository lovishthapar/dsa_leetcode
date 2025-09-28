class Solution {
    public int largestPerimeter(int[] n)
     {
        int le=n.length;

        Arrays.sort(n);
        int en=le-1;
        
        while(en>=2)
        {
            if((n[en-1]+n[en-2])>n[en])
            {
                return (n[en-1]+n[en-2]+n[en]);

            }
            else
            {
                en--;
            }

        }
        return 0;
        
    }
}
class Solution {
    public int triangleNumber(int[] n)
     {
        int le=n.length;
              Arrays.sort(n);
               int co=0;
               for(int i=le-1;i>=0;i--)
               {
                int s=0;
                int e=i-1;
                while(s<e)
                {
                    int sum=n[s]+n[e];
                    if(sum>n[i])
                    {
                        co=co+(e-s);
                        e--;
                    }
                    else
                    s++;

                }
               }
               return co;



        
    }
}
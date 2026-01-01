class Solution {
    public int[] plusOne(int[] d)
     {int l=d.length;
       int ge=0;
       int ne[]=new int[l+1];
       

       for(int i=l-1;i>=0;i--)
     {

    
        if(d[i]<9)
        {
            d[i]++;
            return d;
        }
        else
        {
            d[i]=0;
        }
       

        
       }
       ne[0]=1;
       return ne;

     }

       }
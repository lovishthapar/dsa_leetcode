class Solution {
    public int maxDivScore(int[] n, int[] d) 
    {
    int max=0;
    int gf=0;
    int l=n.length;
    int f=d.length;
    for(int i=0;i<f;i++)
    {int t=0;
        for(int g=0;g<l;g++)
        {if(n[g]%d[i]==0)
           t++;

        }
        if(max<t)
       { 
           max=t;
           gf=i;
       }
       if(max==t)
       {
           if(d[i]<d[gf])
           {
            gf=i;
           }

       }
        
    }
return d[gf];

        
    }
}
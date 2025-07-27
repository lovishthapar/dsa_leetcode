class Solution {
    public int countHillValley(int[] n)
     {
        int le=n.length;
        
        int to=0;
        int lv=0;
        for(int i=1;i<le-1;i++)
      {
         int de=rc(n,i);
         int fe=lc(n,i);
         if(de==0 || fe==0)
         continue;

         else if(de==1 && fe==2)
         continue;
         
         
         else if(de==2 && fe==1)
         continue;
           
           
           else
           {
            if(n[i]!=lv)
             to++;
           lv=n[i];
           }

       }
       return to;
        
    }
    public int rc(int n[],int i)
    { 
        for(int g=i+1;g<n.length;g++)
        {
            if(n[g]!=n[i])
            {
                if(n[g]>n[i])
                return 1;
                if(n[g]<n[i])
                return 2; 

            }


        }
      return 0;


    }
    public int lc(int n[],int i)
    {
        for(int g=i-1;g>=0;g--)
        {
            if(n[g]!=n[i])
            {
                if(n[g]>n[i])
                return 1;
                if(n[g]<n[i])
                return 2; 

            }


        }
      return 0;


    }
}
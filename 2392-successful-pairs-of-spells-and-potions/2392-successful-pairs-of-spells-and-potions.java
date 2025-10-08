import java.util.*;
class Solution {
    public int[] successfulPairs(int[] s, int[] p, long su) 
    {
        int n=s.length;
        int m=p.length;
        int pa[]=new int[n];
        Arrays.sort(p);
       
    for(int i=0;i<n;i++)
    { 
        int co=0;
         int st=0;
         int e=m-1;
         while(st<=e)
         {
            int mid=(st+((e-st)/2));
           long mul=p[mid]*(long)s[i];
           if(mul>=su)
           {
             co=co+(e-mid+1);
             e=mid-1;
           }
           else
           {
            st=mid+1;
           }

         }
         pa[i]=co;
      
    }
    return pa;
    
 }
}
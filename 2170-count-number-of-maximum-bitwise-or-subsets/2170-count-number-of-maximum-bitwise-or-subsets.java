class Solution {
    public int nos=0;
    public int countMaxOrSubsets(int[] n)
     {
        int le=n.length;
        int mbto=0;
       
        for(int i=0;i<le;i++)
     {
         mbto=mbto | n[i];
          

     }
     if(mbto==0)
     nos=1;

     dfs(0,n,0,mbto);
     return nos;

    }
    public void dfs(int i,int n[],int cbo,int mbto)
    {
              int d=cbo|n[i];
         
           if(d==mbto)
           nos++;

             if(i==(n.length-1))
           {
            return;        
           }
      

        dfs(i+1,n,d,mbto);
        dfs(i+1,n,cbo,mbto);
     
    }
}
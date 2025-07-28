class Solution {
      public List<List<Integer>> y=new ArrayList<>();
    public List<List<Integer>> subsets(int[] n) 
    {
        
      List<Integer> a=new ArrayList<>();
        int le=n.length;
      
          dfs(0,n,a,y);
        return y;
        
    }
    public void dfs(int i,int n[],List<Integer> a, List<List<Integer>> y)
    {
        if(i==n.length-1)
        {
             a.add(n[i]);
            y.add(new ArrayList<>(a));

              int s=a.size();
        a.remove(s-1);
        y.add(new ArrayList<>(a));

        return;
             

        }
        a.add(n[i]);
        dfs(i+1,n,a,y);
        int s=a.size();
        a.remove(s-1);
        dfs(i+1,n,a,y);
        
    }
}
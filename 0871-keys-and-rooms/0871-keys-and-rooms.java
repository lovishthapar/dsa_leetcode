class Solution {
    public int rut=0;
    public boolean canVisitAllRooms(List<List<Integer>> r) 
    {
        int nr=r.size();
        int vis[]=new int[nr];
          int t=0;
            int et=r.get(t).size();

             for(int ng=0;ng<et;ng++)
             {
                int fr=r.get(t).get(ng);

            if(vis[fr]==0)
            rt(t,vis,r);

             }
        
        if(rut==nr)
        return true;

     return false;
    }
    public void rt(int cr,int vis[],List<List<Integer>> r)
    {
        if(vis[cr]==1)
        return;
        vis[cr]=1;
         rut++;
        int sr=(r.get(cr)).size();
        for(int f=0;f<sr;f++)
        {
            int qr=(r.get(cr)).get(f);
            if(vis[qr]==0)
            rt(qr,vis,r);
        }
    return;

    }    
}
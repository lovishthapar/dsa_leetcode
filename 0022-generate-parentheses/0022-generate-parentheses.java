class Solution {
    public List<String> a=new ArrayList<>();
    public List<String> generateParenthesis(int n) 
    {
          int no=0;
          int nc=0;
          backt(new StringBuilder(),no,nc,n,0);  
             return a;
 
    }

public void backt(StringBuilder b,int no,int nc,int n,int co)
    {
        
        if(nc==n && no==n)
        {
            a.add(b.toString());
        return;
        }
        if(no<n)
        {
            b.append("(");
            backt(b,no+1,nc,n,co+1);
            b.deleteCharAt(b.length()-1);
        }
        if(nc<n && co!=0)
        {
            b.append(")");
            backt(b,no,nc+1,n,co-1);
             b.deleteCharAt(b.length()-1);

        }
        
return;
    }
}
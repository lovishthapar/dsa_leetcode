class Solution {
    public String maxSumOfSquares(int nu, int su)
    {
        if(nu==1)
        {
            if(su>9)
            return "";
            else
            {
                StringBuilder a=new StringBuilder();
                a.append(su);
                return a.toString();
            }
            
        }
        if(su>(9*nu))
        return "";
        StringBuilder a=new StringBuilder();
        int cs=su;
        for(int i=0;i<nu;i++)
        {
            if(su>=9)
            {
                su=su-9;
                a.append(9);
            }
            else
            {
                a.append(su);
                su=0;
            }
            

        }
        return a.toString();








     
        
    }
}
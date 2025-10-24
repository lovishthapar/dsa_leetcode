class Solution {
    public boolean squareIsWhite(String c)
     {
        int s=(int)(c.charAt(0))-97;
        int g=c.charAt(1)-'0';
        if(s%2==0)
        {
            if(g%2==0)
            return true;
            return false;
        }
        else
        {
            if(g%2==0)
            return false;

        }
        return true;
                
    }
}
class Solution {
    public boolean canAliceWin(int n) 
    {
        if(n<10)
        return false;

        int diff=n-10;
        if(diff<9)
        return true;
        else
        {
            int c=0;
            int g=9;
            while(diff>0)
            {
                diff=diff-g;
                g--;
                if(diff<0)
                break;
                c++;
                if(g==0)
                break;
            }
            if(c%2==0)
            {
                return true;
            }
            else
            {
                return false;

            }


        }
    }
}
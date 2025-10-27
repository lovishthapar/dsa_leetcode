class Solution {
    public int numberOfBeams(String[] b)
     {
        int ro=b.length;
        int cu=0;
        int pnz=0;
        int tl=0;
        for(int i=0;i<ro;i++)
        {
            
            cu=0;
            int le=b[i].length();
            for(int g=0;g<le;g++)
            {
                if(b[i].charAt(g)=='1')
                cu++;
            }
            if(cu==0)
            {

            }
            else
            {
                tl=tl+cu*pnz;

            }
            if(cu!=0)
            pnz=cu;

        }
        return tl;
        
    }
}
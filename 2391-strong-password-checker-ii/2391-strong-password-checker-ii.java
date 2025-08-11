class Solution {
    public boolean strongPasswordCheckerII(String p)
     {
        if(p.length()<8)
        {
            return false;

        }
        int nou=0;
        int nol=0;
        int nod=0;
        int nos=0;
        int le=p.length();
        for(int i=0;i<le;i++)
        {
            if(i!=le-1)
            if(p.charAt(i)==p.charAt(i+1))
            {
                return false;


            }
            int f=(int)(p.charAt(i));
            if(f>=97 && f<=122)
            {
                nol++;

            }
            if(f>= 65 && f<=90)
            {
                nou++;

            }
              if(f>= 48 && f<=57)
            {
                nod++;

            }
             if((f>= 33 && f<=47)|| f==64 || f==94)
            {
                nos++;

            }

        }
        if(nou==0 || nos==0 || nol==0 ||nod==0)
        return false;

        return true;


            
        
        
    }
}
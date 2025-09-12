class Solution {
    public boolean doesAliceWin(String s) 
    {
        int le=s.length();
        int cv=0;
        for(int i=0;i<le;i++)
       {
        if(isvowel(s.charAt(i)))
        {
            return true;

        }

       }
       return false;
 
    }
    public boolean isvowel(char a)
    {
        if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u')
        return true;
        else
        return false;

    }
}
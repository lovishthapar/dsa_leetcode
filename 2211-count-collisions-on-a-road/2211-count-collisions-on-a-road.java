class Solution {
    public int countCollisions(String dir)
    {
        int noc = 0;
        int l = dir.length();
        int k = 0, j = l - 1;

        while (k < l && dir.charAt(k) == 'L') k++;
        while (j >= 0 && dir.charAt(j) == 'R') j--;


        int ri = 0;
        int le = 0;
        int stb = 0;

        for(int i = k; i <=j; i++)
        {
            char c = dir.charAt(i);

            if(c == 'R')
            {
                ri++;
            }
            else if(c == 'L')
            {
                if(ri != 0)
                {
                    noc += ri + 1;
                    ri = 0;
                    stb = 1;
                }
                else if(stb == 1)
                {
                    noc += 1;
                }
            }
            else
            {
                if(ri != 0)
                {
                    noc += ri;
                    ri = 0;
                }
                stb = 1;
            }
        }
        return noc;
    }
}

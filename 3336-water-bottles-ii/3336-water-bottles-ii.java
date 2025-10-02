class Solution {
    public int maxBottlesDrunk(int nb, int ne)
     {
        int eb=nb;
        int bd=nb;
        int fb=0;
        while(eb>=ne)
        {
         
                eb=eb-ne;
                fb++;
            bd++;
         eb++;
            ne++;

        }

            return bd;

        
        
    }
}
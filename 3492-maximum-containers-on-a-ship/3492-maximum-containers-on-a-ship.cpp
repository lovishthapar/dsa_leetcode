class Solution {
public:
    int maxContainers(int n, int w, int mw)
    {
        int cell=n*n;
 
        int ships=0;
        while(ships<cell)
        {   
            if (ships*w==mw){
                
                break;
            }

            if (ships*w>mw){
                ships--;
                break;
            }

            ships++;

        }

        if(ships==cell){
             if (ships*w>mw){
                ships--;
                
            }
        }

        return ships;
    }
};
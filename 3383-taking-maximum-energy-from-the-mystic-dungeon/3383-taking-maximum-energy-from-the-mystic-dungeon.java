class Solution {
    public int maxe=Integer.MIN_VALUE;
    public int maximumEnergy(int[] e, int k) 
    {
        int l=e.length;
        int ef=0;
        for(int i=0;i<l;i++)
        {
            ef=e[i];
            energy(i,e,k,ef);
 
       }
       return maxe;   
    }
    void energy(int i,int e[],int k,int ef)
    {
        int nw=i+k;
        if((i+k)>=e.length)
        { 
                        if(maxe<ef)
                        {
                            maxe=ef;

                        }
                        return;
        }
        
         
        ef=ef+e[nw];
        energy(nw,e,k,ef);


    }

}
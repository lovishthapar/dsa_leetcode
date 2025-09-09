class Solution {
    public int findClosest(int x, int y, int z) 
    {
        int dif1=Math.abs(z-x);
        int dif2=Math.abs(z-y);
        
        if(dif1>dif2)
        return 2;
        if(dif1<dif2)
        return 1;

        return 0;


        
    }
}
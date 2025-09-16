class Solution {
    public void sortColors(int[] n) 
    {
        int le=n.length;
     int l=0;
     int hi=n.length-1;
     int mid=0;
     while(mid<=hi)
     {
        if(n[mid]==0)
        {
            int temp=n[mid];
            n[mid++]=n[l];
            n[l++]=temp;

        }
        else if(n[mid]==1)
        {
            mid++;

        }
        else if(n[mid]==2)
        {
            int temp=n[mid];
            n[mid]=n[hi];
            n[hi--]=temp;
        }


     }
     return;



    }
}
class Solution {
    public int maxSubArray(int[] arr) 
    {
           
        int res = arr[0];
        
        int m = arr[0];

        for (int i = 1; i < arr.length; i++) {
          
            m = Math.max(m + arr[i], arr[i]);
          
            
            res = Math.max(res, m);
        }
        return res;
    }


      
           }
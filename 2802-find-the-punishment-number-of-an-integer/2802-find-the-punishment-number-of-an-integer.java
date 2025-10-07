class Solution {
    public int punishmentNumber(int n) 
    {
        int sum=1;
        int arr[]={1,9,10,36,45,55,82,91,99,100,235,297,369,370,379,414,657,675,703,756,792,909,918,945,964,990,991,999,1000};
          int le=arr.length;
          int co=0;
          int s=0;
            for(int i=0;i<le;i++)
          {
            if(n<arr[i])
            break;
            
           s=s+(int)Math.pow(arr[i],2);


          }
        
        return s;

       
        
    }
}
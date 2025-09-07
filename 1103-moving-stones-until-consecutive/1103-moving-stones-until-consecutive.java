class Solution {
    public int[] numMovesStones(int a, int b, int c)
     {
        int nr[]=new int[3];
        nr[0]=a;
        nr[1]=b;
        nr[2]=c;
        Arrays.sort(nr);
  
         a=nr[0];
         b=nr[1];
         c=nr[2];
     int ans[]=new int[2];
         int no1=b-a-1;
         int no2=c-b-1;
         int no3=c-a-2;
         if(no1==0 && no2==0)
         {
            ans[0]=0;
            ans[1]=0;
            return ans;

         }
         else if(no1==1 || no2==1 || no1==0 ||no2==0)
         {
            ans[0]=1;

         }
         else
         {
            ans[0]=2;

         }


         ans[1]=no3;
         return ans;

       

    }
}
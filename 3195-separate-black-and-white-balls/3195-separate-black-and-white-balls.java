class Solution {
    public long minimumSteps(String s) 
    {
        long tnm=0;
        int t=0;
        int co=0;
        int no=0;
        for(int i=s.length()-1;i>=0;i--)
        {  
             if(s.charAt(i)=='0' && t==0)
             {
                t=1;
            for(int f=i-1;f>=0;f--)
            {
                 if(s.charAt(f)=='1')
                 {
                    co++;
                 }

            }
            tnm=tnm+co; 
           
             }
   else if(s.charAt(i)=='0' && t==1)
{
    tnm=tnm+co-no;

}
else if(s.charAt(i)=='1' && t==1)
{
    no++;
}
        }
        return tnm;
    }
}
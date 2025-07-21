class Solution {
    public String makeFancyString(String s)
     {
        int le=s.length();
        if(le==1 || le==2)
        return s;
        StringBuffer a=new StringBuffer();
        for(int i=0;i<le-2;i++)
        {
                        

            if((s.charAt(i)==s.charAt(i+1))&&(s.charAt(i+1)==s.charAt(i+2)))
            {
                     }
            else
            {
                 a.append(s.charAt(i));
                
            }


        }
        a.append(s.charAt(le-2));
        a.append(s.charAt(le-1));

        return a.toString();
        
    }
}
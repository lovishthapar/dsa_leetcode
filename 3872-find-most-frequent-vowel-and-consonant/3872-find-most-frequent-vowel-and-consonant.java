class Solution {

    public int maxFreqSum(String s) 
    {
        int mv=0;
        int mc=0;
        HashMap<Character,Integer> a=new HashMap<>();
        int le=s.length();
        for(int i=0;i<le;i++)
        {
                 if(a.containsKey(s.charAt(i)))
                a.put(s.charAt(i),a.get(s.charAt(i))+1);
                            else
                            {
                                a.put(s.charAt(i),1);
                            }


                if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='u'||s.charAt(i)=='o')
                {
                    int e=a.get(s.charAt(i));
                    if(e>mv)
                    {
                        mv=e;
                    }

                }
                else
                {
                    int e=a.get(s.charAt(i));
                    if(e>mc)
                    {
                        mc=e;
                    }
                }
            }
             return (mc+mv);
        }

       
    }


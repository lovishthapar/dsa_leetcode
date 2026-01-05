class Solution {
public:
    int maxProduct(int n) 
    {
        int a=n;
        int max_dig = 0;
        int sec_max_dig =0;

        while(a>0)
        {
            
            int t = a%10;
            a = a/10;
            if (max_dig<=t)
            {
                sec_max_dig = max_dig;
                max_dig=t;
            }
            else if(sec_max_dig<=t)
            {
                 sec_max_dig = t;

            }
        }
            return max_dig*sec_max_dig;
            
        }
    };

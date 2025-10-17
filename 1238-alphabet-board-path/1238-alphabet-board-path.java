class Solution {
    public String alphabetBoardPath(String s) {
        StringBuilder ans = new StringBuilder("");

        HashMap<Character,int[]> hp = new HashMap<>();

        int n = s.length();

        for(char i='a'; i<='z'; i++){
            int a = i-97;
            int r = a/5;
            int c = a%5;
            int x[] = {r,c};
            hp.put(i,x);
        }

        char prev = 'a';

        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            if(ch==prev){
                ans.append("!");
                prev = ch;
            }else{
                int a[] = hp.get(prev);
                int b[] = hp.get(ch);

                int r = b[0]-a[0];
                int c = b[1]-a[1];

                if(ch=='z'){
                    ans.append("D".repeat(r-1));
                    ans.append("L".repeat(-c));
                    ans.append("D");
                    ans.append("!");
                    prev = ch;
                    continue;
                }

                if(r>=0 && c>=0){
                    ans.append("D".repeat(r));
                    ans.append("R".repeat(c));
                }else if(r<=0 && c<=0){
                    ans.append("U".repeat(-r));
                    ans.append("L".repeat(-c));
                }else if(r>=0 && c<=0){
                    ans.append("D".repeat(r));
                    ans.append("L".repeat(-c));
                }else{
                    ans.append("U".repeat(-r));
                    ans.append("R".repeat(c));
                }
                ans.append("!");
                prev = ch;
            }
        }
        return ans.toString();
    }
}
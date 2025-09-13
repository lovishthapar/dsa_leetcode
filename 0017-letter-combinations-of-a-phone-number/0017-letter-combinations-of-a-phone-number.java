class Solution {
    public List<String> ae = new ArrayList<>();

    public List<String> letterCombinations(String d) {
        ae.clear(); 
        if (d == null || d.length() == 0) return ae;

        int n = d.length();
        String a[] = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        int di[] = new int[n];
        for (int i = 0; i < n; i++) {
            di[i] = (
                int)d.charAt(i) - 48; 
        }

        yu(0, di, new StringBuilder(), a);
        return ae;
    }

    public void yu(int ci, int d[], StringBuilder e, String a[]) {
        if (ci == d.length) {
            ae.add(e.toString());
            return;
        }

        for (int i = 0; i < a[d[ci]].length(); i++) {
            e.append(a[d[ci]].charAt(i));     
            yu(ci + 1, d, e, a);            
            e.deleteCharAt(e.length() - 1);   
        }
    }
}

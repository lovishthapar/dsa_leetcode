class Solution {
    public int compareVersion(String v1, String v2) {
        String a1[] = v1.split("\\.");
        String a2[] = v2.split("\\.");
        int l1 = a1.length;
        int l2 = a2.length;
        int n = Math.max(l1, l2);

        for (int i = 0; i < n; i++) {
            int val1 = 0, val2 = 0;

            if (i < l1) {  
                int le1 = a1[i].length();
                for (int f = 0; f < le1; f++) {
                    int de = ((int)(a1[i].charAt(f))) - 48;
                    val1 = val1 * 10 + de;
                }
            }

            if (i < l2) {  
                int le2 = a2[i].length();
                for (int g = 0; g < le2; g++) {
                    int de = ((int)(a2[i].charAt(g))) - 48;
                    val2 = val2 * 10 + de;
                }
            }

            if (val1 > val2) return 1;
            if (val2 > val1) return -1;
        }

        return 0;
    }
}

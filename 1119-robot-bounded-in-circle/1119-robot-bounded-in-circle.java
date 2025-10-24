class Solution {
    public boolean isRobotBounded(String i) {
        int cd = 1;
        int cpx = 0, cpy = 0;

        for (int e = 0; e < i.length(); e++) {
            char ch = i.charAt(e);

            if (ch == 'G') {
                if (cd == 1) cpy++;
                else if (cd == -1) cpy--;
                else if (cd == 2) cpx++;
                else if (cd == -2) cpx--;
            } 
            else if (ch == 'L') {
                if (cd == 1) cd = -2;
                else if (cd == 2) cd = 1;
                else if (cd == -1) cd = 2;
                else if (cd == -2) cd = -1;
            } 
            else if (ch == 'R') {
                if (cd == 1) cd = 2;
                else if (cd == 2) cd = -1;
                else if (cd == -1) cd = -2;
                else if (cd == -2) cd = 1;
            }
        }

        return (cpx == 0 && cpy == 0) || (cd != 1);
    }
}

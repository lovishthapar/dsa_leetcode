class Solution {
    public boolean validTicTacToe(String[] b) {
        int nox = 0, noo = 0;
        for (int i = 0; i < 3; i++) {
            for (int f = 0; f < 3; f++) {
                if (b[i].charAt(f) == 'O') noo++;
                if (b[i].charAt(f) == 'X') nox++;
            }
        }

        if (noo > nox) return false;
        if (nox - noo > 1) return false;

        boolean xwon = iswin(b, 'X');
        boolean owon = iswin(b, 'O');

        if (xwon && owon) return false;
        if (xwon && nox == noo) return false;
        if (owon && nox > noo) return false;

        return true;
    }

    public boolean iswin(String[] b, char c) {
    
        for (int i = 0; i < 3; i++) {
            if (b[i].charAt(0) == c && b[i].charAt(1) == c && b[i].charAt(2) == c) return true;
            if (b[0].charAt(i) == c && b[1].charAt(i) == c && b[2].charAt(i) == c) return true;
        }

        if (b[0].charAt(0) == c && b[1].charAt(1) == c && b[2].charAt(2) == c) return true;
     
        if (b[0].charAt(2) == c && b[1].charAt(1) == c && b[2].charAt(0) == c) return true;

        return false;
    }
}

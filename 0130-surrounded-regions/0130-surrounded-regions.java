class Solution {
    int[] row = {1, -1, 0, 0};
    int[] col = {0, 0, -1, 1};

    public void solve(char[][] board) {
        int r = board.length;
        int c = board[0].length;
        for (int i = 0; i < r; i++) {
            if (board[i][0] == 'O') dfs(i, 0, board);
            if (board[i][c - 1] == 'O') dfs(i, c - 1, board);
        }
        for (int j = 0; j < c; j++) {
            if (board[0][j] == 'O') dfs(0, j, board);
            if (board[r - 1][j] == 'O') dfs(r - 1, j, board);
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (board[i][j] == 'O') board[i][j] = 'X';
                else if (board[i][j] == 'S') board[i][j] = 'O';
            }
        }
    }

    private void dfs(int i, int j, char[][] b) {
        if (i < 0 || j < 0 || i >= b.length || j >= b[0].length || b[i][j] != 'O') return;
        b[i][j] = 'S';

        for (int d = 0; d < 4; d++) {
            int ni = i + row[d];
            int nj = j + col[d];
            dfs(ni, nj, b);
        }
    }
}

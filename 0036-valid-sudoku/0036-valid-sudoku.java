class Solution {
    public boolean isValidSudoku(char[][] board) {
        int n = board.length;
        
        for (int i = 0; i < n; i++) {
            boolean[] visited = new boolean[10];
            for (int j = 0; j < n; j++) {
                if (!isValid(board[i][j], visited))
                    return false;
            }
        }
        for (int j = 0; j < n; j++) {
            boolean[] visited = new boolean[10];
            for (int i = 0; i < n; i++) {
                if (!isValid(board[i][j], visited))
                    return false;
            }
        }
        
        for (int i = 0; i < n; i += 3) {
            for (int j = 0; j < n; j += 3) {
                if (!isValidSubgrid(i, j, board))
                    return false;
            }
        }
        
        return true;
    }
    
    private boolean isValid(char cell, boolean[] visited) {
        if (cell == '.') return true;
        int num = cell - '0';
        if (num < 1 || num > 9 || visited[num]) return false;
        visited[num] = true;
        return true;
    }
    
    private boolean isValidSubgrid(int row, int col, char[][] board) {
        boolean[] visited = new boolean[10];
        for (int i = row; i < row + 3; i++) {
            for (int j = col; j < col + 3; j++) {
                if (!isValid(board[i][j], visited))
                    return false;
            }
        }
        return true;
    }
}

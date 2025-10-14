import java.util.*;

class Solution {
    public int minimumMoves(int[][] grid) {
        int n = grid.length;
        boolean[][][] visited = new boolean[n][n][2]; // 0 = horizontal, 1 = vertical
        Queue<int[]> q = new LinkedList<>();
        
        // Start: tail(0,0), head(0,1), orientation = 0 (horizontal)
        q.add(new int[]{0, 0, 0, 0}); // x, y, orientation, moves
        visited[0][0][0] = true;
        
        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int x = cur[0], y = cur[1], orient = cur[2], moves = cur[3];
            
            // Goal: horizontal position at bottom-right
            if (x == n - 1 && y == n - 2 && orient == 0)
                return moves;
            
            // Move right
            if (orient == 0) { // horizontal
                if (y + 2 < n && grid[x][y + 2] == 0 && !visited[x][y + 1][0]) {
                    visited[x][y + 1][0] = true;
                    q.add(new int[]{x, y + 1, 0, moves + 1});
                }
                // Move down
                if (x + 1 < n && grid[x + 1][y] == 0 && grid[x + 1][y + 1] == 0 && !visited[x + 1][y][0]) {
                    visited[x + 1][y][0] = true;
                    q.add(new int[]{x + 1, y, 0, moves + 1});
                }
                // Rotate clockwise
                if (x + 1 < n && grid[x + 1][y] == 0 && grid[x + 1][y + 1] == 0 && !visited[x][y][1]) {
                    visited[x][y][1] = true;
                    q.add(new int[]{x, y, 1, moves + 1});
                }
            } else { // vertical
                // Move down
                if (x + 2 < n && grid[x + 2][y] == 0 && !visited[x + 1][y][1]) {
                    visited[x + 1][y][1] = true;
                    q.add(new int[]{x + 1, y, 1, moves + 1});
                }
                // Move right
                if (y + 1 < n && grid[x][y + 1] == 0 && grid[x + 1][y + 1] == 0 && !visited[x][y + 1][1]) {
                    visited[x][y + 1][1] = true;
                    q.add(new int[]{x, y + 1, 1, moves + 1});
                }
                // Rotate counterclockwise
                if (y + 1 < n && grid[x][y + 1] == 0 && grid[x + 1][y + 1] == 0 && !visited[x][y][0]) {
                    visited[x][y][0] = true;
                    q.add(new int[]{x, y, 0, moves + 1});
                }
            }
        }
        return -1;
    }
}

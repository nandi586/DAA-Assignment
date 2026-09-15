class Solution {
    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int count = 0;

        while(true) {

            int[][] new_grid = new int[m][n];

            for(int i = 0; i < m; i++) {
                new_grid[i] = grid[i].clone();
            }

            boolean spoil = false;

            for(int i = 0; i < m; i++) {
                for(int j = 0; j < n; j++) {

                    if(new_grid[i][j] == 1) {

                        if((i > 0 && grid[i-1][j] == 2) ||
                           (i < m-1 && grid[i+1][j] == 2) ||
                           (j > 0 && grid[i][j-1] == 2) ||
                           (j < n-1 && grid[i][j+1] == 2)) {

                            new_grid[i][j] = 2;
                            spoil = true;
                        }
                    }
                }
            }

            if(spoil == false) {

                for(int i = 0; i < m; i++) {
                    for(int j = 0; j < n; j++) {

                        if(new_grid[i][j] == 1) {
                            return -1;
                        }
                    }
                }

                return count;
            }

            count++;

            grid = new_grid;
        }
    }
}
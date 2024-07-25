package Easy;

public class LC0463_Island_Perimeter {
    public int islandPerimeter(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int land = 0;
        int dupStripe = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == 1) {
                    land++;
                    if (i != 0) {
                        if (grid[i-1][j] == 1) {
                            dupStripe++;
                        }
                    }
                    if (j != 0) {
                        if (grid[i][j - 1] == 1) {
                            dupStripe++;
                        }
                    }
                }
            }
        }
        return ((land*4) - (dupStripe*2));
    }
}

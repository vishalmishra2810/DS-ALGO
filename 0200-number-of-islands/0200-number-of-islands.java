class Solution {
    public int numIslands(char[][] grid) {
        
        int m = grid.length;
        int n = grid[0].length;
        
        int count = 0;
        
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                if(grid[i][j] == '1'){
                    count += dfs(grid, i, j);   
                }
            }
        }
        
        return count;
        
    }
    public int dfs(char[][] grid, int sr, int sc){
            if(sr < 0 || sc < 0 || sr >= grid.length || sc >= grid[0].length || grid[sr][sc] != '1'){
                return 0;
            }
            grid[sr][sc] = '0';
            
            dfs(grid, sr+1,  sc);
            dfs(grid,  sr-1,  sc);
            dfs(grid,  sr,  sc+1);
            dfs(grid,  sr,  sc-1);
            return 1;
    }
}
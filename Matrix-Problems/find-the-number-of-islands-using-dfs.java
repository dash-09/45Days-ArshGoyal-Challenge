// anything will be called as an island if and only if >> it is sorrounded by water and '1' is adjacent and vertically aligned (remember ! no diagonally) 

class Solution {
    public int numIslands(char[][] grid) {
        int row = grid.length; int col = grid[0].length; int no_of_island = 0;
        if(row==0)return 0;
        
        for(int i = 0; i<row;i++){
            for(int j = 0;j<col;j++){
                if(grid[i][j]== '1'){
                    dfs(grid,i,j,row,col);
                    no_of_island +=1; 
                }
            }
        }
            return no_of_island;
    }
    public void dfs (char grid[][] , int x, int y, int row, int col){
        if(x<0 || x>=row || y<0 || y>=col || grid[x][y] !='1'){return ;}
        grid[x][y] = '2';
        dfs(grid,x+1,y,row,col);
        dfs(grid,x,y+1,row,col);
        dfs(grid,x-1,y,row,col);
        dfs(grid,x,y-1,row,col);
        return;
    }
}

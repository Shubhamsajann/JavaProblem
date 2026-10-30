package Level6;

public class _146RatInMaze {

    public static  boolean solve(int[][] maze ,int row ,int col){

      int n = maze.length;

      if(row == n-1 && col ==n-1) return true;

      if(row>=n || col >=n || maze[row][col]==0) {
          return false;
      }
      maze[row][col]=0;
       if(solve(maze,row,col+1)){
           return true;
       }
       if(solve(maze,row+1,col)){
           return true;
       }
       return false;
    }
    public static void main(String[] args) {
      int[][] maze = {
              {1, 1, 0},
              {0, 0, 0},
              {0, 0, 0}
      };

        System.out.println(solve(maze, 0, 0));

    }
}
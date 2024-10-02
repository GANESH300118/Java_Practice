import java.util.*;
public class Soduku
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int row=sc.nextInt();
	int col=sc.nextInt();
	grid=new int[row][col];
	for(int i=0;i<row;i++)
	   for(int j=0;j<col;j++)
	      grid[i][j]=sc.nextInt();
	 if(sudokoSolver(0,0))
	 {
	     for(int i=0;i<row;i++)
	     {
	       for(int j=0;j<col;j++)
	         System.out.print( grid[i][j]+" ");
	      System.out.println();
	     }
	 }
	 else 
	   System.out.println("No solution exist");
	}
	static int[][] grid;
	static boolean sudokoSolver(int row,int col)
	{
	    if(row==grid.length)
	      return true;
	   int nrow=0;
	   int ncol=0;
	   if(col!=grid.length-1)
	   {
	       nrow=row;
	       ncol=col+1;
	   }
	   else 
	   {
	       nrow=row+1;
	       ncol=0;
	   }
	   
	   //when no!=0 jump to next position
	   if(grid[row][col]!=0)
	   {
	       if(sudokoSolver(nrow,ncol))
	         return true;
	   }
	   else 
	   { // try 1-9 all possible ways
	   for(int i=1;i<=9;i++)
	   {
	       if(isSafe(row,col,i))
	       {
	           grid[row][col]=i;
	           if(sudokoSolver(nrow,ncol))
	              return true;
	           grid[row][col]=0;       
	       }
	   }
	       
	   }
	   return false;
	   
	}
	static boolean isSafe(int row,int col,int num)
	{
	    for(int i=0;i<grid.length;i++)
	    {
	        if(grid[i][col]==num)   // same col
	           return false;
	        if(grid[row][i]==num)  //same row
	          return false;
	    }
	    // 3*3 box check
	    int sr=(row/3)*3;
	    int sc=(col/3)*3;
	    for(int i=sr;i<sr+3;i++)
	    for(int j=sc;j<sc+3;j++)
	      if(grid[i][j]==num)
	        return false;
	    return true;      
	}
}

/*
input :
9
9
3 0 6 5 0 8 4 0 0
5 2 0 0 0 0 0 0 0
0 8 7 0 0 0 0 3 1
0 0 3 0 1 0 0 8 0
9 0 0 8 6 3 0 0 5
0 5 0 0 9 0 6 0 0 
1 3 0 0 0 0 2 5 0
0 0 0 0 0 0 0 7 4
0 0 5 2 0 6 3 0 0

output :
3 1 6 5 7 8 4 9 2 
5 2 9 1 3 4 7 6 8 
4 8 7 6 2 9 5 3 1 
2 6 3 4 1 5 9 8 7 
9 7 4 8 6 3 1 2 5 
8 5 1 7 9 2 6 4 3 
1 3 8 9 4 7 2 5 6 
6 9 2 3 5 1 8 7 4 
7 4 5 2 8 6 3 1 9 
*/
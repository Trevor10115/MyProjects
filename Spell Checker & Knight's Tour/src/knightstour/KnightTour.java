package knightstour;

public class KnightTour
{
	static int N = 8;
    public static void main(String args[])
    {    
        Backtrack.solveKT();
    }
    
 static void print(int sol[][])//prints out the board and moves
 {
     for (int x = 0; x < N; x++)
     {
         for (int y = 0; y < N; y++)
         {
             System.out.print(sol[x][y] + " ");
         	 System.out.println();
         }
     }
 }
 
 // checks if i and j are valid
 static boolean isSafe(int x, int y, int sol[][])
 {
  return (x >= 0 && x < N && y >= 0 && y < N && sol[x][y] == -1);
 }
}

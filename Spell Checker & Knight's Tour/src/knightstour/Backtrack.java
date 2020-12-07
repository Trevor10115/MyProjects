package knightstour;

public class Backtrack
{
	 //this method uses backtracking to help solve, returns false if no solution is possible, returns the tour if solution is true. 
    static boolean solveKT()
    {
    	int xM[] = { 2, 1, -1, -2, -2, -1, 1, 2 };
        int yM[] = { 1, 2, 2, 1, -1, -2, -2, -1 };
    	int N = 8;
        int sol[][] = new int[8][8];
        for (int x = 0; x < N; x++)
        {
            for (int y = 0; y < N; y++)
            {
                sol[x][y] = -1;
            }
        }
       //sets starting position at 0,0 
        sol[0][0] = 0; 
        if (!Util.KTUtil(0, 0, 1, sol, xM, yM))
        {
            System.out.println("No solution");
            return false;
        }
        else
        {
            KnightTour.print(sol);
        }
        return true;
    }
}

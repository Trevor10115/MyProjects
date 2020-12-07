package knightstour;
//uses recursion to help solve
public class Util 
{
	static int N = 8;
 static boolean KTUtil(int x, int y, int m1, int sol[][], int m2[],int m3[])
 {
     int k, _x_, _y_;
     if (m1 == N * N)
     {
         return true;
     }
    // tries next move if valid 
     for (k = 0; k < 8; k++)
     {
         _x_ = x + m2[k];
         _y_ = y + m3[k];
         if (KnightTour.isSafe(_x_, _y_, sol)) 
         {
             sol[_x_][_y_] = m1;
             if (KTUtil(_x_,_y_, m1 + 1,sol, m2, m3))
             {
                 return true;
             }
             else
             {
                 sol[_x_][_y_] = -1; // backtracking
             }
         }
     }

     return false;
 }
}

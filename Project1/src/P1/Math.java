package P1;
public class Math {
	
	static long product(int ar[], int n) // takes the array and multiplies its contents 
    { 
        int result = 1; 
        for (int i = 0; i < n; i++) // loop to step through the array
            result = result * ar[i]; 
        return result; //returns result of array
    } 
}

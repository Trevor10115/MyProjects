package P1;
import java.io.*;
import java.util.Scanner;

public class Main
{
	
	public static void main(String[] args) throws Exception
	{
		
	Scanner scanner = new Scanner (new File("number.txt"));
	int[] file_1 = new int [20];
	int i =0;
	while(scanner.hasNextInt())
	{
		file_1[i++] = scanner.nextInt();//imputs contents into array file_1
	}
	
	     int n = file_1.length; // n = file length 
	    
	     QuickSort ob = new QuickSort(); 
	     ob.sort(file_1, 0, n-1); 
	     
	     
	     System.out.println(Math.product(file_1, n) + " Product");//prints product of file
	     System.out.println(QuickSort.printArray(file_1));//prints sorted file in accending order
	     System.out.println(Min_Max.Min(file_1 ) + " Min Value");//prints min value
	     System.out.println(Min_Max.Max(file_1) + " Max value");// prints max value
	     System.out.println("Hello World!"); 
	    
	     
	}
}
	





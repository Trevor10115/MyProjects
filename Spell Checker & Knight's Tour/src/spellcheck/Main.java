package spellcheck;
import java.io.*;
import java.util.Scanner;



public class Main {

	public static void main(String[] args) throws Exception
	{
		
		Scanner scanner = new Scanner (new File("words.txt"));
		String[] file_1 = new String [5];
		int i =0;
		while(scanner.hasNextLine())
		{
			file_1[i++] = scanner.nextLine();//inputs contents into array file_1
		}
		
		
		for(int z = 0; z < file_1.length; z++)
		{
			System.out.println(file_1[z]);//prints contents of array 
		}
		
		System.out.println(spellChecks.Checks(file_1));
		
		
		
		
		
		
	}

}

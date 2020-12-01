package spellcheck;
import java.io.*;
import java.util.Scanner;



public class Main {

	public static void main(String[] args) throws Exception
	{
		
		Scanner scanner = new Scanner (new File("words.txt"));
		String[] file_1 = new String [5];
		int i =0;
		while(scanner.hasNextLine())//inputs contents into array file_1
		{
			file_1[i++] = scanner.nextLine();
		}
		
		
		for(int z = 0; z < file_1.length; z++)//prints contents of array
		{
			System.out.println(file_1[z]);
		}
		
		String[] Correct = {"program", "coding", "water", "coffee", "candy"};//Correctly spelt words
		
		if(spellChecks.checkEquality(Correct, file_1))//Checks if arrays are equal
		{
			System.out.println("Words spelt correct");
		}
		else
		{
			System.out.println("Words not spelt correct");
		}
			
	
		
		
		
		
		
		
	}

}

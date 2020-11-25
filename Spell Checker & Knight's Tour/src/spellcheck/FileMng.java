package spellcheck;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileMng {
	
	static String[] words = readArray("words.txt");
	
	public static String[] readArray(String file)//puts contents of file into an array 
	{
		try
		{
			String[] words = new String[5];
			Scanner s2 = new Scanner(new File(file));
			for (int i = 0; i < 5; i++)
			{
				words[i] = s2.next();
			}
			return words; 
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not found");//throws exception 
		}
		return null;
	}
}

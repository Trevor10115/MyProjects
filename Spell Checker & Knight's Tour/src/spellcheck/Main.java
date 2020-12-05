package spellcheck;
import java.io.*;
import java.util.Scanner;



public class Main {
	
	public static void main(String[] args) throws Exception
	{
		int ctr = 0; 
		BinarySearchTree wordtree = new BinarySearchTree(); 
		Scanner s1 = new Scanner(new File("words.txt"));
		while(s1.hasNextLine())
		{
			ctr++;
		}
		Scanner s2 = new Scanner (new File("words.txt"));
		for (int i = 0; i < ctr; i++)
		{
			wordtree.addNode("Henery", 6);
		}

	}
}

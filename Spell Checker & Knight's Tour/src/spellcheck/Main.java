package spellcheck;
import java.io.*;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;



public class Main {
	// Could not finish. 80% done. The words from the hashtable are counted and the number of letters from each word are stored,
	//along with the incorrectly spelled word. Only thing i did not finish was comparing the 2 and outputting the word that was most similar 
	public static void main(String[] args) throws Exception
	{
		Hashtable<Integer, String> Vocab = new Hashtable<>();//creates hash table
		Scanner Word = new Scanner (System.in);
		String Wrongword;
		
		System.out.println("Enter word");
		Wrongword = Word.nextLine();
		NoOfOccurenceOfCharacters.getOccuringCharWrongword(Wrongword);//passes incorrect word to letter occurrence 
		 
		Vocab.put(1,"read"); //adds words to hash table 
		Vocab.put(2,"red"); 
		Vocab.put(3,"reed"); 
		Vocab.put(4,"reread"); 
		Vocab.put(5,"reef");
		Vocab.put(6,"fear");
		Vocab.put(7,"rear");
		Vocab.put(8,"ear");
		Vocab.put(9,"beer"); 
		
		 for (Entry<Integer, String> e : Vocab.entrySet()) 
	            System.out.println(NoOfOccurenceOfCharacters.getOccuringCharCorrectword(e.getValue())); 
	
	}
}
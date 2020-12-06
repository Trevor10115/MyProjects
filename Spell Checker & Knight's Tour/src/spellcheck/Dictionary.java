package spellcheck;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.*;
// this class adds words to the hash table 
public class Dictionary {

	public static void Dict()
	{
		 Hashtable<Integer, String> Vocab = new Hashtable<>();//creates hash table
		 
		 
		Vocab.put(1,"read"); //adds words to hash table 
		Vocab.put(2,"red"); 
		Vocab.put(3,"reed"); 
		Vocab.put(4,"reread"); 
		Vocab.put(5,"reef");
		Vocab.put(6,"fear");
		Vocab.put(7,"rear");
		Vocab.put(8,"ear");
		Vocab.put(9,"beer"); 
		
		
		
		
	}
}

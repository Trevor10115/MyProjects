package spellcheck;


public class spellChecks {

	static String Checks(String file_1[])
	{
		
	 
	String result;
	 String[] Correct = {"program", "coding", "water", "coffee", "candy"};
	
	 
	 
	if(Correct.equals(file_1))
	{
		result =  "All words spelled correctly";
	}
	else
	{
		result = "Words not spelled correctly";
	}
		return result; 	
	}
	
}

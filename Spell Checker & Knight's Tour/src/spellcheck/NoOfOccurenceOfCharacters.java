package spellcheck;

import java.util.Hashtable;

//This class compares the occurrences of letters between the hash table of correct words and the wrongly input word//  
class NoOfOccurenceOfCharacters { 
    static final int MAX_CHAR = 256; 
  
    static int[] getOccuringCharWrongword(String Wrongword) 
    { 
        // Create an array of size 256 i.e. ASCII_SIZE 
        int count[] = new int[MAX_CHAR]; 
  
        int len = Wrongword.length(); 
  
        // Initialize count array index 
        for (int i = 0; i < len; i++) 
            count[Wrongword.charAt(i)]++; 
  
        // Create an array of given String size 
        char ch[] = new char[Wrongword.length()]; 
        for (int i = 0; i < len; i++) { 
            ch[i] = Wrongword.charAt(i); 
            int find = 0; 
            for (int j = 0; j <= i; j++) { 
  
                // If any matches found 
                if (Wrongword.charAt(i) == ch[j])  
                    find++;                 
            } 
  
            if (find == 1)  
                System.out.println("Number of Occurrence of " + 
                 Wrongword.charAt(i) + " In " + Wrongword + " is:" + count[Wrongword.charAt(i)]);             
        } 
        return count; 
    } 
    
    static int[] getOccuringCharCorrectword(String Correct) 
    { 
        // Create an array of size 256 i.e. ASCII_SIZE 
        int count[] = new int[MAX_CHAR]; 
  
        int len = Correct.length(); 
  
        // Initialize count array index 
        for (int i = 0; i < len; i++) 
            count[Correct.charAt(i)]++; 
  
        // Create an array of given String size 
        char ch[] = new char[Correct.length()]; 
        for (int i = 0; i < len; i++) { 
            ch[i] = Correct.charAt(i); 
            int find = 0; 
            for (int j = 0; j <= i; j++) { 
  
                // If any matches found 
                if (Correct.charAt(i) == ch[j])  
                    find++;                 
            } 
  
            if (find == 1)  
                System.out.println("Number of Occurrence of " + 
                 Correct.charAt(i) + " in "+ Correct +  " is:" + count[Correct.charAt(i)]);             
        } 
        return count; 
    } 
    
   
}
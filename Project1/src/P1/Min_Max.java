package P1;
 
	  
class Min_Max
	{
	static int Max(int[] file_1) 
		{
		
		int max = file_1[0];
	    for (int i = 1; i < file_1.length; i++) // steps through array
	    {
	        if (file_1[i] > max) // finds if i is more than max
	        {
	            max = file_1[i];
	        }
	    }
		return max; // returns max value
	    } 
	static int Min(int[] file_1)
	
		{
		int min = file_1[0];
	    for (int i = 1; i < file_1.length; i++) // steps through array
	    {
	        if (file_1[i] < min) // finds if i is less than min
	        {
	            min = file_1[i];
	        }
	    }
	    
			return min;// retruns min value
		}
	} 

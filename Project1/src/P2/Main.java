package P2;
import java.util.Queue;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) 
	{
		 Queue<String> myQueue = new LinkedList<String>();// creates the queue
		 
	        myQueue.add("5");//adds 5
	        System.out.println(myQueue);
	        
	        myQueue.add("3");//adds 3
	        System.out.println(myQueue);
	        
	        myQueue.remove();
	        System.out.println(myQueue);
	        
	        myQueue.add("2");//adds 2
	        System.out.println(myQueue);
	        
	        myQueue.add("8");//adds 8
	        System.out.println(myQueue);
	        
	        myQueue.remove();
	        System.out.println(myQueue);
	        
	        myQueue.remove();
	        System.out.println(myQueue);
	        
	        myQueue.add("9");//adds 9
	        System.out.println(myQueue);
	        
	        myQueue.add("1");//adds 1
	        System.out.println(myQueue);
	        
	        myQueue.remove();
	        System.out.println(myQueue);
	        
	        myQueue.add("7");//adds 7
	        System.out.println(myQueue);
	        
	        myQueue.add("6");//adds 6
	        System.out.println(myQueue);
	        
	        myQueue.remove();
	        System.out.println(myQueue);
	        
	        myQueue.remove();
	        System.out.println(myQueue);
	        
	        myQueue.add("4");// adds 4
	        System.out.println(myQueue);
	        
	        myQueue.remove();
	        System.out.println(myQueue);
	        
	        myQueue.remove();
	        System.out.println(myQueue);
	}
}

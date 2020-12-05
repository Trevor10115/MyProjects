package spellcheck;

public class Node {
	int key;
	String word; 
	
	Node leftChild;
	Node rightChild;
	
	Node(int key, String word)
	{
		this.key = key;
		this.word = word; 
	}
}

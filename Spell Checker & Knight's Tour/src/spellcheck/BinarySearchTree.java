package spellcheck;

    public class BinarySearchTree {
	
	    Node root; 
	     public void addNode(String word, int key)
	     {
		     Node newNode = new Node(key, word);
		     if(root == null)
		     {
			     root = newNode; 
		     }
		     else 
		     {
			     Node focusNode = root; 
			     Node parent; 
			     while(true)
			     {
				     parent = focusNode;
				     if(key < focusNode.key)
				     {
					     focusNode = focusNode.leftChild; 
					     if(focusNode == null)
					     {
						     parent.leftChild = newNode;
						     return; 
					     }
				     }
				     else 
				     {
					     focusNode = focusNode.rightChild;
					     if(focusNode == null)
					     {
						     parent.rightChild = newNode;
						     return; 
					     }
				     }
			     }
		     }
	     }
	 public void preorderTraverseTree(Node focusNode)
	 {
		 if (focusNode != null)
		 {
			 System.out.println(focusNode);
			 preorderTraverseTree(focusNode.leftChild);
			 preorderTraverseTree(focusNode.rightChild);
	 }
 }
}

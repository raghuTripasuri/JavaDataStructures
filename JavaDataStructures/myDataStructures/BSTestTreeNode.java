package myDataStructures;
import java.util.Random;
import java.util.Arrays;
public class BSTestTreeNode {

	public BSTestTreeNode() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BSTree myTree = new BSTree();
		Random randVar = new Random();
		
		Integer element, searchElement;
		int id, listOfValues[], sortedList[];
		BSTreeNode matchNode;
		
		listOfValues = new int[25];
		
		for(int i = 0; i < 25; i++){
			//element = randVar.nextInt(100);
			element = new Integer(i);
			id = element.intValue();
			listOfValues[i] = id;
			System.out.print(" Element "+i+" is "+ id + " ,");
			myTree.insert(element, id);
		}
		
		//searchElement = new Integer(listOfValues[randVar.nextInt(20)]);
		//System.out.println("SEARCH ELEMENT IS "+ searchElement.intValue());
		myTree.breadthFirst();
		
		System.out.println("PREORDER TRAVERSAL");
		myTree.preorder(myTree.getRoot());
		
		System.out.println("POSTORDER TRAVERSAL");
		myTree.postorder(myTree.getRoot());
		
		System.out.println("INORDER TRAVERSAL");
		myTree.inorder(myTree.getRoot());
		
		Arrays.sort(listOfValues);
		myTree.cleanup(myTree.getRoot());
		
		for (int i=0; i< listOfValues.length; i++){
			matchNode = myTree.search(myTree.getRoot(), new Integer(listOfValues[i]));
			//System.out.println("Match Node is " + matchNode.toString());
			System.out.println("Search value at "+ i + " IS " + listOfValues[i]);
		}
		System.out.println("Array is sorted now and the tree is cleaned up");
		myTree.balance(listOfValues, 0, listOfValues.length -1);
		
		System.out.println("Tree BALANCING DONE - calling BreadthFirst traversal");
		
		myTree.breadthFirst();
		
	}
	
}

package myDataStructures;
import java.util.Random;
public class BSTestTreeNode {

	public BSTestTreeNode() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BSTree myTree = new BSTree();
		Random randVar = new Random();
		
		Integer element;
		int id;
		
		for(int i = 1; i < 25; i++){
			//element = randVar.nextInt(100);
			element = new Integer(i);
			id = element.intValue();
			myTree.insert(element, id);
		}
		myTree.breadthFirst();
	}

}

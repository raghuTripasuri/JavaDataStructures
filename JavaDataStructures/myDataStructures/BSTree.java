/**
 * 
 */
package myDataStructures;
import packQueue.Queue;

/**
 * @author raghunatht
 *
 */
public class BSTree {
	
	protected BSTreeNode root;
	
	/**
	 * 
	 */
	public BSTree() {
		root = null;
		// TODO Auto-generated constructor stub
	}
	
	public BSTreeNode getRoot() {
		return root;
	}

	public void setRoot(BSTreeNode root) {
		this.root = root;
	}

	protected void visit(BSTreeNode bstN){
		System.out.println(bstN.toString());
	}
	
	public void insert(Object element, long id){
		BSTreeNode p= root, prev=null;
		
		while(p != null){
			prev = p;
			if (p.getId() < id)	p = p.getRight();
			else p = p.getLeft();
		}
		if(root == null) {//tree is empty
			root = new BSTreeNode(element, null, null, id);
		} else if (prev.getId() < id){
			prev.setRight(new BSTreeNode(element, null, null, id));
		} else {
			prev.setLeft(new BSTreeNode(element, null, null,id));
		}
		
	}
	
	public BSTreeNode search(BSTreeNode p, int id){
		Integer element = new Integer(id);
		BSTreeNode newElement = new BSTreeNode(element, null, null, id);
		while (p != null){
			if (p.getInfo().equals(element)){
				return p;
			} else if (p.isGreaterThan(newElement)){
				p = p.left;
			} else {
				p = p.right;
			}
		}
		
		return null;
	}
	public void breadthFirst(){
		BSTreeNode p = this.getRoot();
		Queue queue = new Queue();
		if(p != null){
			queue.enqueue(p);
			while(!queue.isEmpty()){
				p = (BSTreeNode) queue.dequeue();
				this.visit(p);
				if(p.getLeft() != null)
					queue.enqueue(p.getLeft());
				if(p.getRight() != null)
					queue.enqueue(p.getRight());
			}
		}
		
	}
	
	public void preorder( BSTreeNode p){
		if(p != null){
			this.visit(p);
			preorder(p.getLeft());
			preorder(p.getRight());
		}
	}

	protected void inorder(BSTreeNode p){
		if(p != null){
			inorder(p.getLeft());
			visit(p);
			inorder(p.getRight());
		}
		
	}
	protected void postorder(BSTreeNode p){
		if(p != null){
			postorder(p.getLeft());
			postorder(p.getRight());
			visit(p);
		}
	}
	public void balance(int[] data, int first, int last){
		
		int element = -1;
		
		if(first <= last){
			int middle = (first + last)/2;
			element = data[middle];
			this.insert(new Integer(element), element);
			balance(data, first, middle -1);
			balance(data, middle + 1, last);
		}
	}

	public void cleanup(BSTreeNode p){
		this.setRoot(null);
	}
	
}

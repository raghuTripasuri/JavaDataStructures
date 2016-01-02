/**
 * Binary Search Tree of any Object
 * Demonstrate the implementation of a Binary Tree
 * 1-Jan-2016
 * 
 */
package myDataStructures;

/**
 * @author raghunatht
 *
 */
public class BSTreeNode {

	protected long id;
	protected Object info;
	protected BSTreeNode left, right;
	/**
	 * Basic constructor
	 */
	public BSTreeNode() {
		left = right = null;
		
		// TODO Auto-generated constructor stub
	}
	//Set the element with references to the left and right nodes
	public BSTreeNode(Object element, BSTreeNode lt, BSTreeNode rt, long comparator){
		this.info = element;
		this.left = lt;
		this.right = rt;
		this.id = comparator;
	}
	public Object getInfo() {
		return info;
	}
	public void setInfo(Object info) {
		this.info = info;
	}
	public BSTreeNode getLeft() {
		return left;
	}
	public void setLeft(BSTreeNode left) {
		this.left = left;
	}
	public BSTreeNode getRight() {
		return right;
	}
	public void setRight(BSTreeNode right) {
		this.right = right;
	}
	
	//Has to be implemented
	public boolean isLessThan(BSTreeNode p){
		return(id < p.getId());
	}
	public boolean isGreaterThan(BSTreeNode p){
		return(id > p.getId());
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "BSTreeNode [info=" + info.toString() + "]";
	}
	
}

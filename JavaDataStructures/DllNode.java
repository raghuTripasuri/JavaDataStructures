/**
 * Double linked list node is created here. It has reference to previous and next as well
 * @author raghunatht
 * @Date 30-Dec-2015
 */
public class DllNode{
	public Object info;
	public DllNode prev, next;

    //Constructor for DllNode
    public DllNode(Object information ){
        this(information, null, null);
    }
    
    //Constructor with next and previous elements set
    public DllNode(Object information, DllNode nextElement, DllNode prevElement){
        info = information;
        next = nextElement;
        prev = prevElement;
    }
}
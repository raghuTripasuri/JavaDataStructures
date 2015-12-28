/**
 Public class Node, which represents each element in the linked list.
 Attribute info captures basic information 
 Attribute next captures the reference for next element in the single linked list
 */
public class Node{
    
    public int info;
    public Node next;
    
    //Constructor for Node
    
    public Node(int information ){
        this(information, null);
    }
    
    //Constructor with next element
    public Node(int information, Node nextElement){
        info = information;
        next = nextElement;
    }

}
package packQueue;
import java.util.LinkedList;
public class Queue {
	private LinkedList list = new LinkedList();
	
	//Constructor does nothing !!
	public Queue(){
		
	}
	
	//Clears the entire queue
	public void clear(){
		list.clear();
	}
	
	//Checks if the queue is empty
	public boolean isEmpty(){
		return list.isEmpty();
	}
	
	//Returns the first element of the queue
	public Object firstEl(){
		return list.getFirst();
	}
	
	//Removes the first element of the queue
	public Object dequeue(){
		return list.removeFirst();
	}
	
	//Adds an element to the end of the queue
	public void enqueue(Object element){
		list.addLast(element);
	}
	
	//prints the contents of the queue
	public String toString(){
		return list.toString();		
	}
}

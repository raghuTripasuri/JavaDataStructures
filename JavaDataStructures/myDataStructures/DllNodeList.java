package myDataStructures;
/**
 * This class helps in creating and managing the Double linked list
 * @author raghunatht
 * @Date 30-Dec-2015
 */
public class DllNodeList {

	protected DllNode head;
	protected DllNode tail;
	
	public DllNodeList(){ // constructor
        head = null;
        tail = null;
    }
    
    public boolean isEmpty(){ // checks for empty list
        return (head == null);
    }

    public void addToHead(Object el){ // add an element as the head
        DllNode oldHead;
    	if(!isEmpty()){
    		oldHead = head;
    		head = new DllNode(el,oldHead, null);
    		oldHead.prev = head;
 
    	} else {
    		head = new DllNode(el);
    		tail = head;
    	}
    	
    }
    
    public void addToTail(Object el){ // add an element to the tail
        DllNode oldTail;
    	if(!isEmpty()){
    		oldTail = tail;
            tail.next = new DllNode(el);
            tail = tail.next;
            tail.prev = oldTail;
        } else {
            head = tail = new DllNode(el);
        }
    }
    
    public Object deleteFromHead(){ //delete the head and return its information
        Object info = null;
        
        if(!isEmpty()){
           
            info = head.info;
            
            if (head == tail){
                head = tail = null;
            } else {
                head = head.next;
                head.prev = null;
            }
         }
         return info;
    }
    
    public Object deleteFromTail(){
        Object element = null;
        DllNode oldTail;
        
        if (tail != null){
            element = tail.info;
            
            if(head == tail){
                head = tail = null;
            } else{
            	
            	oldTail = tail;
                tail = oldTail.prev;
                tail.next = null;
            	
            }
        }
        return element;
    }

    
    public void printAll(){
        
        StringBuffer str = new StringBuffer();
        DllNode tmp;
        
        if(!isEmpty()){
            
            for(tmp = head; tmp.next != null; tmp = tmp.next){
                str.append((tmp.info).toString());
                str.append(",");
            }
            str.append((tail.info).toString());
            str.append(".");
            System.out.println("The String is: " + str.toString());
        }
    }
    
    public boolean isInList(Object el){
        
        boolean result = false;
        
        for(DllNode tmp = head; tmp != null; tmp = tmp.next){
            if((tmp.info).equals(el)){
                result = true;
            }
        }
        return(result);
    }
    
    public DllNode getHead() {
		return head;
	}

	public DllNode getTail() {
		return tail;
	}

	public void delete(Object el){ //method assumes and deletes only one element, the first match.
        
        DllNode tmp, bufElement;
        Object delElement;
        
        for (tmp = head; tmp != null; tmp = tmp.next){
         
            if((tmp.info).equals(el)){ //tmp is the element to be removed.
                
                if((tmp == head) && !(tmp == tail)){ //list has more than one element. Remove the first one as it matches
                    
                	delElement = deleteFromHead();
                    
                } else if((tmp == head) && (tmp == tail)){

                    head = tail = null; //list has only one element and remove it.
                    
                } else if((tmp != head) && (tmp == tail)) { //list has many elements, but tail matches and hence it has to be removed
                  
                	delElement = deleteFromTail();
                	
                } else { // The matched element is in the middle
                    
                	bufElement = tmp.next;
                	bufElement.prev = tmp.prev;
                	tmp.prev.next = bufElement;
                    tmp = null;
                }
                break;
            }
                       
        }
    }
}

/**
 Public class NodeList, which is used to manage the linked lists
 Attributes head and tail capture the first and last elements of the list

 */
public class NodeList {

    protected Node head;
    protected Node tail;
    
    public NodeList(){ // construtor
        head = null;
        tail = null;
    }
    
    public boolean isEmpty(){ // checks for empty list
        return (head == null);
    }

    public void addToHead(int el){ // add an element as the head
        head = new Node(el, head);
        if (tail == null) {
            tail = head;
            head.next = null;
        }
    }
    
    public void addToTail(int el){ // add an element to the tail
        if(!isEmpty()){
            tail.next = new Node(el);
            tail = tail.next;
        } else {
            head = tail = new Node(el);
        }
    }
    
    public int deleteFromHead(){ //delete the head and return its information
        int info;
        
        if(!isEmpty()){
           
            info = head.info;
            
            if (head == tail){
                head = tail = null;
            } else {
                head = head.next;
            }
            return info;

        } else {
        
            return -1;
        }
        
    }
    
    public int deleteFromTail(){
        int element;
        
        if (tail != null){
            element = tail.info;
            
            if(head == tail){
                head = tail = null;
            } else{
                Node temp = head;
                while( temp.next != tail){
                    temp = temp.next;
                }
                temp.next = null;
                tail = temp;
            }
            return(element);
        } else {
            return -1;
        }
        
    }
    
    public void printAll(){
        
        StringBuffer str = new StringBuffer();
        Node tmp;
        
        if(!isEmpty()){
            
            for(tmp = head; tmp.next != null; tmp = tmp.next){
                str.append(tmp.info);
                str.append(",");
            }
            str.append(tail.info);
            str.append(".");
            System.out.println("The String is: " + str.toString());
        }
        
        
    }
    
    public boolean isInList(int el){
        
        boolean result = false;
        
        for(Node tmp = head; tmp != null; tmp = tmp.next){
            if(tmp.info == el){
                result = true;
            }
        }
        return(result);
        
    }
    
    public void delete(int el){
        
        Node tmp, prev;
        prev = head;
        for (tmp = head; tmp != null; tmp = tmp.next){
         
            if(tmp.info == el){ //tmp is the element to be removed.
                
                if((tmp == head) && !(tmp == tail)){ //list has more than one element. Remove the first one as it matches
                    head = prev.next = tmp.next;
                } else if((tmp == head) && (tmp == tail)){

                    head = tail = null; //list has only one element and remove it.
                    
                } else if((tmp != head) && (tmp == tail)) { //list has many elements, but tail matches and hence it has to be removed
                    prev.next = null;
                    tail = prev;

                } else { // The matched element is in the middle
                    prev.next = tmp.next;
                    tmp = null;
                }
                break;
            }
            if (!(tmp == head)){ // prev has to be one behind tmp always
                prev = prev.next;
            }
            
        }
    }
}

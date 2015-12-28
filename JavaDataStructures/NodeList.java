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
        if (tail == null) tail = head;
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
            tmp = head;
            do{
                str.append(tmp.info);
                str.append(",");
                tmp = tmp.next;
            } while( tmp != tail);
            
            str.append(tail.info);
            str.append(".");
            System.out.println("The String is: " + str.toString());
        }
        
        
    }
    
    public boolean isInList(int el){
        
        return true;
    }
    
    public void delete(int el){
        System.out.println ("Delete Method");
    }
}

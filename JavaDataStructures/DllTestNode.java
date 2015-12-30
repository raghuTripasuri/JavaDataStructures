/**
 * Class to test the Double Linked Lists
 * @author raghunatht
 *
 */
public class DllTestNode{

    public static void main(String args[]){
        //Instantiate the Double Linked List Node and NodeList (DLL)
        DllNode nj = new DllNode(new Integer(25));
        DllNodeList nList = new DllNodeList();
        
        //Add the head element
        nList.addToHead(nj.info);
        
        //Use methods "add to head" and "add to tail" to build up the double linked lists
        for(int i=100; i < 121; i++){
            nList.addToTail(new Integer(i));
        }
        
        for(int i=99; i >79; i--){
        	nList.addToHead(new Integer(i));
        }
        
        //Verify the list built
        nList.printAll();
        
        //Find an element in the list
        System.out.println("Is element 117 in the list? " + nList.isInList(117));
        
        //Delete and confirm if the elment is deleted
        nList.delete(new Integer(25));
        nList.printAll();
        
        nList.delete(new Integer(111));
        nList.printAll();
        
        nList.delete(new Integer(120));
        nList.printAll();
        
        //Check delete from Tail and Delete from Head methods
        nList.deleteFromTail();
        nList.printAll();
        
        nList.deleteFromHead();
        nList.printAll();
        
        //Create and test a new list with only one element
        DllNode nj_new  = new DllNode(new Integer(38));
        DllNodeList nList_new = new DllNodeList();
        nList_new.addToHead(nj_new.info);
        
        nList_new.printAll();
        
        //nList_new.delete(new Integer(38));
        //nList_new.deleteFromHead();
        nList_new.deleteFromTail();

        System.out.println(" Should be nothing in the list " );
        nList_new.printAll();
  
    }

}
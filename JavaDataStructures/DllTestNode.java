
public class DllTestNode{

    public static void main(String args[]){
        
        DllNode nj = new DllNode(new Integer(25));
        DllNodeList nList = new DllNodeList();
        
        nList.addToHead(nj.info);
        
        for(int i=100; i < 121; i++){
            nList.addToTail(new Integer(i));
        }
        
        nList.printAll();
        
        System.out.println("Is element 117 in the list? " + nList.isInList(117));
        
        nList.delete(new Integer(25));
        nList.printAll();
        
        nList.delete(new Integer(111));
        nList.printAll();
        
        nList.delete(new Integer(120));
        nList.printAll();
        
        nList.deleteFromTail();
        nList.printAll();
        
        nList.deleteFromHead();
        nList.printAll();
        
        
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
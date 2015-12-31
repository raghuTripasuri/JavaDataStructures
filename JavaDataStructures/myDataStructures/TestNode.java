package myDataStructures;

public class TestNode{

    public static void main(String args[]){
        
        Node nj = new Node(25);
        NodeList nList = new NodeList();
        
        nList.addToHead(nj.info);
        
        for(int i=72; i < 97; i++){
            nList.addToTail(i);
        }
        
        nList.printAll();
        
        System.out.println("Is element 79 in the list? " + nList.isInList(79));
        
        nList.delete(25);
        nList.printAll();
        
        nList.delete(85);
        nList.printAll();
        
        nList.delete(96);
        nList.printAll();
        
        nList.deleteFromTail();
        nList.printAll();
        
        nList.deleteFromHead();
        nList.printAll();
        
        
        Node nj_new  = new Node(38);
        NodeList nList_new = new NodeList();
        nList_new.addToHead(nj_new.info);
        
        nList_new.printAll();
        
        //nList_new.delete(38);
        //nList_new.deleteFromHead();
        nList_new.deleteFromTail();
        nList_new.printAll();
        
        
    }

}
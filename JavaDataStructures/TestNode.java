public class TestNode{

    public static void main(String args[]){
        
        Node nj = new Node(25);
        NodeList nList = new NodeList();
        
        nList.addToHead(nj.info);
        
        for(int i=72; i < 97; i++){
            nList.addToTail(i);
        }
        
        nList.printAll();
    }

}
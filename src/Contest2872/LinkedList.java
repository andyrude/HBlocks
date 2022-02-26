package Contest2872;

public class LinkedList<E> {
    public Node head;
    public void add( E item){
        if (size() == 0){
            head = new Node( item);
        }else {
            Node node = head;
            for ( int i = 0; i < size(); i++){
                node = node.getNode();
            }
            node.setItem(item);
        }
    }

    public void addAtIndex( int index, E item){
        if ( index == 0){
            Node node = new Node(item);
            node.setNode( head);
            head = node;
        }else  {
            if ( index > size()){
                System.out.println(" Index Not Possible");
            }else {
                Node node ;
                node = head;
                for ( int i = 0; i < index; i++){
                    node = node.getNode();
                }
            }
        }
    }

    public int size(){
        if ( head == null){
            return 0;
        }else {
            int count =  0;
            Node node = head;
            while ( node.getNode()!=null){
                count++;
            }
            return count;
        }
    }
}
class Node<E>{
    private Node node;
    private E item;

    public Node( E item) {
        this.item = item;
    }

    public Node getNode() {
        return node;
    }

    public void setNode(Node node) {
        this.node = node;
    }

    public E getItem() {
        return item;
    }

    public void setItem(E item) {
        this.item = item;
    }
}

package edExercices.undoDouble;

public class Node {
    public String action;
    public Node next;
    public Node prev;

    public Node(String node){
        this.action = node;
        this.next = null;
        this.prev = null;
    }
}

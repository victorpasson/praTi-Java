package edExercices.undoDouble;

public class UndoList {
    public Node head;
    public Node tail;
    protected int size;

    public UndoList(){
        this.head = new Node(null);
        this.tail = new Node(null);
        this.head.next = this.tail;
        this.size = 0;
    }

    public boolean emptyList(){
        if (this.head == null && this.tail == null){
            return true;
        } else {
            return false;
        }
    }

    public void make(String action){
        Node newNode = new Node(action);
        if (emptyList()){
            this.head = newNode;
            this.tail = newNode;
        } else {
            newNode.next = head;
            newNode.prev = tail;
            this.head = newNode;
            newNode.next.prev = newNode;
            tail.next = newNode;
        }
        this.size++;
    }

    public void undo(){
        if(this.head.next != null){
            this.head = this.head.next;
        } else {
            System.out.println("Impossível desfazer.");
        }

    }

    public void redo(){
        if (this.head.prev != null){
            this.head = this.head.prev;
        } else {
            System.out.println("Impossível refazer.");
        }

    }

    public void getHead() {
        System.out.println(this.head.action);
    }
}

package edExercices.undoSimples;

public class UndoList {
    public Node head;

    public UndoList(){
        this.head = null;
    }

    public void makeAction(String action){
        Node newNode = new Node(action);

        if (this.head == null){
            this.head = newNode;
        } else {
            newNode.next = this.head;
            this.head = newNode;
        }
    }

    public Node undo(){
        Node current = this.head;
        if (current != null){
            this.head = current.next;

            return current;
        }
        return null;
    }

    public void getAtual(){
        if (this.head == null){
            System.out.println("Nenhuma ação executada.");
        } else {
            System.out.println(this.head.action);
        }
    }
}

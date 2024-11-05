package edExercices.historicoSimples;

public class HistoricoSimples {
    public Node head;
    private final int limit;

    public HistoricoSimples(int limit){
        this.head = null;
        this.limit = limit;
    }

    public void add(String url){
        Node newUrl = new Node(url);

        if (this.head == null){
            this.head = newUrl;
        } else {
            newUrl.next = this.head;
            this.head = newUrl;
        }

        int historicSize = this.size();
        if (historicSize > limit){
            Node prev = null;
            Node current = this.head;
            while (current.next != null){
                prev = current;
                current = current.next;
            }
            prev.next = null;
        }
    }

    public void verHistorico(){
        Node current = this.head;
        if (current == null){
            System.out.println("Nenhuma URL no histórico.");
        }

        while(current != null){
            System.out.println(current.url);
            current = current.next;
        }
    }

    public int size(){
        int count = 0;

        Node current = this.head;

        while (current != null){
            count++;
            current = current.next;
        }

        return count;
    }
}

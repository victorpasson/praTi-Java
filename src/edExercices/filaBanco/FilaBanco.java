package edExercices.filaBanco;

public class FilaBanco {
    private Node first;
    private Node last;

    public FilaBanco(){
        this.first = null;
        this.last = null;
    }

    private static class Node{
        Cliente cliente;
        Node next;

        public Node(String cliente){
            this.cliente = new Cliente(cliente);
            this.next = null;
        }
    }

    public void adicionarClienteNaFila(String cliente){
        Node newClient = new Node(cliente);

        if (this.last == null){
            this.first = newClient;
            this.last = newClient;
        } else {
            this.last.next = newClient;
            this.last = newClient;
        }
    }

    public void chamarProximoCliente(){
        if (this.first == null){
            throw new IllegalStateException("A fila está vazia.");
        }

        Cliente cliente = this.first.cliente;
        this.first = this.first.next;

        if (this.first == null){
            this.last = null;
        }

        System.out.println("Chamando Cliente: " + cliente.nome);
    }

    public void clientesNaFila(){
        Node cliente = this.first;
        System.out.println("---- Clientes na Fila ----");
        while (cliente.next != null){
            System.out.println(cliente.cliente.nome);
            cliente = cliente.next;
        }
        System.out.println(this.last.cliente.nome);
    }
}

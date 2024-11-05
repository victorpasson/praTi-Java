package edExercices.impressao;

public class GerenciarImpressao {
    private Node first;
    private Node last;

    public GerenciarImpressao(){
        this.first = null;
        this.last = null;
    }

    private static class Node{
        Impressao impressao;
        Node next;

        public Node (String impressao){
            this.impressao = new Impressao(impressao);
            this.next = null;
        }
    }

    public void adicionarImpressaoNaFila(String impressao){
        Node newImpressao = new Node(impressao);

        if (this.last == null){
            this.first = newImpressao;
            this.last = newImpressao;
        } else {
            this.last.next = newImpressao;
            this.last = newImpressao;
        }
    }

    public void processarImpressao(){
        if (this.first == null){
            throw new IllegalStateException("A fila de impressão está vazia.");
        }

        Impressao impressao = this.first.impressao;
        this.first = this.first.next;

        if (this.first == null){
            this.last = null;
        }

        System.out.println("Processando: " + impressao.impressao);
    }

    public void processosNaFila(){
        Node impressao = this.first;
        System.out.println("---- Processos na Fila ----");
        while (impressao.next != null){
            impressao.impressao.printImpressao();
            impressao = impressao.next;
        }
        this.last.impressao.printImpressao();
    }
}

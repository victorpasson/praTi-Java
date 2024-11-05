package edExercices.sistemaOperacional;

public class SistemaOperacional {
    private Node first;
    private Node last;

    public SistemaOperacional(){
        this.first = null;
        this.last = null;
    }

    private static class Node{
        Processo processo;
        Node next;

        public Node(String processo){
            this.processo = new Processo(processo);
            this.next = null;
        }
    }

    public void adicionarProcesso(String processo){
        Node newProcesso = new Node(processo);

        if (this.last == null){
            this.first = newProcesso;
            this.last = newProcesso;
        } else {
            this.last.next = newProcesso;
            this.last = newProcesso;
        }
    }

    public void executarProcesso(){
        if (this.first == null){
            throw new IllegalStateException("Não há processos para execução.");
        }

        Processo processo = this.first.processo;
        this.first = this.first.next;

        if (this.first == null){
            this.last = null;
        }

        System.out.println("Processando: " + processo.processo);
    }

    public void processosPendentes(){
        Node processo = this.first;
        System.out.println("---- Processos Pendentes ----");
        while (processo.next != null){
            processo.processo.printProcesso();
            processo = processo.next;
        }
        processo.processo.printProcesso();

    }
}

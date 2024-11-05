package edExercices.sistemaOperacional;

public class Main {
    public static void main(String[] args) {
        SistemaOperacional newProcessos = new SistemaOperacional();

        newProcessos.adicionarProcesso("Executar Paint");
        newProcessos.adicionarProcesso("Abrir Chrome");
        newProcessos.adicionarProcesso("Ler PDF");
        newProcessos.adicionarProcesso("Abrir Lol");
        newProcessos.processosPendentes();
        newProcessos.executarProcesso();
        newProcessos.executarProcesso();
        newProcessos.processosPendentes();
    }
}

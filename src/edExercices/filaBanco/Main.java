package edExercices.filaBanco;

public class Main {
    public static void main(String[] args) {
        FilaBanco filaAtendimento = new FilaBanco();
        filaAtendimento.adicionarClienteNaFila("João Victor");
        filaAtendimento.adicionarClienteNaFila("Edu");
        filaAtendimento.adicionarClienteNaFila("Jaques");
        filaAtendimento.adicionarClienteNaFila("Diracy");
        filaAtendimento.clientesNaFila();
        filaAtendimento.chamarProximoCliente();
        filaAtendimento.clientesNaFila();
        filaAtendimento.chamarProximoCliente();
        filaAtendimento.clientesNaFila();
    }
}

package edExercices.impressao;

public class Main {
    public static void main(String[] args) {
        GerenciarImpressao novoGerenciamento = new GerenciarImpressao();

        novoGerenciamento.adicionarImpressaoNaFila("Impressão 1");
        novoGerenciamento.adicionarImpressaoNaFila("Impressão 2");
        novoGerenciamento.adicionarImpressaoNaFila("Impressão 3");
        novoGerenciamento.adicionarImpressaoNaFila("Impressão 4");
        novoGerenciamento.adicionarImpressaoNaFila("Impressão 5");
        novoGerenciamento.processosNaFila();
        novoGerenciamento.processarImpressao();
        novoGerenciamento.processarImpressao();
        novoGerenciamento.processosNaFila();
    }
}

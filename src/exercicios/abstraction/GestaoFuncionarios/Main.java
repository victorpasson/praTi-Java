package exercicios.abstraction.GestaoFuncionarios;

public class Main {
    public static void main(String[] args) {
        GerenciadorFuncionarios sistema = new GerenciadorFuncionarios();
        Funcionario gerente = new Gerente("Jorge Jesus", CargoType.Gerente);
        Funcionario desenvolvedor = new Desenvolvedor("Gabriel Barbosa", CargoType.Desenvolvedor);
        Funcionario estagiario = new Estagiario("Arrascaeta", CargoType.Estagiario);

        sistema.addFuncionario(gerente);
        sistema.addFuncionario(desenvolvedor);
        sistema.addFuncionario(estagiario);

        sistema.verFuncionarios();
        System.out.println("Folha de Pagamento: R$ " + sistema.calculaFolhaPagamento());

        System.out.println(" ------------------------- ");
        sistema.promoverFuncioario(2);
        sistema.verFuncionarios();
        System.out.println("Nova Folha de Pagamento: R$ " + sistema.calculaFolhaPagamento());

        System.out.println(" ------------------------- ");
        sistema.promoverFuncioario(1);
        sistema.verFuncionarios();
        System.out.println("Nova Folha de Pagamento: R$ " + sistema.calculaFolhaPagamento());

        System.out.println(" ------------------------- ");
        sistema.promoverFuncioario(0);
        sistema.verFuncionarios();
        System.out.println("Nova Folha de Pagamento: R$ " + sistema.calculaFolhaPagamento());
    }
}

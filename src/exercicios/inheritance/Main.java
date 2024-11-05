package exercicios.inheritance;

public class Main {
    public static void main(String[] args) {
        Funcionario gerente = new Gerente("Eduardo", 2000.0);
        Funcionario desenvolvedor = new Desenvolvedor("Carlos", 1000.0);

        gerente.trabalhar();
        desenvolvedor.trabalhar();
    }
}

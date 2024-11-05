package exercicios.inheritance;

public class Gerente extends Funcionario {
    public Gerente(String nome, double salario){
        super(nome, salario);
    }

    public double calcularBonus(){
        return this.salario * 0.2;
    }

    @Override
    public void trabalhar(){
        System.out.println("O gerente está gerenciando.");
    }
}

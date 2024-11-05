package exercicios.abstraction.GestaoFuncionarios;

public final class Gerente extends Funcionario {
    public Gerente(String nome, CargoType cargo){
        super(nome, cargo);
        this.setSalario();
        this.setBonus();
    }

    public void setSalario(){
        this.salario = 5000.0;
    }

    public void setBonus(){
        this.bonus = 300.0;
    }
}

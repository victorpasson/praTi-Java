package exercicios.abstraction.GestaoFuncionarios;

public final class Estagiario extends Funcionario {
    public Estagiario(String nome, CargoType cargo){
        super(nome, cargo);
        this.setSalario();
        this.setBonus();
    }

    public void setSalario(){
        this.salario = 1000.0;
    }

    public void setBonus(){
        this.bonus = 100.0;
    }
}

package exercicios.abstraction.GestaoFuncionarios;

public final class Desenvolvedor extends Funcionario {
    public Desenvolvedor(String nome, CargoType cargo){
        super(nome, cargo);
        this.setSalario();
        this.setBonus();
    }

    public void setSalario(){
        this.salario = 3000.0;
    }

    public void setBonus(){
        this.bonus = 200.0;
    }
}

package exercicios.abstraction.GestaoFuncionarios;

public abstract sealed class Funcionario permits Gerente, Estagiario, Desenvolvedor {
    public String nome;
    public CargoType cargo;
    protected double salario;
    protected double bonus;

    public Funcionario(String nome, CargoType cargo){
        this.nome = nome;
        this.cargo = cargo;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getSalario(){
        return this.salario;
    }

    public double getBonus(){
        return this.bonus;
    }

    public double getSalarioBruto(){
        return this.salario + this.bonus;
    }

    public Funcionario upgrade(){
        Funcionario upgradeFuncionario = null;
        switch (cargo){
            case Estagiario -> upgradeFuncionario = new Desenvolvedor(this.nome, CargoType.Desenvolvedor);
            case Desenvolvedor -> upgradeFuncionario = new Gerente(this.nome, CargoType.Gerente);
        }

        if (cargo == CargoType.Gerente){
            System.out.println("Impossível promover o funcionário");
            upgradeFuncionario = new Gerente(this.nome, CargoType.Gerente);
        }

        return upgradeFuncionario;
    }

    public abstract void setSalario();
    public abstract void setBonus();

}

package exercicios.inheritance;

public class Funcionario {
     protected String nome;
     protected double salario;

    public Funcionario(String nome, double salario) {
        this.setNome(nome);
        this.setSalario(salario);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario < 0){
            throw new IllegalArgumentException("Salário não pode ser negativo.");
        }

        this.salario = salario;
    }

    public void trabalhar(){
        System.out.println("O funcionário está trabalhando.");
    }
}

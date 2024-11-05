package exercicios.abstraction.GestaoFuncionarios;

import java.util.ArrayList;

public class GerenciadorFuncionarios {
    public ArrayList<Funcionario> funcionarios;

    public GerenciadorFuncionarios(){
        this.funcionarios = new ArrayList<>();
    }

    public void addFuncionario(Funcionario funcionario){
        this.funcionarios.add(funcionario);
    }

    public double calculaFolhaPagamento(){
        double soma = 0;

        if (!funcionarios.isEmpty()){
            for (Funcionario funcionario : funcionarios){
                soma += funcionario.getSalarioBruto();
            }
        }

        return soma;
    }

    public void promoverFuncioario(int index){
        Funcionario obtido =  funcionarios.get(index);
        Funcionario upgrade = obtido.upgrade();
        funcionarios.remove(index);
        funcionarios.add(upgrade);
    }

    public void verFuncionarios(){
        funcionarios.forEach((n) -> System.out.println(n.nome + ": " + n.cargo + " R$ " + n.getSalarioBruto()));
    }
}

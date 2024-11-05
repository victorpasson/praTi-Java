package edExercices.filaBanco;

public class Cliente {
    public String nome;

    public Cliente (String nome){
        this.nome = nome;
    }

    public String getClient(){
        return this.nome;
    }

    public void printClient(){
        System.out.println("Cliente: " + this.nome);
    }
}

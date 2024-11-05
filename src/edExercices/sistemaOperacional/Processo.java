package edExercices.sistemaOperacional;

public class Processo {
    public String processo;

    public Processo(String processo){
        this.processo = processo;
    }

    public String getProcesso() {
        return this.processo;
    }

    public void printProcesso(){
        System.out.println(this.processo);
    }

}

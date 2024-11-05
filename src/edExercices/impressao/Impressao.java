package edExercices.impressao;

public class Impressao {
    public String impressao;

    public Impressao(String impressao){
        this.impressao = impressao;
    }

    public String getImpressao(){
        return this.impressao;
    }

    public void printImpressao(){
        System.out.println(this.impressao);
    }
}

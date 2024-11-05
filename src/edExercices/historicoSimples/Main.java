package edExercices.historicoSimples;

public class Main {
    public static void main(String[] args) {
        HistoricoSimples historico = new HistoricoSimples(5);
        historico.add("https://www.google.com.br/");
        historico.add("https://www.youtube.com.br/");
        historico.add("https://www.globo.com.br/");
        historico.add("https://www.instagram.com.br/");
        historico.add("https://www.twitter.com.br/");
        historico.verHistorico();
        System.out.println("----------- ALÉM DO LIMITE -------------");
        historico.add("https://www.bluesky.com.br/");
        historico.verHistorico();
    }
}

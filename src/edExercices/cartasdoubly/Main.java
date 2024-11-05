package edExercices.cartasdoubly;

public class Main {
    public static void main(String[] args) {
        MaoCarta novaMao = new MaoCarta();

        novaMao.verMao();
        novaMao.adicionarCarta("9A");
        novaMao.adicionarCarta("Rei");
        novaMao.adicionarCarta("Valete");
        novaMao.adicionarCarta("Dama");
        novaMao.adicionarCarta("Coringa");
        novaMao.adicionarCarta("3Ouro");
        novaMao.adicionarCarta("7Paus");
        novaMao.adicionarCarta("5Coracao");
        novaMao.adicionarCarta("2Ouro");
        novaMao.adicionarCarta("Dama");
        novaMao.verMao();
        novaMao.remove(0);
        System.out.println("---- Após Remover - Index 0 ----");
        novaMao.verMao();
        System.out.println("---- Após Remover - Index 1 ----");
        novaMao.remove(1);
        novaMao.verMao();
        System.out.println("---- Removendo Index 3 ----");
        novaMao.remove(3);
        novaMao.verMao();
        novaMao.mudarMao(2, 5);
        System.out.println("---- Mudando index 2 pelo 5 ----");
        novaMao.verMao();
        novaMao.mudarMao(1, 5);
        System.out.println("---- Mudando index 1 pelo 5 ----");
        novaMao.verMao();
        novaMao.mudarMao(4, 0);
        System.out.println("---- Mudando index 4 pelo 0 ----");
        novaMao.verMao();
        novaMao.mudarMao(6, 2);
        System.out.println("---- Mudando index 6 pelo 2 ----");
        novaMao.verMao();
        novaMao.mudarMao(1, 5);
        System.out.println("---- Mudando index 1 pelo 5 ----");
        novaMao.verMao();

    }
}

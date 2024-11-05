package edExercices.undoSimples;

public class Main {
    public static void main(String[] args) {
        UndoList acoes = new UndoList();
        acoes.makeAction("João Victor");
        acoes.makeAction("João Victor Vieira Passon");
        acoes.makeAction("João Victor Vieira Passon está aprendendo");
        acoes.makeAction("João Victor Vieira Passon está aprendendo programação.");

        System.out.println("----- Frase final -----");
        acoes.getAtual();
        System.out.println("----- 1 undo -----");
        acoes.undo();
        acoes.getAtual();
        System.out.println("----- 2 undo -----");
        acoes.undo();
        acoes.getAtual();
        System.out.println("----- 3 undo -----");
        acoes.undo();
        acoes.getAtual();
        System.out.println("----- 4 undo -----");
        acoes.undo();
        acoes.getAtual();
        System.out.println("----- 5 undo -----");
        acoes.undo();
        acoes.getAtual();
        System.out.println("----- 6 undo -----");
        acoes.undo();
        acoes.getAtual();
    }
}

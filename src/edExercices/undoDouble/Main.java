package edExercices.undoDouble;

public class Main {
    public static void main(String[] args) {
        UndoList newList = new UndoList();

        newList.make("João Victor está digitando.");
        newList.make("Claudia está digitando.");
        newList.make("Roberto está digitando.");
        newList.getHead();
        newList.undo();
        newList.getHead();
        newList.redo();
        newList.getHead();
        newList.undo();
        newList.undo();
        newList.getHead();
        newList.redo();
        newList.getHead();
    }
}

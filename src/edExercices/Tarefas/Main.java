package edExercices.Tarefas;

public class Main {
    public static void main(String[] args) {
        ListaTarefas tarefas = new ListaTarefas();

        tarefas.addTarefa("Enviar e-mail");
        tarefas.addTarefa("Falar com cliente");
        tarefas.addTarefa("Chorar para o Edu");
        tarefas.addTarefa("Um dia vou me formar");
        tarefas.fazerTarefa("Enviar e-mail");

        tarefas.removeTarefa("Falar com cliente");
        tarefas.fazerTarefa("Um dia vou me formar");
        tarefas.verTarefas();
    }
}

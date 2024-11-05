package edExercices.Tarefas;

public class Tarefa {
    public String tarefa;
    public boolean completa;
    Tarefa next;

    public Tarefa(String tarefa){
        this.tarefa = tarefa;
        this.completa = false;
        this.next = null;
    }

    public void completarTarefa(){
        this.completa = true;
    }

}

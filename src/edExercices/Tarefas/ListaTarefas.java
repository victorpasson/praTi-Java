package edExercices.Tarefas;

import java.util.Objects;

public class ListaTarefas {
    private Tarefa head;

    public ListaTarefas(){
        this.head = null;
    }

    public void addTarefa(String tarefa){
        Tarefa newTarefa = new Tarefa(tarefa);

        // Verificando se a lista esta vazia
        if(this.head == null){
            this.head = newTarefa;
        } else {
            Tarefa current = this.head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newTarefa;
        }
    }

    public void removeTarefa(String tarefa){
        Tarefa current = this.head;

        if (current == null){
            throw new IndexOutOfBoundsException("Tarefa inexistente.");
        }

        if (Objects.equals(current.tarefa, tarefa)){
            this.head = this.head.next;
            return;
        }

        Tarefa previous = null;

        while (current != null && !Objects.equals(current.tarefa, tarefa)){
            previous = current;
            current = current.next;
        }

        if (current.next == null){
            throw new IndexOutOfBoundsException("Tarefa não encontrada.");
        }

        previous.next = current.next;
    }

    public void fazerTarefa(String tarefa){
        Tarefa current = this.head;

        int size = this.size();
        int count = 0;
        while (count < size){
            if (Objects.equals(current.tarefa, tarefa)){
                current.completa = true;
            }

            current = current.next;
            count++;
        }
    }

    public void verTarefas(){
        Tarefa current = this.head;
        if(current == null){
            System.out.println("Nenhuma tarefa na lista.");
        }

        while (current != null){
            System.out.println(String.format("%s: %s", current.tarefa, current.completa ? "Completa" : "Incompleta"));
            current = current.next;
        }
    }

    public int size(){
        int count = 0;
        Tarefa current = this.head;

        while (current != null){
            count++;
            current = current.next;
        }

        return count;
    }
}

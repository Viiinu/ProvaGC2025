import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Tarefa implements Comparable<Tarefa> {
    String titulo;

    public Tarefa(String titulo) {
        this.titulo = titulo;
    }

    public int compareTo(Tarefa outra) {
        return this.titulo.compareTo(outra.titulo);
    }

    public static void main(String[] args) {
        List<Tarefa> tarefasUm = new ArrayList<>();
        tarefasUm.add(new Tarefa("Estudar"));
        tarefasUm.add(new Tarefa("Almocar"));
        tarefasUm.add(new Tarefa("Dormir"));
        Collections.sort(tarefasUm);
        System.out.println(tarefasUm);

//parte dois
        ArrayList<String> tarefasDois = new ArrayList<>();
        tarefasDois.add("Estudar Java");
        tarefasDois.add("Fazer exercicios");
        tarefasDois.add("Revisar codigo");

        for (String tarefa : tarefasDois) {
            if (tarefa.contains("Java")) {
                System.out.println("Tarefa de programacao: " + tarefa);
            }
        }
    }
}

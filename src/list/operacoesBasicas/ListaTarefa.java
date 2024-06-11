package src.list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    
    private ArrayList<Tarefa> listaTarefa = new ArrayList<>();

    public ListaTarefa() 
    {
        this.listaTarefa = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) 
    {
        listaTarefa.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) 
    {
        List<Tarefa> tarefasRemover = new ArrayList<>();

        for (Tarefa tarefa : listaTarefa) {
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
               tarefasRemover.add(tarefa);
            }
        }

        listaTarefa.removeAll(tarefasRemover);
    }

    public int obterNumeroTotalTarefas()
    {
        return listaTarefa.size();
    }

    public void obterDescricaoTarefas() 
    {
        System.out.println(listaTarefa.toString());
    }

    public static void main(String[] args) {
        ListaTarefa lista = new ListaTarefa();

        System.out.println("Número total: " + lista.obterNumeroTotalTarefas());

        lista.adicionarTarefa("Tarefa 1");
        lista.adicionarTarefa("Tarefa 2");
        lista.adicionarTarefa("Tarefa 3");
        lista.adicionarTarefa("Tarefa 2");

        System.out.println("Número total: " + lista.obterNumeroTotalTarefas());

        lista.removerTarefa("Tarefa 2");

        System.out.println("Número total: " + lista.obterNumeroTotalTarefas());
        
        lista.obterDescricaoTarefas();
    }
}

package projeto.Ope.List;
import java.util.List;
public class ListaTarefas {

    private List<tarefas> tarefaList;

    public ListaTarefas() {
        this.tarefaList = new java.util.ArrayList<>();
}

    public void adicionarTarefa(String descrição) {
        tarefaList.add(new tarefas(descrição));
    }

    public void removerTarefa(String descrição) {
        List<tarefas> tarefasParaRemover = new java.util.ArrayList<>();
        for (tarefas t : tarefaList) {
            if (t.getDescrição().equals(descrição)) {
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas() {
        return tarefaList.size();

    }

    public void obterDescriçãoTarefasa(){
      System.out.println("Lista de Tarefas:" + tarefaList);
    }
    
    public static void main(String[] args) {
        ListaTarefas listaTarefa =new ListaTarefas();
        

        listaTarefa.adicionarTarefa("Estudar Java");
        listaTarefa.adicionarTarefa("Fazer exercícios");
        listaTarefa.adicionarTarefa("Estudar Java");
        System.out.println("Número total de tarefas:" + listaTarefa.obterNumeroTotalTarefas());
    
       
    
        listaTarefa.obterDescriçãoTarefasa();
    }
}

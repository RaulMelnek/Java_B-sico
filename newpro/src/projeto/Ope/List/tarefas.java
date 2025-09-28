package projeto.Ope.List;

public class tarefas {
    //atributo

    private String descrição;

    public tarefas(String descrição) {
        this.descrição = descrição;
    }

    public String getDescrição() {
        return descrição;
    }
    @Override
    public String toString() {
        return descrição;
    }
}

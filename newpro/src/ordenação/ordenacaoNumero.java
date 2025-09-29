package ordenação;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ordenacaoNumero {

    private List<pessoa> pessoaList;
    public ordenacaoNumero() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        pessoaList.add(new pessoa(nome, idade, altura));
    }

    public List<pessoa> ordenarPorIdade() {
        List<pessoa> pessoasOrdenadas = new ArrayList<>(pessoaList);
        Collections.sort(pessoasOrdenadas);
        return pessoasOrdenadas;
    }
    public List<pessoa> ordenarPorAltura() {
        List<pessoa> pessoasOrdenadas = new ArrayList<>(pessoaList);
        Collections.sort(pessoasOrdenadas, new pessoa().new ComparatorPorAltraura());
        return pessoasOrdenadas;
    }
}

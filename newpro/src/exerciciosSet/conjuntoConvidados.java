package exerciciosSet;
import java.util.Set;
import java.util.HashSet;
public class conjuntoConvidados {

    private Set <convidado> convidadoSet;
    public conjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }
    public void adicionarConvidado(String nome, int codigoConvite) {
        convidadoSet.add(new convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoDoConvite(int codigoConvite) {
        convidado convidadoParaRemover= null;
        for (convidado c : convidadoSet) {
            if (c.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);

    }
    public int contarConvidados() {
        return convidadoSet.size();
    }

    public void exibirConvidados() {
       System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        conjuntoConvidados conjunto = new conjuntoConvidados();
        System.out.println("Total de convidados: " + conjunto.contarConvidados());


        conjunto.adicionarConvidado("Alice", 101);
        conjunto.adicionarConvidado("Bob", 102);
        conjunto.adicionarConvidado("Charlie", 103);
        conjunto.adicionarConvidado("Alice", 101); // Tentativa de adicionar duplicado

        System.out.println("Total de convidados: " + conjunto.contarConvidados());
        conjunto.exibirConvidados();

        conjunto.removerConvidadoPorCodigoDoConvite(102);
        System.out.println("Após remover o convidado com código 102:");
        System.out.println("Total de convidados: " + conjunto.contarConvidados());
        conjunto.exibirConvidados();
    }
}

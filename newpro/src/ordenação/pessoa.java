package ordenação;

import java.util.Comparator;

public class pessoa implements Comparable <pessoa> {

    private String nome;
    private int idade; 
    private double altura;

    public pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public double getAltura() {
        return altura;
    }

    @Override
    public String toString() {
        return "pessoa [nome=" + nome + ", idade=" + idade + ", altura=" + altura + "]";
}
    @Override
    public int compareTo(pessoa outraPessoa) {
        return Integer.compare(this.idade, outraPessoa.idade);
    }

    class ComparatorPorAltraura implements Comparator<pessoa> {
        @Override
        public int compare(pessoa p1, pessoa p2) {
            return Double.compare(p1.getAltura(), p2.getAltura());
        }
        
    }
}


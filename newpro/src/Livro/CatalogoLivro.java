package Livro;
import java.util.List;
import java.util.ArrayList;

public class CatalogoLivro {
    private List<Livro> livroList;

    public CatalogoLivro() {
        this.livroList =new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }
    
    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
            }
            }}
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloDeAnos (int anoInicio, int anoFim) {
        List<Livro> livrosNoIntervalo = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAnoPublicacao() >= anoInicio && l.getAnoPublicacao() <= anoFim) {
                    livrosNoIntervalo.add(l);
            
                }
            }
        }
        return livrosNoIntervalo;
    }

    public Livro pesquisarPorTitulo (String titulo) {
      Livro livroPorTitulo = null;
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[]args) {
        CatalogoLivro catalogoLivros= new CatalogoLivro();
        catalogoLivros.adicionarLivro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954);
        catalogoLivros.adicionarLivro("1984", "George Orwell", 1949);
        catalogoLivros.adicionarLivro("O Hobbit", "J.R.R. Tolkien", 1937);
        
        System.out.println(catalogoLivros.pesquisarPorAutor("George Orwell"));
    }
}


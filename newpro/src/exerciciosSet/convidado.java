package exerciciosSet;
public class convidado {

    private String nome;
    private int codigoConvite;

    public convidado(String nome, int codigoConvite) {
        this.nome = nome;
        this.codigoConvite = codigoConvite;
    }

    public String getNome() {
        return nome;
    }      
    public int getCodigoConvite() {
        return codigoConvite;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        convidado other = (convidado) obj;
        return codigoConvite == other.codigoConvite;
      
    }

    @Override
    public String toString() {
        
        return "convidado [nome=" + nome + ", codigoConvite=" + codigoConvite + "]";
    }
}
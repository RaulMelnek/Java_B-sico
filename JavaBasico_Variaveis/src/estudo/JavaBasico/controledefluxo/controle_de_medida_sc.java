package estudo.JavaBasico.controledefluxo;

public class controle_de_medida_sc {
    public static void main(String[] args) {
        String tamanho = "P";
        switch (tamanho) {
            case "P":
            case "p":
                System.out.println("Pequeno");
                break;
            case "M":
            case "m":
                System.out.println("Médio");
                break;
            case "G":
            case "g":
                System.out.println("Grande");
                break;
        
            default:
                System.out.println("Tamanho inválido");
                break;
        } 
    }
}   

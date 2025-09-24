package estudo.JavaBasico.controledefluxo;

public class resutado_escolar_encandeado {
    public static void main(String[] args) {
        int nota = 8;
        if (nota >= 7) {
            System.out.println("Aprovado");
         } else if (nota >= 5 && nota < 7) {
            System.out.println("Recuperação");
         } else {
            System.out.println("Reprovado");
         }
        
    }
}


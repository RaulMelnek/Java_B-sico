package estudo.JavaBasico.ControledeRepetição;
import java.util.Random;
public class DoWhile {
    public static void main(String[] args) {
     System.out.println("Chamando...");
     do {
        //executa pelo menos uma vez
         System.out.println("Tocando...");
     } while (!tocando());
        System.out.println("Alô!");

    }
    private static boolean tocando() {
        boolean atendeu = new Random().nextInt(3)==1;
        System.out.println("Atendeu? " + atendeu);
        //negando ato se atendeu é true, retorna false
        return atendeu;
    }
}

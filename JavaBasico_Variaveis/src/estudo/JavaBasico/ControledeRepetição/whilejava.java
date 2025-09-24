package estudo.JavaBasico.ControledeRepetição;
import java.util.concurrent.ThreadLocalRandom;
public class whilejava {
    public static void main(String[] args) {
        double mesada = 50.0;
        while (mesada > 0) {
            double valorDoce= valorAleatorio();

            if (valorDoce> mesada)
                valorDoce=mesada;

            System.out.println("Mesada atual: R$" + mesada);
            mesada= mesada - valorDoce;
        }
    }

    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(5.0, 20.0);
    }
}
package estudo.JavaBasico.ControledeRepetição;

public class ForemArrays {
    // em arrays o indice começa em 0
    //se utiliza o .length para saber o tamanho do array
    public static void main(String[] args) {
        String[] carros = {"NA","Volvo", "BMW", "Ford", "Mazda"};
        for (int i = 0; i < carros.length; i++) {
            System.out.println("O carro no indice " + i + " é: " + carros[i]);
        }
    }
}

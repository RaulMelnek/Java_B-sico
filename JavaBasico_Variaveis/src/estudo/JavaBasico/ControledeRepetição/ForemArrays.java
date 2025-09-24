package estudo.JavaBasico.ControledeRepetição;

public class ForemArrays {
    // em arrays o indice começa em 0
    //se utiliza o .length para saber o tamanho do array
    public static void main(String[] args) {
        String[] carros = {"Volvo", "BMW", "Ford", "Mazda"};
        for(String carro : carros){
            System.out.println("Marca do carro é:" + carro);
        }
    }
}

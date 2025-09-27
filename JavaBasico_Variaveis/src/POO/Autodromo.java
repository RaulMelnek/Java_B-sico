package POO;

public class Autodromo {
    public static void main(String[] args) {
        carro Jeep= new carro();
        Jeep.setChassi("Chassi: 12347");
    

        moto Honda= new moto();
        Honda.setChassi("Chassi: 12345");
    

        veiculo coringa= Honda;
        coringa.ligar();
    }
}

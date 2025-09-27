package POO;

public class Autodromo {
    public static void main(String[] args) {
        carro Jeep= new carro();
        
    

        moto Honda= new moto();
        Honda.setChassi("Chassi: 12345");
    

        String veiculoEscolhido= "carro";
            if (veiculoEscolhido.equals("carro")){
            System.out.println(Jeep.getChassi());
            Jeep.ligar();
        } else if (veiculoEscolhido.equals("moto")){
            System.out.println(Honda.getChassi());
            Honda.ligar();
        } else {
            System.out.println("Veículo não encontrado");
        }
       
    }
}

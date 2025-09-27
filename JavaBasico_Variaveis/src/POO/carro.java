package POO;

public class carro extends veiculo {
    public void ligar(){
        confereCombustivel();
        confereCambio();
        System.out.println("O carro está ligado");
    }   
    private void confereCombustivel(){
        System.out.println("coferindo combustivel");
    }
    private void confereCambio(){
        System.out.println("coferindo cambio em P");
    }
    
}

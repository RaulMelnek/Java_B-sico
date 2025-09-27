package POO;

public abstract class veiculo {
    private String Chassi;
    public String getChassi() {
        return Chassi;
    }
    public void setChassi(String chassi) {
        this.Chassi = chassi;
    }
    public abstract void ligar();
}

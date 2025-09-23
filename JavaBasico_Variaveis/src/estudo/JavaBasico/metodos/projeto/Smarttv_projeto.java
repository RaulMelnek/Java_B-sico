package estudo.JavaBasico.metodos.projeto;
//caracteristics: ligada (boolean), canal (int), volume (int)
//ligar ou desligar assim que mudar estado da ligada
//aumentara ou diminuira o volume sempre em +1 ou -1
//podera mudar de canal de 1 em 1 ou definindo numero do canal
public class Smarttv_projeto {
        boolean ligada = false;
        int canal = 1;
        int volume = 25;

    public void mudarCanal(){
        canal++;
    }

    public void voltarCanal(){
        canal--;
    }
    public void escolherCanal(int novoCanal){
        canal = novoCanal;

    }

    public void aumentarVolume(){
        volume++;
        //ou volume= volume +1;
    }

    public void diminuirVolume(){
        volume--;
    }

    public void ligar(){
        ligada = true;
        }
    public void desligar(){
        ligada = false;
}
}

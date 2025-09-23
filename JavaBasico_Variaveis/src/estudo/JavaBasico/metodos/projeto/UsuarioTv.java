package estudo.JavaBasico.metodos.projeto;

public class UsuarioTv {

    public static void main(String[] args) {
        Smarttv_projeto smarttv = new Smarttv_projeto();
        //o que eu acabei de fazer?
        //criei um objeto chamado smarttv e
        //este objeto é uma instancia da classe Smarttv_projeto
        //agora posso usar o objeto smarttv para acessar
        //os atributos e métodos da classe Smarttv_projeto

        smarttv.ligar();
            System.out.println("Tv ligada? " + smarttv.ligada);
            System.out.println("Canal atual? " + smarttv.canal);
            System.out.println("Volume atual? " + smarttv.volume);
        smarttv.aumentarVolume();
            System.out.println("Volume " + smarttv.volume);
        smarttv.aumentarVolume();
            System.out.println("Volume " + smarttv.volume);
        smarttv.diminuirVolume();
            System.out.println("Volume " + smarttv.volume);
        smarttv.mudarCanal();
            System.out.println("Canal " + smarttv.canal);
        smarttv.mudarCanal();
            System.out.println("Canal " + smarttv.canal);
        smarttv.voltarCanal();
            System.out.println("Canal " + smarttv.canal);
        smarttv.escolherCanal(33);
            System.out.println("Canal " + smarttv.canal);

        smarttv.desligar();
            System.out.println("Novo Status--> Tv ligada? " + smarttv.ligada);

    }
}

package estudo.JavaBasico.controledefluxo;

public class controledefluxo {
/*
 * Controle de fluxo - estruturas condicionais e de repetição simples
 * é quando queremos que o programa tome decisões
 * baseado em condições que podem ser verdadeiras ou falsas
 * Exemplo:
 */

 public static void main(String args[]){
   double saldo = 25.0;
   double valorSolicitado = 30.0;

   if (valorSolicitado < saldo) {
      saldo = saldo - valorSolicitado;
      System.out.println("Saldo atual:" + saldo );
   } else {
      System.out.println("Saldo insuficiente");
   }
}
}


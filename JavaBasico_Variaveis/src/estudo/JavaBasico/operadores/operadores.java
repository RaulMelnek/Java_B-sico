package estudo.JavaBasico.operadores;

public class operadores {

        //classe Operadores.java
        double soma = 10.5 + 15.7;
        int subtração = 113 - 25;
        int multiplicacao = 20 * 7;
        int divisao = 15 / 3;
        int modulo = 18 % 3;
        double resultado = (10 * 7) + (20/4);

        //classe Operadores.java
        String nomeCompleto = "LINGUAGEM" + "JAVA";
                
        //qual o resultado das expressoes abaixo?
        
        public static void main(String[] args) {
            String concatenacao ="?"; 

            concatenacao = 1+1+1+"1";
            System.out.println(concatenacao);

            concatenacao = 1+"1"+1+1;
            System.out.println(concatenacao);

            concatenacao = 1+"1"+1+"1";
            System.out.println(concatenacao);

            concatenacao = "1"+1+1+1;
            System.out.println(concatenacao);

            concatenacao = "1"+(1+1+1);
            System.out.println(concatenacao);



            int numero=5;
            System.out.println(-numero);
                numero= -numero;
            System.out.println(++numero);
        
                }
        }


    
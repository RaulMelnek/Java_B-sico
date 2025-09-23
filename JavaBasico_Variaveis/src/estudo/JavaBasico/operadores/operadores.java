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
        
//Declara duas variáveis inteiras, a e b.
//Atribui 5 para a.
//Incrementa a antes de atribuir a b (pré-incremento), então a vira 6 e b recebe 6.
//Usa o operador ternário para comparar se a é igual a b. 
//Se for, resultado recebe "verdadeiro", senão "falso".
//Imprime o resultado.
            int a, b;
            a=5;
            b=6;

            String resultado= a==b ? "verdadeiro" : "falso";

            System.out.println(resultado);
                }
        }


    
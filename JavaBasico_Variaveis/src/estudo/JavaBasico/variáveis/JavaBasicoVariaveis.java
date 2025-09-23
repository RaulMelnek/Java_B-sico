package estudo.JavaBasico.variáveis;
public class JavaBasicoVariaveis {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(final String[] args) throws Exception {

        final int idade = 20;
        final String nome = "João";
        final double salario = 2500.50;
        final boolean ativo = true;

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
        System.out.println("Ativo: " + ativo);

    // Exemplos de tipos primitivos
    // tipos primitivos
    //classes de texto string

        final byte idadeByte = 30; // -128 a 127
        final short populacaoCidade = 15000; // -32.768 a 32.767
        final long populacaoMundial = 8000000000L; // Sufixo L para long
        final float altura = 1.75f; // Sufixo f para float
        final char inicial = 'J'; // Um único caractere
        final double preco = 19.99; // Números decimais de dupla precisão
        final boolean aprovado = false; // true ou false

    System.out.println("Byte: " + idadeByte);
    System.out.println("Short: " + populacaoCidade);
    System.out.println("Long: " + populacaoMundial);
    System.out.println("Float: " + altura);
    System.out.println("Char: " + inicial);
    System.out.println("Double: " + preco);
    System.out.println("Boolean: " + aprovado);
    
    //constantes - sempre escritas em caixa alta e com 'final'
        final double PI = 3.14;

    }
}

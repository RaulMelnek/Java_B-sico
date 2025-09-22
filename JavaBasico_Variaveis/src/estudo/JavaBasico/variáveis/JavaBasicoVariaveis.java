package estudo.JavaBasico.variáveis;
public class JavaBasicoVariaveis {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {

        int idade = 20;
        String nome = "João";
        double salario = 2500.50;
        boolean ativo = true;

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
        System.out.println("Ativo: " + ativo);

    // Exemplos de tipos primitivos
    byte idadeByte = 30; // -128 a 127
    short populacaoCidade = 15000; // -32.768 a 32.767
    long populacaoMundial = 8000000000L; // Sufixo L para long
    float altura = 1.75f; // Sufixo f para float
    char inicial = 'J'; // Um único caractere
    double preco = 19.99; // Números decimais de dupla precisão
    boolean aprovado = false; // true ou false

    System.out.println("Byte: " + idadeByte);
    System.out.println("Short: " + populacaoCidade);
    System.out.println("Long: " + populacaoMundial);
    System.out.println("Float: " + altura);
    System.out.println("Char: " + inicial);
    System.out.println("Double: " + preco);
    System.out.println("Boolean: " + aprovado);
    }
}

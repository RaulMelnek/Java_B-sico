package estudo.JavaBasico.controledefluxo.ResultadoEscolar;

public class Resultado_escolar_ternario {
        public static void main(String[] args) {
            int nota=4;
            String resultado = nota >= 7 ? "Aprovado" : nota>=5 && nota<7 ? "Recuperação" : "Reprovado";
            System.out.println(resultado);
        }
}

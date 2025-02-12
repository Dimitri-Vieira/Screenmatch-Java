// o "//" é usado para comentar o código
// o "/*" juntamente ao "*/" são usados para comentar blocos grandes de código

public class Main {
    public static void main (String[] args){
        System.out.println ("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento: " + anoDeLancamento);

        boolean incluidoNoPlano = false;
        double notaDoFime = 8.1;

        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.println(media);
        String sinopse;
        sinopse = """
                Filme: Top Gun
                Filme de aventura com galã dos anos 80
                Muito bom!
                """ + anoDeLancamento;
        System.out.println(sinopse);

        int classificacao = (int) (media /2);
        System.out.println(classificacao);

    }
}
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
Scanner scanner = new Scanner(System.in);

   //Solicita os dados da votação
       System.out.print("Digite o numero total de eleitores: ");
         int totalEleitores = scanner.nextInt();
       System.out.print("Digite o numero de votos em branco: ");
         int votosbrancos = scanner.nextInt();
       System.out.print("Digite o numero de votos nulos: ");
         int votosnulos = scanner.nextInt();
       System.out.print("Digite o numero de votos validos: ") ;
         int votosvalidos = scanner.nextInt();

   //Calcula os percentuais
      double percentualbrancos = (votosbrancos * 100.0) / totalEleitores;
      double percentualnulos = (votosnulos * 100.0) / totalEleitores;
      double percentualvalidos = (votosvalidos * 100.0) / totalEleitores;

   //Exibe os resultados
      System.out.println("O percentual de votos em brancos é " + percentualbrancos + "%");
        // % adicionar a porcentagem pra a melhor leitura
      System.out.println("O percentual de votos nulos é " + percentualbrancos + "%");
      System.out.println("O percentual de votos validos é " + percentualvalidos + "%");

    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

               //Solicita idade em anos
        System.out.print("Digite sua idade em anos: ");
                int anos = scanner.nextInt();

                //Solicita idade em meses
        System.out.print("Digite sua idade em meses: ");
        int meses = scanner.nextInt();

                //Solicita em dias
        System.out.print("Digite sua idade em dias: ");
        int dias = scanner.nextInt();

               //Calcula dados
        int idadeDias = (anos * 365) + (meses * 30) + dias;

                //Calcula idade total
        System.out.println("Sua idade total é: " + idadeDias);


    }
}

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

       //Solicitar a idade
        System.out.print("Qual sua idade? ");
        int idade = scanner.nextInt();

        //Verificar a idade
        if (idade >= 18) {
            System.out.println("Você é maior de idade!");
        }
        else {
            System.out.println("Você é menor de idade segundo a legislação brasileira!");
        }

        //Verificar a idade com operador termario
        String mensagem = idade >= 18 ? "Você é maior de idade!":"Você é menor de idade";
        System.out.println("Usando operador ternario: " + mensagem);  //Operador ternario é um if/else simplificado
        //feito assim: tipo da variavel + comparação + ? + "oque quer exibir quando a comparação for V e quando for F
        // separado por ":"
        //Podendo ser feito dessa forma: System.out.println(valor >= 18 ? "mensagem 1":"mensagem 2");

        //Calcular a idade
        double horasdevida = idade * 365 * 24;
        System.out.println("Você viveu: " + horasdevida + "horas");


    }
}

import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> cadastro = new ArrayList<>(); // Criando uma lista do 0

        int op = 0;

        while (op !=6) {
            //Menu
            System.out.println("\nMenu:");
            System.out.println("1 - Incluir");
            System.out.println("2 - Alterar");
            System.out.println("3 - Excluir");
            System.out.println("4 - Listar todos");
            System.out.println("5 - Listar Itens");
            System.out.println("6 - Sair");
            System.out.println("Escolha uma opção: ");
            op = sc.nextInt();
            sc.nextLine();


            switch (op) {
                case 1:
                    System.out.println("Digite um item para incluir: ");
                    String novoItem = sc.nextLine(); //Será guardado aqui e adicionado aqui.
                    cadastro.add(novoItem);
                    System.out.println("Item incluído!");
                    break;
                case 2:
                    System.out.println("Digite para alterar: ");
                    int indAlt = sc.nextInt();
                    sc.nextLine();
                    if (indAlt >= 0 && indAlt < cadastro.size()) {
                        System.out.println("Digite um novo valor: ");
                        String novoValor = sc.nextLine();
                        cadastro.set(indAlt, novoValor); //O novo valor alterado é trocado aqui!
                        System.out.println("Cadastro Alterado");
                    } else {
                        System.out.println("Indice invalido!");
                    }
                    break;
                case 3:
                    System.out.println("Digite o numero que deseja excluir: ");
                    int indEx = sc.nextInt();
                    sc.nextLine();
                    if (indEx >= 0 && indEx < cadastro.size()) {
                        cadastro.remove(indEx);
                        System.out.println("Item excluido!");
                    } else {
                        System.out.println("Indice invalido!");
                    }
                    break;
                case 4:
                    System.out.println("Listar todos os itens: ");
                    for (int i = 0; i < cadastro.size(); i++) {
                        System.out.println(i + ": " + cadastro.get(i)); //Aqui é a numeração impressa!
                    }
                    break;
                case 5:
                    System.out.println("Digite o indice para listar: ");
                    int indList = sc.nextInt();
                    sc.nextLine();
                    if (indList >= 0 && indList < cadastro.size()) {
                        System.out.println("Item: " + cadastro.get(indList));
                    } else {
                        System.out.println("Cadastro invalido! ");
                    }
                    break;
                case 6:
                    System.out.println("Fim...");
                    break;
                default:
                    System.out.println("Opção inválida! ");
            }


        }

        sc.close();

    }
}

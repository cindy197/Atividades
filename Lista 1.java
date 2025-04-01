//Atividade 1: 
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o valor da cotação atual do dolar: ");
        double dolar = sc.nextDouble();
        System.out.println("Insira o valor do real pra conversão: ");
        double real = sc.nextDouble();

        double conversao = real * dolar;
        System.out.println("O valor convertido é: " + conversao);


    }
}

// Atividade 2: Quadrado
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o valor do numero: ");
        int n1 = sc.nextInt();
        System.out.println("Insira o valor do numero: ");
        int n2 = sc.nextInt();
        System.out.println("Insira o valor do numero: ");
        int n3 = sc.nextInt();
        System.out.println("Insira o valor do numero: ");
        int n4 = sc.nextInt();

        int somaQuadrado = (n1 * n1) + (n2 * n2) + (n3 * n3) + (n4 * n4);
        System.out.println("O valor total é: " + somaQuadrado);
    }
}

// Atividade 3: Comissao

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o valor do preço unitário das peças: ");
        double precoUnit = sc.nextDouble();
        System.out.println("Insira a quantidade vendida: ");
        double quantidade = sc.nextDouble();

        double total = (precoUnit * quantidade * 5) / 100;
        System.out.println("A comissao total é: " + total);

    }
}

// Atividade 4 : Valor int e antecessor
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um valor pra calcular: ");
        int numero = sc.nextInt();

        int anterior = numero - 1;

        System.out.println("O valor anterior é: " + anterior);



    }
}
// Atividade 5: Dimensão do retangulo  

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o valor da base do retangulo: ");
        double base = sc.nextDouble();

        System.out.println("Insira valor da altura do retangulo: ");
        double altura = sc.nextDouble();

        double areaRetang = base * altura;

        System.out.println("O valor da area do retangulo é : " +areaRetang);





    }
}

// Atividade 6: idade em dias
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a idade em anos: ");
        int idade = sc.nextInt();

        int idadeDias = idade * 365;
        System.out.println("Sua idade em dias é: " +idadeDias);



    }
}
// Atividade 7: Idade dias, meses, anos
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a idade em anos: ");
        int idadeAnos = sc.nextInt();
        System.out.println("Digite a idade em meses: ");
        int idadeMeses = sc.nextInt();
        

        int idadeTotal = (idadeAnos * 365) + (idadeMeses * 30);
        System.out.println("O valor total é: " + idadeTotal);


    }
}

// Atividade 8 : Votos

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o numero total de eleitores: ");
        int totalEleit = sc.nextInt();
        System.out.println("Insira o numero total de votos em branco: ");
        int votosBrancos = sc.nextInt();
        System.out.println("Insira o numero total de votos nulos: ");
        int votosNulos = sc.nextInt();
        System.out.println("Insira o numero total de votos validos: ");
        int votosValidos = sc.nextInt();

        double percentualBrancos = (votosBrancos * 100) / totalEleit;
        double percentualNulos = (votosNulos * 100) / totalEleit;
        double percentualValidos = (votosValidos * 100) / totalEleit;

        System.out.println("O valor de votos brancos é " + percentualBrancos + "%");
        System.out.println("O valor de votos nulos é " + percentualNulos + "%");
        System.out.println("O valor de votos validos é " + percentualValidos + "%");





    }
}

//Atividade 9: Salario Reajuste 
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o valor do salario mensal atual: ");
        double salMensal = sc.nextDouble();

        System.out.print("Insira o valor do reajuste: ");
        double reajuste = sc.nextDouble();

        double salReajuste = salMensal + (salMensal * reajuste / 100);
        System.out.println("O salario com reajuste é de: R$ " + salReajuste);



    }
}

//Atividade 10 : Valor final consumidor Carro 
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o custo de fabrica: ");
        double custoFab = sc.nextDouble();

        double valorDistribuidor = custoFab * 0.28;
        double valorImposto = custoFab * 0.45;

        double valorFinal = custoFab + valorImposto + valorDistribuidor;
        System.out.println("O valor final ao consumidor R$: " + valorFinal);

    }
}

// Atividade 11: Carro vendido
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o numero de carros vendidos: ");
        int carrosVendidos = sc.nextInt();
        System.out.println("Insira o valor total de vendas: ");
        double totalVendas = sc.nextDouble();
        System.out.println("Insira o salario fixo: ");
        double salFixo = sc.nextDouble();
        System.out.println("Insira o valor recebido por carro vendido: ");
        double carroComissao = sc.nextDouble();

        double salarioFinal = salFixo + (carroComissao * carrosVendidos) + (totalVendas * 0.05);
        System.out.println("O salario final é: " + salarioFinal);




    }
}







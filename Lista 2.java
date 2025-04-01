// Atividade 1: Numero maior
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um numero: ");
        int n1 = sc.nextInt();
        System.out.println("Insira outro numero: ");
        int n2 = sc.nextInt();

        if (n1>n2){
            System.out.println("O maior numero é: " + n1);
        } else if (n2>n1) {
            System.out.println("O maior numero é: " + n2);
        } else {
            System.out.println("São iguais!");
        }

    }
}

// Atividade 2: Atividade preço mais barato
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o produto 1: ");
        double produto1 = sc.nextDouble();
        System.out.println("Insira o produto 2: ");
        double produto2 = sc.nextDouble();
        System.out.println("Insira o produto 3: ");
        double produto3 = sc.nextDouble();

        if (produto1 < produto2 && produto1 < produto3) {
            System.out.println("O produto mais barato a ser comprado é " + produto1);
        } else if (produto2 < produto1 && produto2 < produto3) {
            System.out.println("O produto mais barato a ser comprado é " + produto2);
        } else {
            System.out.println("O produto mais barato a ser comprado é " + produto3);
        }


    }
}

// Atividade 3: Média
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.print("Insira a nota 1: ");
        double nota1 = sc.nextDouble();
        System.out.print("Insira a nota 2: ");
        double nota2 = sc.nextDouble();

        double notaGeral = (nota1 + nota2) / 2;

        if (notaGeral >= 7) {
            System.out.println("Aprovado!");
        } else if (notaGeral == 10) {
            System.out.println("Aprovado com Distinção!");

        } else {
            System.out.println("Reprovado");
        }


    }
}

// Atividade 4: Salario porcentagem
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o salário do colaborador: ");
        double salColaborador = sc.nextDouble();

        double percentualAumento;

        if (salColaborador<= 280) {
            percentualAumento = 0.20;
        } else if (salColaborador <= 700) {
            percentualAumento = 0.15;
        } else if (salColaborador <= 1500) {
            percentualAumento = 0.10;
        } else {
            percentualAumento = 0.05;
        }

        double valorAumento = salColaborador * percentualAumento;
        double novoSalario = salColaborador + valorAumento;

        System.out.println("O salario antes do reajuste é: R$ " + salColaborador);
        System.out.println("O percentual de aumento aplicado foi: " + percentualAumento + "%");
        System.out.println("O valor do aumento foi: R$ " + valorAumento);
        System.out.println("O novo salario é : R$ " + novoSalario);


    }
}

// Questão 5: Dia da Semana
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um valor de 1 a 7: ");
        int numero = sc.nextInt();

        String dia;

        switch (numero) {
            case 1 :
                dia = "Domingo";
                break;
            case 2 :
                dia = "Segunda";
                break;
            case 3 :
                dia = "Terça";
                break;
            case 4 :
                dia = "Quarta";
                break;
            case 5 :
                dia = "Quinta";
                break;
            case 6 :
                dia = "Sexta";
                break;
            case 7 :
                dia = "Sabado";
                break;
            default:
                dia = "Valor invalido";
                break;

        }
        System.out.println("O dia da semana correspondente é: " + dia);


    }
}

// Atividade 6: Calculo folha de Pagamento

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o valor da sua hora: ");
        double valorHora = sc.nextDouble();
        System.out.println("Quantidade de horas trabalhadas: ");
        double quantidadeHora = sc.nextDouble();

        double salarioBruto = valorHora * quantidadeHora;
        double iR;

        if (salarioBruto <= 900) {
            System.out.println("Isento");
            iR = 0;
        } else if (salarioBruto <= 1500) {
            System.out.println("Desconto de 5%");
            iR = 0.05;
        } else if (salarioBruto <= 2500) {
            System.out.println("Desconto de 10%");
            iR = 0.10;
        } else {
            System.out.println("Desconto de 20%");
            iR = 0.20;
        }

        double fGTS =  salarioBruto * 0.11;
        double iNSS = salarioBruto * 0.10;
        double descontos = iR + iNSS;
        double salarioLiquido = salarioBruto - descontos;

        System.out.println("O salario bruto é: R$ " + salarioBruto);
        System.out.println("O FGTS é: R$ " + fGTS);
        System.out.println("O INSS é de: R$ " + iNSS);
        System.out.println("O valor do desconto é: " + descontos + "%");
        System.out.println("O salario liquido é: R$ " + salarioLiquido);


    }
}


// Atividade 7 : Posto de combustivel 

import java.util.Scanner;
import java.util.Locale;
public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        final double precoGasolina = 5.50;
        final double precoAlcool = 4.19;

        System.out.println("Digite o tipo de combustivel ( A = Alcool ou G = Gasolina): ");
        char tipo = sc.next().toUpperCase().charAt(0);

        System.out.println("Digite a quantidade de litros vendidos: ");
        double litros = sc.nextDouble();

        double precoLitros;
        double desconto;

        if (tipo == 'A') {
            precoLitros = precoAlcool;
            if (litros <= 20) {
                desconto = 0.03;
            } else {
                desconto = 0.05;
            }
        } else if (tipo == 'B') {
            precoLitros = precoGasolina;
            if (litros <= 20) {
                desconto = 0.04;
            } else {
                desconto = 0.06;
            }

        } else {
            System.out.println("Tipo de combustivel invalido!");
            return;
        }

        double totalSemDesconto = litros * precoLitros;
        double valorDesconto = totalSemDesconto * desconto;
        double valortotal = totalSemDesconto - valorDesconto;

        System.out.println("O valor total a pagar é: R$ " + valortotal); 


    }
} 

// Atividade 8: Investigação 
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int contagem = 0;

        System.out.println("Responda com S ou N para as seguintes perguntas: ");

        System.out.println("Telefonou para a vítima? ");
        char respUm = sc.next().toUpperCase().charAt(0);
        if (respUm == 'S') {
            contagem++;
        }

        System.out.println("Esteve no local do crime?");
        char respDois = sc.next().toUpperCase().charAt(0);
        if (respDois=='S') {
            contagem++;
        }

        System.out.println("Mora perto da vítima?");
        char respTres = sc.next().toUpperCase().charAt(0);
        if (respTres=='S') {
            contagem++;
        }
        System.out.println("Devia para a vítima?");
        char respQuatro = sc.next().toUpperCase().charAt(0);
        if (respQuatro=='S') {
            contagem++;
        }
        System.out.println("Já trabalhou com a vítima?");
        char respCinco = sc.next().toUpperCase().charAt(0);
        if (respCinco=='S') {
            contagem++;
        }

        System.out.println("Classificação: " + contagem);
        if (contagem < 2) {
            System.out.println("Inocente!");
        } else if (contagem == 2) {
            System.out.println("Suspeito!");
        } else if (contagem == 3 || contagem == 4) {
            System.out.println("Cúmplice!");
        } else {
            System.out.println("Assassino!");
        }


    }
}








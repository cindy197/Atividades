// Atividade 1: 1 a 100
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }


    }
}

// Atividade 2: 100 a 1
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        for (int i = 100; i >= 1; i--) {
            System.out.println(i);
        }


    }
}

// Atividade 3: Numeros de 1 a 5

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int soma = 0;

        System.out.println("Digite 5 números: ");
        for (int i = 0; i < 5; i++) {
            System.out.println("Número " + (i + 1 ) + ": ");
            soma += sc.nextInt();
        }

        System.out.println("A soma dos números é: " + soma);


    }
}

// Atividade 4: N numeros dados pelo usuário 
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Qual quantidade de numeros deseja inserir?");
        int num = sc.nextInt();

        int soma = 0;
        int contador = 0;

        while (contador < num) {
            System.out.println("Numero " + (contador + 1) + ":");
            soma += sc.nextInt();
            contador++;
        }

        double media = (double) soma / num;
        System.out.println("A média dos numeros é: " + media);



    }
}

// Atividade 5: Quantidade pares 
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros deseja digitar? ");
        int n = sc.nextInt();

        int quantidadePares = 0;

        while (n > 0) {
            System.out.println("Numero: ");
            int numero = sc.nextInt();
            if (numero % 2 == 0) {
                quantidadePares++;
            }
            n--;
        }

        System.out.println("A quantidade de numeros pares é: " + quantidadePares);


    }
}

// Atividade 6: Quantidade impares 

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Quantidade de numeros que deseja digitar: ");
        int n = sc.nextInt();

        int quantidadeImpares = 0;

        while (n > 0) {
            System.out.println("Numero: ");
            int numero = sc.nextInt();
            if (numero % 2 != 0) {
                quantidadeImpares++;
            }
            n--;
        }

        System.out.println("A quantidade de numeros impares é: " + quantidadeImpares);


    }
}

// Atividade 7: Menor valor, maior valor e a soma dos valores

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade uma quantidade de numeros: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Valor inválido");
        }

        System.out.println("Numero: ");
        int numero = sc.nextInt();
        int menor = numero;
        int maior = numero;
        int soma = numero;
        int contador = 1;

        while (contador < n) {
            System.out.println("Numero " + (contador + 1) + ":");
            numero = sc.nextInt();

            if (numero < menor) {
                menor = numero;
            } else if (numero>maior) {
                maior = numero;

            }
            soma += numero;
            contador++; // acrescenta direto na variável
        }
        System.out.println("Maior numero: " + maior);
        System.out.println("Menor numero: " + menor);
        System.out.println("A soma dos numeros: " + soma);


    }
}

// Atividade 8 : Pesquisa de caracteristicas fisicas
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int maiorIdade = 0;
        int sFeminino = 0;
        int n = 500;

        while (n>0) {
            System.out.println("Qual é o sexo (M/F) ?");
            char sexo = sc.next().toUpperCase().charAt(0);

            System.out.println("Qual cor dos olhos: A = Azuis | V = Verdes | C = Castanhos ");
            char corOlhos = sc.next().toUpperCase().charAt(0);

            System.out.println("Qual a cor dos cabelos: L = Loiros | C = Castanhos | P = Pretos ");
            char cabelos = sc.next().toUpperCase().charAt(0);

            System.out.println("Qual a idade ?");
            int idade = sc.nextInt();

            if (idade > maiorIdade) {
                maiorIdade = idade;
            }
            if (sexo == 'F' && corOlhos == 'V' && cabelos == 'L' && idade >= 18 && idade <= 35) {
                sFeminino++;
            }

            n--;
        }

        System.out.println("A maior idade do grupo é: " + maiorIdade);
        System.out.println("a quantidade de indivíduos do sexo feminino, cuja idade está entre 18 e 35 anos e que tenham olhos verdes e cabelos louros: " + sFeminino);

    }
}



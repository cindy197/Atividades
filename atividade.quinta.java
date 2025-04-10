//Explicação do uso: Foi utilizado um array de 3 dimensões, porque precisava organizar uma estrutura em que o aluno tivesse 3
//disciplinas, e cada uma delas precisava guardar 5 notas. Julguei mais adequado utilizar um array de 3 dimensões. 

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // o array é uma estrutura que pode guardar uma quantidade x de valores.
        //Sintaxe: tipo[] nomeVariavel = new tipo[tamanho];

        double[][][] notas = new double[5][3][5];
        Scanner sc = new Scanner(System.in);

        for (int aluno = 0; aluno < 5; aluno++) {
            System.out.println("Aluno " + (aluno + 1));
            for (int disciplina = 0; disciplina < 3; disciplina++) {
                System.out.println("Disciplina " + (disciplina + 1));
                for (int nota = 0; nota < 5; nota++){
                    System.out.println("Digite a nota " + (nota + 1));
                    notas[aluno][disciplina][nota] = sc.nextDouble();
                }
            }
        }

        System.out.println("Listagem das notas ! ");

        for (int aluno = 0; aluno < 5; aluno++) {
            System.out.println("Aluno " + (aluno + 1));
            for (int disciplina = 0; disciplina < 3; disciplina++) {
                System.out.println("Disciplina " + (disciplina + 1));
                for (int nota = 0; nota < 5; nota++){
                    System.out.println("Valor da nota " + (nota + 1) + ": " + notas[aluno][disciplina][nota]);
                }
            }
        }








    }
}

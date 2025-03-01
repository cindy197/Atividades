import java.util.Scanner;
public class Comissao
{

 public static void main (String[] args) {
   Scanner comissao = new Scanner (System.in);
   System.out.print(s: "Digite a quantidade de peças:");
   double pecas = comissao.nextDouble();
   System.out.print(s: "Digite o valor da peça:");
   double valor = comissao.nextDouble();
   double comissaototal = (pecas * valor * 5)/100;
   System.out.printf(format:"R$ %.2f" ,comissaototal);
 }
}

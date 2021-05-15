/*Resolva as expressões lógicas abaixo NO CADERNO:

valorA  valorB         Expressão                                 Retorno
5          7       (valorA > valorB)&&(valorA = = valorB)       false
7         25       (true)&&(false)&&(false)
4          4       (true) || (false) || (false)
3         32       (valorA > valorB) || (valorA = = valorB)
5          5       (valorA >= valorB) && (valorA = = valorB)
5          5       (valorA >= valorB) || (valorA = = valorB)
5          6       (valorA <= valorB) && (valorA = = valorB)
5          6       (valorA <= valorB) || (valorA = = valorB)
5          5       (true) && (valorA = = valorB)
5          5       (true) || (valorA = = valorB)*/

package exercicio.pkg006;
import java.util.Scanner;
public class Exercicio006 {
    
    public static void main(String[] args) {
       Scanner expres = new Scanner(System.in);
       
       System.out.println("Digite o valor de A: ");
       int valorA = expres.nextInt();
       
       System.out.println("Digite o valor de B: ");
       int valorB = expres.nextInt();
       
       boolean resultado_da_expressao = (true) || (valorA == valorB);
       System.out.println("O resultado das expressões é: " +resultado_da_expressao);
             
       
       
    }
    
}

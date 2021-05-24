/*Faça um programa que o usuário digite um número e : some este número por 5 e imprima na tela, subtraia o valor
do usuário por 7 e imprima na tela e faça o mesmo com a multiplicação por 10 e divisão por 2. */

package exercicio.pkg09;
import java.util.Scanner;
public class Exercicio09 {

    public static void main(String[] args) {
        Scanner conta = new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        int num1 = conta.nextInt();
        
        int soma = num1 + 5;
        System.out.println("O resultado da soma é: " +soma);
        
        int subtraia = num1 - 7;
        System.out.println("O resultado da subtração é: "+subtraia);
        
        int multiplica = num1 * 10;
        System.out.println("O resultado da multiplicação é "+ multiplica);
        
        float divide = num1/2;
        System.out.println("O resultado da divisão é: " + divide);
    }
    
}

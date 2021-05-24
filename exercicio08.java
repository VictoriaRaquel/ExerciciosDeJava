//Faça um programa que o usuário digite um ano e retorno o Resto da divisão por 4.
package exercicio.pkg008;
import java.util.Scanner;

public class Exercicio008 {
    
    public static void main(String[] args) {
        Scanner conta = new Scanner(System.in);
        
        System.out.println("Digite um ano: ");
        float ano = conta.nextFloat();
        
        float valor_ano = ano/4;
            System.out.println("A divisão é: " + valor_ano);
       
        System.out.println("Digite o resto: ");
        float resto = conta.nextFloat();
        
        float fim = valor_ano % 4 ;
            System.out.println("O resto da divisão é: " + fim);
      }
    
    
}

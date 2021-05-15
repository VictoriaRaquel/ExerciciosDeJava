/*5- Resolva as expressões lógicas abaixo NO CADERNO:

valorA valorB Expressão Retorno
5 7 valorA > valorB 
7 25 valorA < valorB
4 4 valorA >= valorB
3 32 valorA <= valorB
5 5 valorA == valorB
5 5 valorA != valorB
5 6 valorA != valorB
5 6 valorA != valorA
5 valorA != 3
5 3 valorB != 3 */


package exercicio.pkg005;
import java.util.Scanner;

public class Exercicio005 {
    int valor, A,B;
    public static void main(String[] args) {
       Scanner leitura = new Scanner(System.in);
       
       System.out.println("Digite o valor de A: ");
       int valorA = leitura.nextInt();
       
       System.out.println("Digite o valor de B: ");
       int valorB = leitura.nextInt();
       
       boolean pergunta = valorA != 3;
       System.out.println("O valor A é diferente do valor 3: " + pergunta);
       

       
    }
//Obs: é  só mudar as expressões booleana para fazer o resto
   
    
  
}

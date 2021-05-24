/*Faça uma Classe em Java que receba duas idades e dois pesos e dois nomes, e pergunte se são a mesma pessoa,
colocando essas variáveis em uma expressão booleana onde todos devem retornar true se for iguais, imprimindo no
System ... ("Usuários identicos : "+resultado_da_expressao); Esta classe retornará um true ou um false.*/

package exercicio.pkg007;
import java.util.Scanner;

public class Exercicio007 {
    
    public static void main(String[] args) {
        Scanner imprimir = new Scanner(System.in);
        
        System.out.println("Digite a primeira idade: ");
        int primeira_idade = imprimir.nextInt();
        
        System.out.println("Digite a segunda idade: ");
        int segunda_idade = imprimir.nextInt();
        
        System.out.println("Digite o primeiro peso: ");
        float primeiro_peso = imprimir.nextFloat();
        
        System.out.println("Digite o segundo peso: ");
        float segundo_peso = imprimir.nextFloat();
        
        System.out.println("Digite o primeiro nome: ");
        String primeiro_nome = imprimir.next();
        
        System.out.println("Digite o segundo nome: ");
        String segundo_nome = imprimir.next();
        
        boolean resultado_da_expressao = ( true == false ) || (true != false);
        System.out.println("Usuários identicos: "+resultado_da_expressao);
        
        
    }
    
}

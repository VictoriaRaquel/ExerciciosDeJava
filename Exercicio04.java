/*Criando uma classe com nome CadastroDeClientesInfo, deverá solicitar ao usuário que digite os dados : nome,
data de nascimento, rg, cpf, telefone, email, endereço completo, com construtor e após ele digitar imprimir todos os
dados na tela.*/

package cadastrodeclienteinfo;

import java.util.Scanner;
        
public class CadastroDeClienteInfo {

    public static void main(String[] args) {
        Scanner cadastro = new Scanner(System.in);
        Scanner datanascimento = new Scanner(System.in);
        
        System.out.println("Digite eu nome: ");
        String nome = cadastro.nextLine();
        
        System.out.println("Digite sua data de nascimento: ");
        String data = datanascimento.nextLine();
        
        System.out.println("Digite seu rg: ");
        String rg = cadastro.nextLine();
        
        System.out.println("Digite seu cpf: ");
        String cpf = cadastro.nextLine();
        
        System.out.println("Digite seu email: ");
        String email = cadastro.nextLine();
        
        System.out.println("Digite seu endereço:");
        String endereço = cadastro.nextLine();
        
        
        System.out.println("Nome do(a) Cliente: " + nome);
         System.out.println("Data de nascimento do(a) Cliente: " + data);
          System.out.println("Rg do(a) Cliente: " + rg);
           System.out.println("CPF do(a) Cliente: " + cpf);
            System.out.println("Email do(a) Cliente: " + email);
             System.out.println("Endereço do(a) Cliente: " + endereço);
    }
    
}

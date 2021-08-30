
package com.mycompany.lista1;

import java.util.Scanner;
/**
 *
 * @author Tais
 */

public class Exercicio3 {
    public static void main(String[] args) {
       //Leitor (scanner)
        Scanner leitorAlfaNumerico = new Scanner(System.in);
       
        System.out.println("Digite seu login: ");
        String login = leitorAlfaNumerico.nextLine();
        
        System.out.println("Digite seua senha: ");
        String senha = leitorAlfaNumerico.nextLine();
        
        System.out.println("Digite o numero de vezes que voce aceita"
                + " errar a senha antes do bloqueio : ");
        Integer vezes = leitorAlfaNumerico.nextInt();
        
        System.out.println("Seu login é "+login+" e sua senha é "+senha+". Você tem "+vezes+" tentativas antes de ser bloqueado");
    }
}

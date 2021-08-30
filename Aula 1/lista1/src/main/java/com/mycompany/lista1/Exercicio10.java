package com.mycompany.lista1;

import java.util.Scanner;

/**
 *
 * @author Tais
 */
public class Exercicio10 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Scanner lerAlfa = new Scanner(System.in);
        
        System.out.println("Digite seu nome:");
        String nome = lerAlfa.nextLine();
        
        System.out.println("Olá, "+nome+"! Qual o ano de seu nascimento?");
        Integer nasc = lerAlfa.nextInt();
        
        Integer idade = 2030 - nasc;
        
        System.out.println("Em 2030 você terá "+idade+" anos");
    }
}

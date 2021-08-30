package com.mycompany.lista1;

import java.util.Scanner;

/**
 *
 * @author Tais
 */
public class Exercicio9 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Scanner lerAlfa = new Scanner(System.in);
        
        System.out.println("Digite seu nome:");
        String nome = lerAlfa.nextLine();
        
        System.out.println("Insira a primeira nota:");
        Double n1 = ler.nextDouble();
        
        System.out.println("Insira a segunda nota:");
        Double n2 = ler.nextDouble();
        
        Double media = (n1+n2)/2;
        
        System.out.println("Ola, "+nome+". Sua média foi "+media);
    }
}

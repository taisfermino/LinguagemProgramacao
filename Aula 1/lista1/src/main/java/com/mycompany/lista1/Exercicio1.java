package com.mycompany.lista1;

import java.util.Scanner;
/**
 *
 * @author Tais
 */
public class Exercicio1 {
    public static void main (String[] args){
        Scanner leitor = new Scanner (System.in);
        
        // Solicite um número para o usuário(número real).
        System.out.println("Digite um número");
        Double n1 = leitor.nextDouble();
        
        System.out.println("Digite outro número");
        Double n2 = leitor.nextDouble();
        
        Double soma = n1 + n2;
        Double subtracao = n1 - n2;
        Double multiplicacao = n1 * n2;
        Double divisao = n1 / n2;
        
        System.out.println("Resultado da Soma \n"+soma);
        System.out.println("Resultado da Subtração \n"+subtracao);
        System.out.println("Resultado da Multiplicação \n"+multiplicacao);
        System.out.println("Resultado da Divisão \n"+divisao);
    }
}

package com.mycompany.lista1;

import java.util.Scanner;
/**
 *
 * @author Tais
 */
public class Exercicio4 {
    public static void main(String[] args) {
        // Declaração padrão de um objeto do tipo Scanner
        Scanner ler = new Scanner(System.in);
        Scanner lerAlfa = new Scanner(System.in);
        
        System.out.println("Digite seu nome:");
        String nome = lerAlfa.nextLine();
        
        System.out.println("Digite os minutos de aquecimento:");
        Integer aquecimento = ler.nextInt();
        
        System.out.println("Digite os minutos de aeróbicos (correr, andar, pedalar etc):");
        Integer aerobicos = ler.nextInt();
        
        System.out.println("Digite os minutos de musculação:");
        Integer musculacao = ler.nextInt();
        
        Integer minutos = aquecimento + aerobicos + musculacao;
        
        aquecimento = aquecimento * 12;
        aerobicos = aerobicos * 20;
        musculacao = musculacao * 25;
        
        Integer kg = aquecimento + aerobicos + musculacao;
        
        System.out.println("Olá, "+nome+". Você fez um total de "+minutos+" minutos de exercícios e perdeu cerca de "+kg+" calorias");
      }
}

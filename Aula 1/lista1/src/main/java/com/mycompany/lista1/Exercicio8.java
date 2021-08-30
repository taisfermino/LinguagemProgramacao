package com.mycompany.lista1;

import java.util.Scanner;

/**
 *
 * @author Tais
 */
public class Exercicio8 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Insira o limite de peso do elevador:");
        Double limitePeso = ler.nextDouble();
        
        System.out.println("Insira o limite de pessoas no elevador:");
        Integer limitePessoas = ler.nextInt();
        
        System.out.println("Insira o peso da 1° pessoa:");
        Double Peso1 = ler.nextDouble();
        
        System.out.println("Insira o peso da 2° pessoa:");
        Double Peso2 = ler.nextDouble();
        
        System.out.println("Insira o peso da 3° pessoa:");
        Double Peso3 = ler.nextDouble();
        
        Double pesoTotal = Peso1 + Peso2 + Peso3;
        
        System.out.println("Entraram 3 pessoas no elevador, no qual cabem "
        +limitePessoas+" pessoas. O peso total no elevador é de "
        +pesoTotal+", sendo que ele suporta "+limitePeso);
    }
}

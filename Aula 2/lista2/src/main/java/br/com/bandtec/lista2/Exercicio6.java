package br.com.bandtec.lista2;

import java.util.Scanner;

public class Exercicio6 {
     public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Insira a base");
        Integer base = ler.nextInt();
        
        System.out.println("Insira a expoente");
        Integer expoente = ler.nextInt();
        
        Integer calc = 1;
        Integer i = 0;
        
        while(i < expoente){
            calc = calc * base;
            i++;
     }
         System.out.println(calc);
     }
}


package com.mycompany.lista1;

import java.util.Scanner;
/**
 *
 * @author Tais
 */
public class Exercicio2 {
    public static void main (String[] args){
      Scanner leitor = new Scanner (System.in);
       
        System.out.println("Insira quantos filhos de 0 a 3 anos voce tem:");
        Integer filhos0a3 = leitor.nextInt();
        
        System.out.println("Insira quantos filhos de 4 a 16 anos voce tem:");
        Integer filhos4a16 = leitor.nextInt();
        
        System.out.println("Insira quantos filhos de 17 a 18 anos voce tem:");
        Integer filhos17a18 = leitor.nextInt();
        
        Integer filhos = filhos0a3 + filhos4a16 + filhos17a18;
        
        Double f1 = filhos0a3.doubleValue();
        f1 = f1 * 25.12;
        
        Double f2 = filhos4a16.doubleValue();
        f2 = f2 * 15.88;
        
        Double f3 = filhos4a16.doubleValue();
        f3 = f3 * 12.44;
        
        Double Total = f1 + f2 + f3;
        
        System.out.println("Você tem um total de " + filhos + " filhos e vai receber R$"+Total+" de bolsa");
    }
}

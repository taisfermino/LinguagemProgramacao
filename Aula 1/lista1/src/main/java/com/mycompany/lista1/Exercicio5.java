package com.mycompany.lista1;

import java.util.Scanner;
/**
 *
 * @author Tais
 */
public class Exercicio5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite um salario");
        Double sal = ler.nextDouble();
        
        System.out.println("Digite a porcentagem de imposto");
        Double imp = ler.nextDouble();
        
        Double porc = sal / 100 * imp;
        Double total = sal - porc;
        
        System.out.println("O desconto é de "+porc+" seu salario liquido é de R$"+total);
        }
}

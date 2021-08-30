package com.mycompany.lista1;

import java.util.Scanner;
/**
 *
 * @author Tais
 */
public class Exercicio6 {
        public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite o valor do produto:");
        Double valorU = ler.nextDouble();
        
        System.out.println("Digite a quantidade vendida:");
        Integer quant = ler.nextInt();
        
        System.out.println("Digite o valor pago pelo cliente:");
        Double pago = ler.nextDouble();
        
        Double q = quant.doubleValue();
        
        Double total = valorU * q;
        Double troco = pago - total;
        
        System.out.println("Seu troco será de R$ "+troco);
        }
}

package com.mycompany.lista1;

import java.util.Scanner;

/**
 *
 * @author Tais
 */
public class Exercicio7 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite o salario bruto:");
        Double salBruto = ler.nextDouble();
        
        Double inss = salBruto * 0.10;
        Double ir = salBruto * 0.20;
        
        System.out.println("Digite a condução de ida para o trabalho:");
        Double ida = ler.nextDouble();
        
        Double conducao = ida * 2 * 22;
        
        Double descontos = inss + ir + conducao;
        
        Double salLiq = salBruto - inss - ir - conducao;
        
        System.out.println("Seu salário bruto é R$"+salBruto+", tem um total de R$"+descontos+" em descontos e receberá um líquido de R$"+salLiq);
    }
}

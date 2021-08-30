
package br.com.bandtec.lista2;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Insira o numero que deseja ver a tabuada:");
        Integer numero = ler.nextInt();
        
        for(Integer n = 0; n <= 10; n++){
            Integer resultado = numero * n;
            System.out.println(numero+" X "+n+" = "+resultado);
        }
    }
}

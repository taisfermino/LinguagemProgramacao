
package br.com.bandtec.lista2;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Exercicio2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        Integer soma = 0;
        Integer numero = 1;
        
        for(Integer n = 0; numero != 0; n++){
            System.out.println("Insira um numero");
            Integer num = ler.nextInt();
            numero = num;
            soma = soma + num;
        }
        
        System.out.println(soma);
    }
}


package br.com.bandtec.lista2;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;


public class Exercicio1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Insire um numero de 0 a 10:");
        Integer numero = ler.nextInt();
        
        Integer numeroSorteado = ThreadLocalRandom.current().nextInt(0, 11);
        
        Integer vezes = 0;
        
        for(Integer n=1; numeroSorteado != numero; n++){
            numeroSorteado = ThreadLocalRandom.current().nextInt(0, 11);
            System.out.println(numeroSorteado);
            
            vezes = n;
        }
        
        if(vezes <= 3){
            System.out.println("Voce é MUITO sortudo");
        }
        else if(vezes>=4 && vezes <=10){
            System.out.println("Voce é sortudo");
        }
        else{
            System.out.println("É melhor voce parar de apostar e ir trabalhar");
        }
    }
}

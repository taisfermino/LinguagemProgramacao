
package br.com.bandtec.lista2;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Insira um numero de 1 a 100");
        Integer numero = ler.nextInt();
        
        Integer numeroSorteado = ThreadLocalRandom.current().nextInt(0, 101);
        
        Integer pares = 0;
        Integer impares = 0;
        Integer x = 0;
        
        for(Integer cont = 1; cont <= 200; cont++){
            numeroSorteado = ThreadLocalRandom.current().nextInt(0, 101);
            if(numeroSorteado == numero){
                if(x == 0){
                    x = cont;
                }
            }
            else if (numeroSorteado % 2 == 0){
                pares = pares + 1;
            }
            
            else if (numeroSorteado % 2 != 0){
                impares = impares + 1;
            }
        }
        
        System.out.println("A 1° posição do numero digitado foi "+ x);
        
        System.out.println(pares + " numeros pares foram sorteados.");
        
        System.out.println(impares + " numeros impares foram sorteados.");
    }
}

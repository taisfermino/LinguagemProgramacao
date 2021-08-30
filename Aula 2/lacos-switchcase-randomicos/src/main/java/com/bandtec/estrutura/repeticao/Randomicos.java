package com.bandtec.estrutura.repeticao;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Randomicos {
    
    public static void main(String[] args) {
        
        // Frequentemente vcs encontrarão algo assim na internet
        // Random random = new Random();
        // random.nextInt(10);
        // random.nextDouble();
        // random.nextBoolean();
        
        // Existe a classe Math
        // é um utilitario para fins calculo, arredondamentos e etc
        // Math.random();
        
        Double teste = 2.4;
        
//        Double testeArrendondado = Math.floor(teste);
//        Double testeArrendondado2 = Math.ceil(teste);

        Integer numeroInteiroGerado = 
                ThreadLocalRandom.current().nextInt();
        
        System.out.println("Numero gerado: " + numeroInteiroGerado);
        
        Integer numerao = Integer.MAX_VALUE;
        
        Integer numerinho = Integer.MIN_VALUE;
        
        System.out.println("Numerao:" + numerao);
        System.out.println("Numerinho:" + numerinho);
        
    }
}

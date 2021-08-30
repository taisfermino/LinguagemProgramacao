package com.bandtec.estrutura.repeticao;

import java.util.Scanner;

/**
 *
 * @author miniguiti
 */
public class LacosDeRepeticao {

    public static void main(String[] args) {
        // for convencional 
        // inicialização ; condição ; incremento ou decremento
        System.out.println("Exemplo 01: for convencional");
        for (int i = 0; i < 10; i++) {
            System.out.println(String.format("Contador: %d", i));
        }

        System.out.println("Exemplo 02: percorrer ao contrario");
        for (int i = 10; i > 0; i--) {
            System.out.println(String.format("Contador: %d", i));
        }

        // for(;;){} for infinito
        System.out.println("Exemplo 03: while ");
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite 42: ");
        Integer numeroDigitado = leitor.nextInt();

        while (numeroDigitado != 42) {
            System.out.println("Essa não é a resposta!!!");
            numeroDigitado = leitor.nextInt();
        }
        System.out.println("Agora sim! :)");

        //Quando usar for ou while ?
        //Sei a inicialização, condição e interrupção ? Usar for
        //Sem inicio e incremento ? while (enquanto x faça y)
        System.out.println("Exemplo 04: de 0 - 10 com while");
        Integer contador = 0;
        while (contador < 10) {
            System.out.println(String.format("Contador: %d", contador));
            contador++;
        }

        System.out.println("Exemplo 05: de 10 - 0");
        Integer contador2 = 10;
        while (contador2 > 0) {
            System.out.println(String.format("Contador: %d", contador2));
            contador2--;
        }
        
        
        //DO WHILE 
        Scanner leitor2 = new Scanner(System.in);
        Integer numeroDigitado2;
        System.out.println("Exemplo 06: Até digitar 42 com do - while");
 
        // do while executa e depois pergunta até quando executar
        // já while pergunta antes mesmo de tentar a 1° vez
        do {
            //Qualquer bloco de código pode ser inserido aqui. If, Else, for...
            System.out.println("Digite um número");
            numeroDigitado2 = leitor2.nextInt();
        } while (numeroDigitado2 != 42);

    }
}

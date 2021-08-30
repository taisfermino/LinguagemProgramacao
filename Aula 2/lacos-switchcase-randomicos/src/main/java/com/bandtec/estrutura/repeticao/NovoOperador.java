package com.bandtec.estrutura.repeticao;

import java.util.Scanner;

public class NovoOperador {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        
        /*
            
            A instrução switch nada mais é do que uma maneira elegante de
            de escrever uma condicional.
        
            Recomendamos o uso somente com inteiros, mas é possível 
            utilizar com texto (String).
        */
        
//        System.out.println("Digite um número:");
//        Integer numero = leitor.nextInt();
//
//        switch (numero) {
//            case 1:
//                System.out.println("Domingo");
//                break;
//            case 2:
//                System.out.println("Segunda");
//                break;
//            case 3:
//                System.out.println("Terça");
//                break;
//            case 4:
//                System.out.println("Quarta");
//                break;
//            case 5:
//                System.out.println("Quinta");
//                break;
//            case 6:
//                System.out.println("Sextou");
//                break;
//            case 7:
//                System.out.println("sabádo");
//                break;
//            default:
//                System.out.println("número inválido");
//                break;
//        }

        
        /*
            A instrução break indica uma interrupção durante a condicional,
            ou seja, assim que o software encontra um "break" sai do bloco
            do switch.
        */

        System.out.println("Digite o ranking (1,2 e 3) :");
        Integer ranking = leitor.nextInt();
        
        switch(ranking){
            case 1:
                System.out.println("Ganhou MacBook pro");
            case 2:
                System.out.println("Ganhou um Iphone 12");
            case 3:
                System.out.println("Ganhou uma viagem pra Floripa");
                break;
            default:
                System.out.println("O que vale é participar....");
                break;
        }
        

    }
}

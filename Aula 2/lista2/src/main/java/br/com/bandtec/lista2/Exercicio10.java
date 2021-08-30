package br.com.bandtec.lista2;

import java.util.Scanner;

public class Exercicio10 {
     public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        Integer mussarela = 0;
        Integer calabresa = 0;
        Integer queijo = 0;
        
        for(Integer votos = 1; votos <= 10; votos++){
            System.out.println("Insira o numero da pizza:");
            Integer pizza = ler.nextInt();
            
            if(pizza == 5){
                mussarela++;
            }
            
            else if (pizza == 25){
                calabresa++;
            }
            
            else if (pizza == 50){
                queijo++;
            }
        }
            System.out.println("Votos \n"+"Calabresa: "+calabresa+"\n Mussarela: "+mussarela+"\n Queijo: "+queijo);
            
            if (mussarela > queijo && mussarela > calabresa){
                System.out.println("Calabresa foi o sabor mais votado");
            }
            
            else if (queijo > mussarela && queijo > calabresa){
                System.out.println("Quatro Queijos foi o sabor mais votado");
            }
            
            else{
                System.out.println("Calabresa foi o sabor mais votado");
            }
        
     }
}

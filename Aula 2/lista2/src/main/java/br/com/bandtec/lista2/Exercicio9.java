package br.com.bandtec.lista2;

public class Exercicio9 {
    public static void main(String[] args) {
        
        double teste = 0.15;
        for(double n = 0; teste < 5; n ++){
            System.out.println(String.format("%.2f", teste));
            teste = teste + 0.15;
        }
    }
    }


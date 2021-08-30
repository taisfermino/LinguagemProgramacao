package br.com.bandtec.lista2;

import java.util.Scanner;


public class Exercicio3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        
        String password = "a";
        String login = "b";
        
        while(! login.equals("admin") || ! password.equals("#Bandtec")){
            System.out.println("Insira seu nome");
            String nome = ler.nextLine();
        
            System.out.println("Insira sua senha:");
            String senha = ler.nextLine();
            
            login = nome;
            password = senha;
            
            System.out.println("Login e/ou senha invalida");
        }
        
        System.out.println("Login realizado com sucesso");
        
        
        
    }
}

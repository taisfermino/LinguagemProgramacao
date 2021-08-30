package com.bandtec.estrutura.repeticao;

public class NovaCondicao {

    public static void main(String[] args) {

        String nome = "Diego";
        Boolean professor = true;

//        String isProfessorLabel;
//        
//        Exemplo de utilização do operador ternário
//        String isProfessorLabel = professor ? "Sim" : "Não";
//
//        if (professor) {
//            isProfessorLabel = "SIM";
//        } else {
//            isProfessorLabel = "NÃO";
//        }

        System.out.println(String.format("Nome: %s\nÉ professor: %s",
                nome, (professor ? "Sim" : "Não")));
    }
}

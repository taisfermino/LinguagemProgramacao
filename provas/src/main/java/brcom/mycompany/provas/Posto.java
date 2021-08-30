package brcom.mycompany.provas;

import java.util.Scanner;


public class Posto {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        Double litros = 0.0;
        Double valor = 0.0;
        Integer acao;
        Double quantidade = 0.0;
        Double total;
        Boolean limit = true;
        
        Integer contador = 0;
        
        System.out.println("bem vindo ffrentista! comece cadastrando os dados do posto \n Capacidade de gasolina (litros):");
        litros = leitor.nextDouble();
        
        
        
        System.out.println("valor do litro da gasolina:");
        valor = leitor.nextDouble();
        
        
        
        Double meta = litros * valor;
        Double imposto = meta * 0.15;
        
        System.out.println("capacidade do posto: " + litros);
        System.out.println("valor do litro da gasolina: " + valor);
        
        System.out.println("A meta do posto é faturar R$" + meta + " esse mês! \n lembre-se que 15% (" + imposto +
                ") será destinado aos impostos");
        
        System.out.println("-------------------------------");
        
        while (limit) {
        System.out.println("Escolha os próximos passos:\n1- Abastecer veículo \n2- sair");
        acao = leitor.nextInt();
        
        switch (acao) {
            case 1:
                System.out.println("digite a quantidade de gasolina (litros)");
                quantidade = leitor.nextDouble();
                total = meta - quantidade;
        
        if (quantidade <= litros) {
            for (int i = 0; i < quantidade; i++) {
                contador++;
                System.out.println(String.format("abastecendo: %d litro", contador));
                
                
            } } else {
                 System.out.println("infelizmente não temos a quantidade desejada para abastecimento");
        }
        
                System.out.println(String.format("total abastecido %.2f falta %.2f para a meta", quantidade, total ));
                System.out.println("----------------------------------");
        
                break;
                
            case 2:
                System.out.println("até logo");
                limit = false;
                break;
                
                
            default:
                System.out.println("número inválido");
                break;
                
        }
        
        } 
        
        
        
    }
        

}

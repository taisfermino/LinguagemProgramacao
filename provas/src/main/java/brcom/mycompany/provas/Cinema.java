package brcom.mycompany.provas;


import java.util.Scanner;

public class Cinema {
    
    public static void main(String[] args) {
        
        Double quantCadeiras;
        Double capacidadeMax;
        Double cadeirasDisponiveis;
        
        Integer opcaoMenu;
        
        Integer verificaOpcao;
        
        Integer quantCadeirasCompradas;
        
        Integer contadorIngressos;
        Integer quantIngressos = 0;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Bem-vindo administrador! Primeiro cadastre uma sala do cinema");
        do {     
            System.out.println("\nQuantidade de cadeiras da sala:");
            quantCadeiras = leitor.nextDouble();
            
            if (quantCadeiras <= 0) {
                System.out.println("\nValor inválido, digite novamente:\n");
            }
            
        } while (quantCadeiras <= 0);

        do {            
            System.out.println("\nCapacidade máxima devido a pandemia (%):");
            capacidadeMax = leitor.nextDouble();

            if (capacidadeMax > 100) {
                System.out.println("\nValor inválido, digite novamente!");
            }

        } while (capacidadeMax > 100);


        cadeirasDisponiveis = (quantCadeiras / 100) * capacidadeMax; 

        System.out.println(String.format("A sala possui %.0f ingressos disponíveis!", cadeirasDisponiveis));
        
        do {
            verificaOpcao = 0;
            contadorIngressos = 0;
            
            if (cadeirasDisponiveis >= 1) {
                do {  
                    System.out.println("\nEscolha os próximos passos"
                    + "\n1 - Reservar Ingressos"
                    + "\n2 - Sair");

                    opcaoMenu = leitor.nextInt();

                    switch (opcaoMenu) {
                        case 1:
                            verificaOpcao = 1;
                            break;
                        case 2:
                            verificaOpcao = -1;
                            System.out.println("\nAté logo :D");
                            break;
                        default:
                            verificaOpcao = 0;
                            System.out.println("\nNúmero inválido, tente novamente!");
                            break;
                    }  
                } while (!(verificaOpcao == 1 || verificaOpcao == -1));

                if (verificaOpcao == 1) {
                    System.out.println("\nDigite a quantidade de cadeiras desejadas:");

                    do {                
                        quantCadeirasCompradas = leitor.nextInt();

                        if (quantCadeirasCompradas > cadeirasDisponiveis) {
                            System.out.println(String.format(
                            "\nInfelizmente não temos a quantidade de cadeiras digitadas, "
                            + "quantidade disponível: %.0f"
                            + "\nDigite uma quantidade válida:", cadeirasDisponiveis));
                        }

                        if (quantCadeirasCompradas < 1) {
                            System.out.println("Valor inválido!"
                            + "\nDigite uma quantidade válida:");
                        }
                        

                    } while (quantCadeirasCompradas > cadeirasDisponiveis || quantCadeirasCompradas < 0);

                    System.out.println("\n");
                    
                    while (quantCadeirasCompradas > contadorIngressos) {
                        cadeirasDisponiveis-=1;
                        contadorIngressos+=1;
                        
                        if (quantIngressos == 0) {
                            System.out.println(String.format(
                            "Venda do %d° ingresso registrada, restam %.0f ingressos.",
                            contadorIngressos, cadeirasDisponiveis));
                        } else {  
                            quantIngressos+=1;
                            
                            System.out.println(String.format(
                            "Venda do %d° ingresso registrada, restam %.0f ingressos.",
                            quantIngressos, cadeirasDisponiveis));
                        }
                    }
                    
                    if (quantIngressos == 0) {
                        quantIngressos = contadorIngressos;   
                    }

                    if (quantCadeirasCompradas > 0) {
                        System.out.println(String.format("Você comprou %d ingresso(s), bom filme!", quantCadeirasCompradas));
                    } else {
                        System.out.println(String.format("Você comprou %d ingressos :C", quantCadeirasCompradas));
                    }
                    
                    if (cadeirasDisponiveis == 0) {
                        break;
                    }
                }   
            } else {
                System.out.println("Desculpe, ingressos esgotados! :C");
                break;
            }
           
        } while (verificaOpcao != -1);

    }
    
}
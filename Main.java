import java.util.Scanner;


public class Main {

    public static void catalogo(){
        System.out.println("\n---** Sistema de funcionamento de árvores **---");
        System.out.println("Escolha a sua opcao:");
        System.out.println("1.Adicionar No");
        System.out.println("2. Ordenar Arvore");
        System.out.println("3.Remover No");
        System.out.println("4.Busca de Valor");
        System.out.println("5.Sair\n");
    }
    public static void main(String[] args) {

        //Cria uma nova árvore binária chamando ArvoreBinária.java
        ArvoreBinaria arvore = new ArvoreBinaria();
        Scanner scanner = new Scanner(System.in);

        int escolha = 0;
        do{

            //Chama a função do catálogo e utiliza o switch para escolher a opcao
            catalogo();
            escolha = scanner.nextInt();
            scanner.nextLine();

            switch(escolha){
                
                case 1:
                    System.out.println("\n--Qual o valor a ser adicionado na árvore? --");
                    int add = scanner.nextInt();
                    arvore.inserir(add);
                    System.out.println("Valor " + add + " adicionado com sucesso\n");
                break;

                case 2:
                    System.out.println("Qual será o tipo de ordenação");
                    System.out.println("Para Pré-Ordem: Digite (PRE),\nEm-Ordem: Digite (EM),\nPós-Ordem: Digite (POS)");
                    String ordem = scanner.nextLine();

                    if(ordem.equals("PRE")){
                        System.out.print("Pré-ordem: \n");
                        arvore.preOrdem();
                    } else if (ordem.equals("EM")){
                        System.out.print("Pré-ordem: \n");
                        arvore.emOrdem();
                    } else if (ordem.equals("POS")){
                        System.out.print("Pré-ordem: \n");
                        arvore.posOrdem();
                    } else {
                        System.out.println("Input não reconhecido\n");
                    }
                break;

                case 3:
                    System.out.print("\nDigite um número para remover: ");
                    int valor = scanner.nextInt();
                    arvore.remover(valor);
                break;

                case 4:
                    System.out.print("Digite o valor que deseja buscar na árvore: ");
                    // Supondo que o seu objeto Scanner se chame 'scanner' ou 'leitor'
                    int valorBusca = scanner.nextInt(); 

                    // Chama a função que criamos na classe ArvoreBinaria
                    arvore.buscaNo(valorBusca); 
                break;

                case 5:
                    System.out.println("Fechando o programa. Obrigado por usar!");
                break;

                default:
                    System.out.println("Digite um numero valido...\n");
                break;
            } 
        
        } while(escolha != 5);
    }
}
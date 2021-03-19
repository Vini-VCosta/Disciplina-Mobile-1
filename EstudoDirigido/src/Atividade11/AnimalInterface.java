package Atividade11;

import java.util.Scanner;

/**
 *
 * @author Vinicius Costa
 */
public interface AnimalInterface {
    public static void main(String[] args) {
    
        Scanner vizualizar = new Scanner(System.in);
        
        //Coneções com outras classes
        Cachorro ca = new Cachorro();
        Papagaio pa = new Papagaio();
        Mosca mo = new Mosca();
        
        //Inicio do do while (laço de repetição)
        int especie;
        String cor;
        do{
            System.out.println("\nBem vindo!");
            System.out.println("Escolha uma das nossas opções para prosseguir no sistema");
            System.out.println("1 - Cachorro");
            System.out.println("2 - Papagaio");
            System.out.println("2 - Mosca");
            System.out.println("0 - Sair");
        especie = vizualizar.nextInt();
        //Inicio do switch para mostrar as opções que o usuario escolher
        switch(especie) {
            case 1:
                
                System.out.print("\nDigite a cor do pelo: ");
                vizualizar.nextLine();
                ca.setCorPelo(vizualizar.nextLine());
                
                System.out.print("\nDigite o nome:");
                ca.setNome(vizualizar.nextLine());

                System.out.print("\nDigite a idade");
                ca.setIdade(vizualizar.nextInt());

                System.out.println("\nDados do animal: " + ca+
                                    "\n" + ca.calcularIdade());
            break;
            case 2:
                System.out.print("\nDigite a cor do pelo:");
                vizualizar.nextLine();
                pa.setCorPena(vizualizar.nextLine());
                
                System.out.print("\nDigite o nome: ");
                pa.setNome(vizualizar.nextLine());

                System.out.print("\nDigite a idade");
                pa.setIdade(vizualizar.nextInt());

                System.out.println("\nDados do animal: " + pa+
                                    "\n" + pa.calcularIdade());
                break;
            case 3:
                System.out.print("\nDigite a quantidade de patas");
                vizualizar.nextLine();
                mo.setQtdPatas(vizualizar.nextInt());
                
                System.out.print("\nDigite o nome: ");
                mo.setNome(vizualizar.nextLine());

                System.out.print("\nDigite a idade");
                mo.setIdade(vizualizar.nextInt());

                System.out.println("\nDados do animal: " + pa+
                                    "\n" + pa.calcularIdade());
            break;    
            case 0:
                System.out.println("Fim!!!");
            break;
            default:
                System.out.println("Opção invalida");
            break;
        }
        }while(especie!=0);
        }
}

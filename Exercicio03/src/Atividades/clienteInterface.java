package Atividades;

import java.util.Scanner;

/**
 *
 * @author Vinicius Costa
 */
public interface clienteInterface {
    public static void main(String[] args){
        
        Scanner vizualizar = new Scanner(System.in);
        
        cliente cli = new cliente();
        
        System.out.println("Qual o seu nome? ");
        cli.setNome(vizualizar.nextLine());
        
        System.out.println("\nQual a sua idade? ");
        cli.setIdade(vizualizar.nextInt());
        
        System.out.println("\nQual a sua renda mensal? ");
        cli.setRenda(vizualizar.nextDouble());
        
        System.out.println("\nSeus dados: "+cli.toString()+
                           "\nPossui a maioridade? "+cli.classificarIdade()+
                           "\nPossui condições de comprar algo bem caro? "+cli.classificarRenda());
    }

    
}

package Atividades;

import java.util.Scanner;

/**
 *
 * @author Vinicius Costa
 */
public class InterfaceBiblioteca {

    public static void main(String[] args) {
    
        Scanner vizualizar = new Scanner(System.in);
        
        //Coneções com outras classes
        Livro li = new Livro();   
        Cliente cli = new Cliente();
        
        //Inicio do do while (laço de repetição)
        int num;
        do{
            System.out.println("Bem vindo!");
            System.out.println("Escolha uma das nossas opções para prosseguir no sistema");
            System.out.println("1 - Cadastro de livros");
            System.out.println("2 - Cadastro de clientes");
            System.out.println("0 - Sair");
        num = vizualizar.nextInt();
        switch(num) {
            case 1:
                System.out.println("Cadastros de livros!");
                
                System.out.print("\nDigite o título do livro que você deseja: ");
                vizualizar.nextLine();
                li.setTitulo(vizualizar.nextLine());
                
                System.out.print("\nDigite o autor do livro que você deseja: ");
                li.setAutor(vizualizar.nextLine());

                System.out.print("\nDigite o gênero do livro que você deseja: ");
                li.setGenero(vizualizar.nextLine());

                System.out.print("\nDigite o ano que o livro foi públicado: ");
                li.setAno(vizualizar.nextInt());

                System.out.print("\nDigite quanto custa o livro: ");
                li.setPreco(vizualizar.nextDouble());

                System.out.println("\nDados do livro: " + li+
                                    "\n" + li.verificarDescontoLivro());
                
            break;
            case 2:
                System.out.println("Nome: ");
                vizualizar.nextLine();
                cli.setNome(vizualizar.nextLine());

                System.out.println("\nIdade: ");
                cli.setIdade(vizualizar.nextInt());

                System.out.println("\nRenda mensal:  ");
                cli.setRenda(vizualizar.nextDouble());

                System.out.println("\nDados do cadastrado: "+cli+
                                   "\nPossui a maioridade? "+cli.classificarIdade()+
                                   "\nPossui condições de pagar os nosso produtos? "+cli.classificarRenda());
            break;
            case 0:
                System.out.println("Fim!!!");
            break;
            default:
                System.out.println("Opção invalida");
                break;
        }
        }while(num!=0);
        
        
        
        
    }
    
}

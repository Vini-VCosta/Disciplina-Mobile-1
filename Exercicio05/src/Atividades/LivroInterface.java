/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atividades;

import java.util.Scanner;

/**
 *
 * @author vinid
 */
public interface LivroInterface {
    
    public static void main(String[] args)
    {
        
        Scanner ler = new Scanner(System.in);
        
        Livro li = new Livro();
        
        System.out.println("Bem vindo!");
        
        System.out.print("Digite o título do livro que você deseja: ");
        li.setTitulo(ler.nextLine());
        
        System.out.print("Digite o autor do livro que você deseja: ");
        li.setAutor(ler.nextLine());
        
        System.out.print("Digite o gênero do livro que você deseja: ");
        li.setGenero(ler.nextLine());
        
        System.out.print("Digite o ano que o livro foi públicado: ");
        li.setAno(ler.nextInt());
        
        System.out.print("Digite quanto custa o livro: ");
        li.setPreco(ler.nextDouble());
        
        System.out.println("\nDados do livro: " + li.toString());
        
        System.out.println("\n" + li.verificarDesconto());
        
    } 
    
}

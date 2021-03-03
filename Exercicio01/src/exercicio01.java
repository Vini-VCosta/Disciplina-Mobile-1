
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vinicius Costa
 */
public class exercicio01 {

    double n1, n2, n3;
    
    String nome;
        
    static Scanner interacao = new Scanner(System.in);
 
    public static void main(String[] args) {
    
        System.out.println("Boletim de Notas\n");
        
        System.out.println("Qual o seu nome?  ");
        String nome = interacao.nextLine();
        
        System.out.println("Digite a sua n1: ");
        double n1 = interacao.nextDouble();
        
        System.out.println("Digite a sua n2: ");
        double n2 = interacao.nextDouble();
        
        System.out.println("Digite a sua n3: ");
        double n3 = interacao.nextDouble();
     
        System.out.println("Sua média é: "+ ((n1+n2+n3)/3));
    }
    
}

package Atividades;

import java.util.Scanner;

/**
 *
 * @author Vinicius Costa
 */
public class exercicio3 {
    public static void main(String[]args){
        
        double n;
        
        Scanner vizualizar = new Scanner(System.in);
        
                System.out.print("Digite um numero e com meus poderes descobrirei se ele é Par ou Impar: ");
                n = vizualizar.nextDouble();
                
                double resto = (n % 2);
                
                if(n == 0){
                    System.out.println("Seu safadinho, Zero não é nem par nem impar!!!!");
                }else if(resto == 0){
                    System.out.println("Deixe me ver.......");
                    System.out.println("Esse numero é par!");
                }else{
                    System.out.println("Deixe me ver.......");
                    System.out.println("Esse numero é impar!");
                }

    }
}

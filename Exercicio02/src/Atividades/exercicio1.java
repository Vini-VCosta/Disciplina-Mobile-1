package Atividades;

import java.util.Scanner;

/**
 *
 * @author Vinicius Costa
 */
public class exercicio1 {
    public static void main(String[] args){
        
        double n;
        
        Scanner visualizar = new Scanner(System.in);
        
        System.out.print("Digite um numero e com meus poderes descobrirei se ele é negativo ou positivo: ");
        n = visualizar.nextDouble();
        
        if(n < 0){
            System.out.println("Esse numero é negativo!!!!");
        }else if(n == 0){
            System.out.println("Esse numero não é nem negativo nem positivo, seu espertinho!!!!");
        }else{
            System.out.println("Esse numero é positivo!!!!");
        }
    }
}

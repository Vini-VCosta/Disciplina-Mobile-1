package Atividades;

import java.util.Scanner;

/**
 *
 * @author Vinicius Costa
 */
public class exercicio4 {
    public static void main(String[] args){
        
        double n1,n2;
        
        Scanner vizualizar = new Scanner(System.in);
        
        System.out.println("Digite dois numeros e direi quem pe maior (Não tente me enganar!!!!)");
        
        System.out.print("\nDigite o primeiro numero aqui: ");
        n1 = vizualizar.nextDouble();
        
        System.out.print("\nDigite o segundo numero aqui: ");
        n2 = vizualizar.nextDouble();
        
        if(n1 == n2){
            System.out.println("\nAmbos são o mesmo nuemro seu safadinho!!!!");
        }else if(n1 < n2){
            System.out.println("\nE o numero que é maior é o seu segundo numero que é: "+n2);
        }else{
            System.out.println("\nE o numero que é maior é o seu primeiro numero que é: "+n1);
        }
    }
    
}

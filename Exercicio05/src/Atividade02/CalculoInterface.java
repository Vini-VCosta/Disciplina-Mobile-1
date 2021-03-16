package Atividade02;

import java.util.Scanner;

/**
 *
 * @author Vinicius Costa
 */
public interface CalculoInterface {
    public static void main(String[] args) 
    {
        
        Scanner ler = new Scanner(System.in);
        
        double n, soma = 0;
        
        do
        {
            System.out.println("Digite quantos numeros quiser, vamos somar todos até que você digite 0: ");
            n = ler.nextDouble();
           
            soma += n;
                    
        }
        
        while(n != 0);
        
        System.out.println("Soma do valores: " + soma);
       
        
    }
}

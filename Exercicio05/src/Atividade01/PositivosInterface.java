package Atividade01;

import java.util.Scanner;

/**
 *
 * @author Vinicius Costa
 */
public interface PositivosInterface {
     public static void main(String[] args)
    {
    
        Scanner ler = new Scanner(System.in);
    
        double n, soma = 0;
        int quant = 0;
    
    
        do{        
            System.out.println("Digite quantos numeros quiser, vamos somar todos até que você digite um numero negativo: ");
            n = ler.nextDouble();
        
            if (n > 0)
            {
                soma = n + soma;
                quant++;
            }
        
        }while(n >= 0);
        {
            System.out.println("A soma dos números é: " + soma);
        
            System.out.println("A quantidade dos números é: " + quant);
        
            System.out.println("A média dos números é: " + soma / quant);
        }
    }
}

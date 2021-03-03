
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vinid
 */
public class exercicio02 {
    
    double raio;
    
    static Scanner interacao = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        System.out.println("Digite o valor do raio: ");
        double raio = interacao.nextDouble();
        
        System.out.println("O diametro é: "+(raio*2));
       
        System.out.println("E 1 quadrante é: "+((raio*2)/4));
    }
    
}

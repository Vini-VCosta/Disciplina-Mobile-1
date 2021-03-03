
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
public class exercicio03 {
    double a;
    
    static Scanner interacao = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        System.out.println("Digite um numero: ");
        double a = interacao.nextDouble();
        
        System.out.println("O dobro do numero: "+(a*2));
       
        System.out.println("O triplo do dobro do numero: "+((a*2)*3));
        
        System.out.println("A metade do triplo do dobro do numero: "+(((a*2)*3)/2));
        
        System.out.println("O quadrado do numero: "+(Math.pow(a,4)));
        
        System.out.println("A quinta parte do dobro do numero: "+(a*2)/5);
    }
}

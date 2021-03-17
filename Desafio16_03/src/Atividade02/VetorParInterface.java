/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atividade02;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Vinicius Costa
 */
public interface VetorParInterface {
    public static void main(String[] args) {
        
        //Array
        int[] n = new int[20];
        
        //Variaveis
        int par=0, impar=0;

         for (int i = 0; i < n.length; i++) {
          n[i] = i+1;
        //Divizor em Par e Impar
         if(n[i]%2 ==0){
           par++;
         }else{
         impar++;
         }
        }
         //Impressão na tela
         Arrays.toString(n);
         System.out.println(Arrays.toString(n));

         System.out.println("Quantidade de impares: " + impar);
         System.out.println("Quantidade de pares: " + par);
    
  }
}

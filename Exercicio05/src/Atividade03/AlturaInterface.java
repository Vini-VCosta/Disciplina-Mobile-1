/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atividade03;

/**
 *
 * @author Vinicius Costa
 */
public interface AlturaInterface {
    public static void main(String[] args)
    {
        //m1 (mariazinha)
        //m2 (maricota)
        double m1 = 150;
        double m2 = 110;
        int ano = 0;
        
        while (m1 >= m2)
        {
            m1 = m1 + 2;
            m2 = m1 + 3;
            ano = ano + 1;
        }    
      
        System.out.println("A Maricota vai passar a Mariazinha daqui a exatos " + ano + " ano (s).");
    }
}

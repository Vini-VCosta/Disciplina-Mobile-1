/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atividade04;

import java.util.Scanner;

/**
 *
 * @author vinid
 */
public interface MedidaInterface {
    public static void main(String[] args) {

        double MassaInicial = 0;
        double MassaFinal = 0;
        int Segundos = 0;
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe a massa inicial em gramas.");
        MassaInicial = ler.nextDouble();
        MassaFinal = MassaInicial;

        while (MassaFinal > 0.5) {
            MassaFinal /= 2;
            Segundos += 50;
        }

        System.out.printf("Massa Inicial: %.2f\n", MassaInicial);
        System.out.printf("Massa Final..: %.4f\n", MassaFinal);
        System.out.println("Tempo Total.: " + FormataSegundos(Segundos));
    }

    private static String FormataSegundos(int seg) {
        int Hora, Minuto, Segundos;
        Hora = (int) (seg / (60 * 60));
        Minuto = (int) ((seg - (Hora * 60 * 60)) / 60);
        Segundos = (int) (seg - (Hora * 60 * 60) - (Minuto * 60));
        return String.format("%02d:%02d:%02d", Hora, Minuto, Segundos);
    }
}

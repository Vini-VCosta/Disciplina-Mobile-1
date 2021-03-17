package Atividade01;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Vinicius Costa
 */
public interface VetorInterface {
    public static void main(String[] args) {
        
    Scanner vizualizar = new Scanner(System.in);
    ArrayList<Integer> nums = new ArrayList<>();
    
    int numDig, num, quan = 0 , soma = 0;

    byte opcao;

    do {
       
      System.out.print("\nBem Vindo                                             \n"
              + "1  -  Adicionar numeros                                      \n"
              + "2  -  Consultar numero escolhido                             \n"
              + "0  -  Sair                                                   \n"
              + "Digite aqui: ");

      opcao = vizualizar.nextByte();

      switch (opcao) {
        case 1:
          System.out.print("\nDigite um número: ");
          num = vizualizar.nextInt();
          nums.add(num);
          break;
        case 2:
          System.out.print("\nDigite um número que deseja consultar: ");
          numDig = vizualizar.nextInt();
          for (int i = 0; i < nums.size(); i++) {
            if( nums.get(i).equals(numDig)){
              quan = quan + 1;
              
              soma = nums.get(i)+ nums.get(i);
            }
          }
          System.out.println("\nQuantidade: "+ quan);
          System.out.println("Soma: "+ soma);

          break;
     

        default:
          System.out.println("\nOpção inválida\n"
                  + "Digite novamente\n");
      }

    } while (opcao > 0);

  }
}

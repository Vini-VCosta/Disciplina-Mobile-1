/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atividade05;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author vinid
 */
public interface ListaInterface {
    public static void main(String[] args) 
    {
        //Criando ArrayList
        ArrayList<String> compras = new ArrayList <String>();
        //Itens da lista de compras
        compras.add("Arroz");
        compras.add("Atum");
        compras.add("Batata");
        compras.add("Bolacha");
        compras.add("Chocolate");
        compras.add("Pastel");
        //mensagem de entrada
        System.out.println("Bem Vindo ao nosso mercado!");
        //Catálogo em ordem alfabética
        Collections.sort(compras);
        System.out.println("Os nossos itens em ordem alfabética:"+ compras);
        //conferir indice 0
        System.out.println("O indice 0 possui: "+ compras.get(0));
        //alterar indice 0
        compras.set (0,"feijão");
        System.out.println("O indice 0 agora possui: "+ compras.get(0));
        //exibir tamanho da lista
        System.out.println("O tamanho da lista é: "+ compras.size());
        //remover indice 0
        System.out.println("Removendo indice 0 da lista de compras: "+ compras.remove(0));
        System.out.println("Sua lista possui: "+ compras.size());
        //limpar lista de compras
        compras.clear();
        System.out.println("Sua lista está vazia, ela possui "+ compras.size()+" itens");
    }
}

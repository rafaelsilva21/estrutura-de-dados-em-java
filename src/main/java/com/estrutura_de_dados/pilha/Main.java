package com.estrutura_de_dados.pilha;

import com.estrutura_de_dados.Nodo;

public class Main {
    public static void main(String[] args) {

        Pilha<Integer> pilha = new Pilha<>();

        pilha.push(1);
        pilha.push(2);
        pilha.push(3);
        pilha.push(4);
        pilha.push(5);
        pilha.push(6);

        System.out.println(pilha);
        System.out.println(pilha.top());
        System.out.println(pilha);
        System.out.println(pilha.pop());
        pilha.push(99);
        System.out.println(pilha);

    }
}
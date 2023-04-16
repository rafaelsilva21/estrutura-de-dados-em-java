package com.estrutura_de_dados.pilha;

import com.estrutura_de_dados.Nodo;

public class Main {
    public static void main(String[] args) {

        Pilha<Integer> pilha = new Pilha<>();

        pilha.push(new Nodo(1));
        pilha.push(new Nodo(2));
        pilha.push(new Nodo(3));
        pilha.push(new Nodo(4));
        pilha.push(new Nodo(5));
        pilha.push(new Nodo(6));

        System.out.println(pilha);
        System.out.println(pilha.top());
        System.out.println(pilha);
        System.out.println(pilha.pop());
        pilha.push(new Nodo(99));
        System.out.println(pilha);

    }
}
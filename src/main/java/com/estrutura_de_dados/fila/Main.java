package com.estrutura_de_dados.fila;

import com.estrutura_de_dados.Nodo;

public class Main {
    public static void main(String[] args) {

        Fila<Integer> fila = new Fila<>();

        fila.enqueue(new Nodo("primeiro"));
        fila.enqueue(new Nodo("segundo"));
        fila.enqueue(new Nodo("terceiro"));
        fila.enqueue(new Nodo("quarto"));

        System.out.println(fila);

        System.out.println(fila.dequeue());

        System.out.println(fila);

        fila.enqueue(new Nodo("ultimo"));

        System.out.println(fila);

        System.out.println(fila.first());

        System.out.println(fila);
    }
}

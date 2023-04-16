package com.estrutura_de_dados;

public class Nodo<T> {

    private T dado;
    private Nodo<T> nextNodo;

    public Nodo(T dado) {
        this.dado = dado;
    }

    public T getDado() {
        return this.dado;
    }

    public void setDado(T dado) {
        this.dado = dado;
    }

    public Nodo<T> getNextNodo() {
        return this.nextNodo;
    }

    public void setNextNodo(Nodo<T> nextNodo) {
        this.nextNodo = nextNodo;
    }

    @Override
    public String toString() {
        return "Nodo{dado=" + this.dado + "}";
    }
}

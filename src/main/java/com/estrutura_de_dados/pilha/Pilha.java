package com.estrutura_de_dados.pilha;

import com.estrutura_de_dados.Nodo;

public class Pilha<T> {

    private Nodo<T> topo;

    public Pilha() {
        this.topo = null;
    }

    public T top(){
        return this.topo.getDado();
    }

    public T pop(){
        if (!isEmpty()) {
            Nodo<T> nodoAux = this.topo;
            this.topo = this.topo.getNextNodo();
            return nodoAux.getDado();
        }
        return null;
    }

    public void push(T novoDado) {
        Nodo<T> nodoAux = new Nodo<>(novoDado);
        nodoAux.setNextNodo(this.topo);
        this.topo = nodoAux;
    }

    public boolean isEmpty() {
        return this.topo == null;
    }

    @Override
    public String toString() {
        String stringReturn = "---------------\n";
        stringReturn += "     Pilha\n";
        stringReturn += "---------------\n";

        Nodo<T> nodoAux = this.topo;

        while (nodoAux != null) {
                stringReturn += nodoAux.toString()+"\n";
                nodoAux = nodoAux.getNextNodo();
        }

        stringReturn += "===============\n";
        return stringReturn;
    }
}

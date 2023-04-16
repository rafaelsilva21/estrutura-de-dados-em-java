package com.estrutura_de_dados.pilha;

import com.estrutura_de_dados.Nodo;

public class Pilha<T> {

    private Nodo<T> topo;

    public Pilha() {
        this.topo = null;
    }

    public Pilha(Nodo<T> topo) {
        this.topo = topo;
    }

    public Nodo<T> top(){
        return this.topo;
    }

    public Nodo<T> pop(){
        if (!isEmpty()) {
            Nodo<T> nodoAux = this.topo;
            this.topo = this.topo.getNextNodo();
            return nodoAux;
        }
        return null;
    }

    public void push(Nodo<T> novoNodo) {
        novoNodo.setNextNodo(this.topo);
        this.topo = novoNodo;
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

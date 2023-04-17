package com.estrutura_de_dados.fila;

import com.estrutura_de_dados.Nodo;

public class Fila<T> {

    private Nodo<T> nodoFinal;

    public Fila(){
        this.nodoFinal = null;
    }

    public void enqueue(T novoDado){
        Nodo<T> nodoAux = new Nodo<>(novoDado);
        nodoAux.setNextNodo(this.nodoFinal);
        this.nodoFinal = nodoAux;
    }

    public T first() {
        if (!this.isEmpty()){
            Nodo<T> nodoAux = this.nodoFinal;
            while (nodoAux.getNextNodo() != null) {
                nodoAux = nodoAux.getNextNodo();
            }
            return nodoAux.getDado();
        }
        return null;
    }

    public T dequeue() {
        if (!this.isEmpty()){
            Nodo<T> nodoAux = this.nodoFinal;
            Nodo<T> nodoAnterior = null;
            while (nodoAux.getNextNodo() != null) {
                nodoAnterior = nodoAux;
                nodoAux = nodoAux.getNextNodo();
            }
            if (nodoAnterior == null) this.nodoFinal = null;
            else nodoAnterior.setNextNodo(null);
            return nodoAux.getDado();
        }
        return null;
    }

    public boolean isEmpty(){
        return nodoFinal == null;
    }

    @Override
    public String toString() {
        String stringReturn = "---------------\n";
        stringReturn += "     Fila\n";
        stringReturn += "---------------\n";

        Nodo<T> nodoAux = this.nodoFinal;

        while (nodoAux != null) {
            stringReturn += nodoAux.toString()+"--->";
            nodoAux = nodoAux.getNextNodo();
        }
        stringReturn += "null\n===============\n";
        return stringReturn;
    }
}

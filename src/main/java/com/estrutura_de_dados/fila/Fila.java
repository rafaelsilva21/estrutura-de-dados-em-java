package com.estrutura_de_dados.fila;

import com.estrutura_de_dados.Node;

public class Fila<T> {

    private Node<T> finalNode;

    public Fila(){
        this.finalNode = null;
    }

    public void enqueue(T novoDado){
        Node<T> auxNode = new Node<>(novoDado);
        auxNode.setNextNode(this.finalNode);
        this.finalNode = auxNode;
    }

    public T first() {
        if (!this.isEmpty()){
            Node<T> auxNode = this.finalNode;
            while (auxNode.getNextNode() != null) {
                auxNode = auxNode.getNextNode();
            }
            return auxNode.getDado();
        }
        return null;
    }

    public T dequeue() {
        if (!this.isEmpty()){
            Node<T> auxNode = this.finalNode;
            Node<T> nodoAnterior = null;
            while (auxNode.getNextNode() != null) {
                nodoAnterior = auxNode;
                auxNode = auxNode.getNextNode();
            }
            if (nodoAnterior == null) this.finalNode = null;
            else nodoAnterior.setNextNode(null);
            return auxNode.getDado();
        }
        return null;
    }

    public boolean isEmpty(){
        return this.finalNode == null;
    }

    @Override
    public String toString() {
        String strReturn = "---------------\n";
        strReturn += "     Fila\n";
        strReturn += "---------------\n";

        Node<T> auxNode = this.finalNode;

        while (auxNode != null) {
            strReturn += auxNode.toString()+"--->";
            auxNode = auxNode.getNextNode();
        }
        strReturn += "null\n===============\n";
        return strReturn;
    }
}

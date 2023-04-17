package com.estrutura_de_dados.pilha;

import com.estrutura_de_dados.Node;

public class Pilha<T> {

    private Node<T> topo;

    public Pilha() {
        this.topo = null;
    }

    public T top(){
        return this.topo.getDado();
    }

    public T pop(){
        if (!isEmpty()) {
            Node<T> auxNode = this.topo;
            this.topo = this.topo.getNextNode();
            return auxNode.getDado();
        }
        return null;
    }

    public void push(T novoDado) {
        Node<T> auxNode = new Node<>(novoDado);
        auxNode.setNextNode(this.topo);
        this.topo = auxNode;
    }

    public boolean isEmpty() {
        return this.topo == null;
    }

    @Override
    public String toString() {
        String strReturn = "---------------\n";
        strReturn += "     Pilha\n";
        strReturn += "---------------\n";

        Node<T> auxNode = this.topo;

        while (auxNode != null) {
            strReturn += auxNode.toString()+"\n";
            auxNode = auxNode.getNextNode();
        }

        strReturn += "===============\n";
        return strReturn;
    }
}

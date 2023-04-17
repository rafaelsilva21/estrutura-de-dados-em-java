package com.estrutura_de_dados;

public class Node<T> {

    private T dado;
    private Node<T> nextNode;

    public Node(T dado) {
        this.dado = dado;
        this.nextNode = null;
    }

    public T getDado() {
        return this.dado;
    }

    public void setDado(T dado) {
        this.dado = dado;
    }

    public Node<T> getNextNode() {
        return this.nextNode;
    }

    public void setNextNode(Node<T> nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public String toString() {
        return "Node{dado=" + this.dado + "}";
    }
}

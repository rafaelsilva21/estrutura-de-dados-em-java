package com.estrutura_de_dados.lista_encadeada;

import com.estrutura_de_dados.Node;

public class ListaEncadeada<T> {

    private Node<T> inicialNode;

    public ListaEncadeada() {
        this.inicialNode = null;
    }

    public void add(T dado){
        if(this.isEmpty()) this.inicialNode = new Node(dado);
        else {
            Node<T> auxNode = this.inicialNode;
            while(auxNode.getNextNode() != null) auxNode = auxNode.getNextNode();
            auxNode.setNextNode(new Node(dado));
        }
    }

    public T get(int index){
        return getNode(index).getDado();
    }

    private Node<T> getNode(int index){
        validaIndice(index);
        Node<T> auxNode = this.inicialNode;
        for(int i = 0; i < index; i++) auxNode = auxNode.getNextNode();
        return auxNode;
    }

    public void remove(int index){
        validaIndice(index);
        Node<T> auxNode = getNode(index);
        if(index == 0) this.inicialNode = auxNode.getNextNode();
        else getNode(index - 1).setNextNode(auxNode.getNextNode());
    }

    public int size() {
        int count = 0;
        Node<T> auxNode = this.inicialNode;

        while (auxNode != null) {
            count++;
            auxNode = auxNode.getNextNode();
        }
        return count;
    }

    public boolean isEmpty() {
        return this.inicialNode == null;
    }

    private void validaIndice(int index){
        if(index >= size()) throw new IndexOutOfBoundsException("ERROR! Não existe conteúdo no índice "
                    + index + " desta lista.");
    }

    @Override
    public String toString() {
        String strReturn = "---------------\n";
        strReturn += "  Lista Encadeada\n";
        strReturn += "---------------\n";

        Node<T> auxNode = this.inicialNode;
        while (auxNode != null) {
            strReturn += auxNode.toString()+"--->";
            auxNode = auxNode.getNextNode();
        }
        strReturn += "null\n===============\n";
        return strReturn;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

/**
 *
 * @author Brandon velasquez
 * @param <T>
 */
public class DoublyLinkedList<T extends Number & Comparable> implements Ilist<T> {

    private DoubleNode<T> head;
    private DoubleNode<T> tail;

    public DoublyLinkedList() {
        head = tail = null;
    }

    //agregar datos al inicio
    @Override
    public void add(T d) {

        if (isEmpty()) {
            head = tail = new DoubleNode<>(d);
        } else {
            head = new DoubleNode<>(d, null, head);
            head.getNextNode().setPreviousNode(head);
        }

    }

    @Override
    public void addLast(T d) {
        if (isEmpty()) {
            head = tail = new DoubleNode<>(d);
        } else {
            tail = new DoubleNode<>(d, tail, null);
            tail.getPreviousNode().setNextNode(tail);
        }
    }

//  insertar nuevos nodos ordenados de mayor a menor e impedir datos
//  duplicados (si el dato ya se encuentra en la lista,
//  no ingresarlo y lanzar excepción).
    @Override
    public void addOrdered(T d)  {

        if (isEmpty() || d.compareTo(head.getData()) == 1) {
            add(d);
            return;
        }
        if (!searchData(d)) {
            if (d.compareTo(tail.getData()) == -1) {
                addLast(d);
                return;
            }

            DoubleNode<T> current = head.getNextNode();
            DoubleNode<T> newNode;

            while (current.getData().compareTo(d) == -1) {
                current = current.getNextNode();
            }

            newNode = new DoubleNode<>(d, current.getPreviousNode(), current);
            current.getPreviousNode().setNextNode(newNode);
            current.setPreviousNode(newNode);
        }
        else{
            System.out.println("Ya existe este dato");
        }

    }

    @Override
    /**
     * Borrar el primer nodo
     */
    public void delete() throws Exception {
        if (isEmpty()) {
            throw new Exception("Lista ya esta vacía");
        } else if (head == tail) {
            head = tail = null;
        } else {
            head.getNextNode().setPreviousNode(null);
            head = head.getNextNode();
        }
    }
//    Eliminar un nodo con un dato específico ingresado por el usuario.
    public String deleteNode(T d){
        DoubleNode<T> current = this.head;
        if(current.getData() == d){
            current.getNextNode().setPreviousNode(null);
            this.head=current.getNextNode();
            current.setNextNode(null);
            return "Borrado";
        }
        else if(d==this.tail.getData()){
            current = this.tail;
            current.getPreviousNode().setNextNode(null);
            current.setPreviousNode(null);
            return "Borrado";
        }
        while (current != null) {
            if (current.getData() == d) {
                current.getPreviousNode().setNextNode(current.getNextNode());
                current.getNextNode().setPreviousNode(current.getPreviousNode());
                current.setNextNode(null);
                current.setPreviousNode(null);
                return "Borrado";
            }
            current = current.getNextNode();
        }
        return "Dato no encontrado";
    }

    @Override
    public void deleteLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Lista ya esta vacía");
        } else if (head == tail) {
            head = tail = null;
        } else {
            tail.getPreviousNode().setNextNode(null);
            tail = tail.getPreviousNode();
        }
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public String showData() {
        String data = "";
        DoubleNode<T> current = this.head;
        while (current != null) {
            data = data + current.getData() + " ";
            current = current.getNextNode();
        }
        return data;
    }

    public String showDataReverse() {
        String data = "";
        DoubleNode<T> current = this.tail;
        while (current != null) {
            data += current.getData() + " ";
            current = current.getPreviousNode();
        }
        return data;
    }

    //Determinar si un dato ingresado por el usuario existe en la lista.
    public boolean searchData(T d) {

        DoubleNode<T> current = this.head;

        while (current != null) {
            if (current.getData() == d) {
                return true;
            }
            current = current.getNextNode();
        }

        return false;
    }
    //Insertar nuevos nodos después de un dato especificado por el usuario
    //(si no se encuentra el dato, lanzar excepción).
    public void addNode(T afterOf, T d){
        DoubleNode<T> current = this.head;
        boolean a=false;
        while (current != null) {
            if (current.getData() == afterOf) {
                DoubleNode<T> newNode = new DoubleNode<>(d,current,current.getNextNode());
                current.getNextNode().setPreviousNode(newNode);
                current.setNextNode(newNode);
                a=true;
                break;
            }
            current = current.getNextNode();
        }
        if(!a){
            System.out.println("No se encuentra ese dato");
        }
    }

}

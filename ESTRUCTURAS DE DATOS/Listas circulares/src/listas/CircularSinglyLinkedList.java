/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

/**
 *
 * @author Brandon Velásquez
 * @param <T>
 */
public class CircularSinglyLinkedList<T extends Comparable> implements Ilist<T> {

    Node<T> head;
    Node<T> tail;

    public CircularSinglyLinkedList() {
        head = tail = null;
    }

    private Node<T> addNode(T d) {
        Node<T> newNode = new Node<>(d);
        if (isEmpty()) {
            head = tail = newNode;
            newNode.setNextNode(newNode);
        } else {
            newNode.setNextNode(head);
            tail.setNextNode(newNode);
        }
        return newNode;
    }

    @Override
    public void add(T d) {
        head = addNode(d);
    }

    @Override
    public void addLast(T d) {
        tail = addNode(d);
    }

    @Override
    public void addOrdered(T d) {
        if(isEmpty() || d.compareTo(head.getData())==1)add(d);
        else if(exist(d)!=null)System.out.println("Ya existe ese dato");
        else{
            Node<T> current = this.head;
            while(d.compareTo(current.getNextNode().getData()) == -1 && current.getNextNode()!=head){
                current=current.getNextNode();
            }
            if(current==tail)addLast(d);
            else {
                Node<T> newNode = new Node<>(d);
                newNode.setNextNode(current.getNextNode());
                current.setNextNode(newNode);
            }
        }
    }
    
    public Node<T> exist(T d){
        if(isEmpty()){
            System.out.println("No existen datos");
            return null;
        }
        else{
            Node<T> current = this.head;
            while(current.getNextNode()!=head){
                if(d.compareTo(current.getData())==0)return current;
                current=current.getNextNode();
            }
            return null;
        }
    }
    
    public CircularSinglyLinkedList<T> joinList(CircularSinglyLinkedList<T> lista){
        CircularSinglyLinkedList<T> listaNueva=this;
        listaNueva.tail.setNextNode(lista.head);
        lista.tail.setNextNode(listaNueva.head);
        listaNueva.tail=lista.tail;
        return listaNueva;
    }
    
    public String SpecificNode(T d)throws Exception {
        if (isEmpty())throw new Exception("No existen datos por borrar...");
        else{
            Node<T> current = exist(d);
            if(current==null)return "this don´t exist date";
            else if(current==head)return showData();
            else{
                StringBuilder sb = new StringBuilder();
                while(current!= head){
                    sb.append(current.getData()).append(" ");
                    current = current.getNextNode();
                }
                return sb.toString();
            }
        }
    }
    @Override
    public void delete() throws Exception {
         if (isEmpty()) {
            throw new Exception("No existen datos por borrar...");
        } else if (head == tail) {
            head = null;
        } else {
            tail.setNextNode(head.getNextNode());
            head = head.getNextNode();
        }
    }

    @Override
    public void deleteLast() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public String showData() {
        String data = "";
        Node<T> current = this.head;
        do{
            data = data + current.getData() + " ";
            current = current.getNextNode();
        }while (current != head);
        return data;
    }
}

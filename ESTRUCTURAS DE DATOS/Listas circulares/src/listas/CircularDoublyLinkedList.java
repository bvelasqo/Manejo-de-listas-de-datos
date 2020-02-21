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
public class CircularDoublyLinkedList<T extends Comparable> implements Ilist<T> {

    DoubleNode<T> head;

    public CircularDoublyLinkedList() {
        head = null;
    }

    @Override
    public void add(T d) {
        DoubleNode<T> newNode = new DoubleNode<>(d);
        if (isEmpty()) {
            head = newNode;
            newNode.setNextNode(newNode);
            newNode.setPreviousNode(newNode);
        } else {
            newNode.setPreviousNode(head.getPreviousNode());
            newNode.setNextNode(head);
            head.setPreviousNode(newNode);
            head = newNode;
            head.getPreviousNode().setNextNode(head);

        }
    }

    @Override
    public void addLast(T d) {
        DoubleNode<T> newNode = new DoubleNode<>(d);
        if (isEmpty()) {
            head = newNode;
            newNode.setNextNode(newNode);
            newNode.setPreviousNode(newNode);
        } else {
            newNode.setPreviousNode(head.getPreviousNode());
            newNode.setNextNode(head);
            head.getPreviousNode().setNextNode(newNode);
            head.setPreviousNode(newNode);

        }
    }

    @Override
    public void addOrdered(T d) {
        try{
        if(isEmpty() || d.compareTo(head.getData())==-1)add(d);
        else if(Exist(d)!= null)System.out.println("Ya existe ese dato");
        else{
            DoubleNode<T> current = this.head;
            while(d.compareTo(current.getNextNode().getData()) == 1 && current.getNextNode()!=head){
                current=current.getNextNode();
            }
            if(current==head.getPreviousNode())addLast(d);
            else {
                DoubleNode<T> newNode = new DoubleNode<>(d,current,current.getNextNode());
                current.getNextNode().setPreviousNode(newNode);
                current.setNextNode(newNode);
            }
        }
        }
        catch(Exception e){}
    }

    @Override
    public void delete() throws Exception {
        if (isEmpty())throw new Exception("No existen datos por borrar...");
        else if (head == head.getPreviousNode()) {
            head = null;
        } else {
            head.getNextNode().setPreviousNode(head.getPreviousNode());
            head.getPreviousNode().setNextNode(head.getNextNode());
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

    public DoubleNode<T> Exist(T d) throws Exception{
        if(isEmpty())throw new Exception("don´t exist dates");
        else{
            DoubleNode<T> current = this.head;
            while(current.getNextNode()!=head){
                if(current.getData().compareTo(d)==0) return current;
                current = current.getNextNode();
            }
            return null;
        }
    }

    public CircularDoublyLinkedList<T> DivideList(T d){
        try
        {
            DoubleNode<T> current = Exist(d);
            if (current==null)System.out.println("No existe ese dato");
            else{
                CircularDoublyLinkedList<T> newList = new CircularDoublyLinkedList<>();
                while(current!= head){
                    newList.addLast(current.getData());
                    current = current.getNextNode();
                }
                return newList;
            }
        }
        catch(Exception e){System.out.println(e);}
        return null;
    }
    @Override
    public String showData() {
        String data = "";
        DoubleNode<T> current = this.head;
        do {
            data = data + current.getData() + " ";
            current = current.getNextNode();
        } while (current != head);
        return data;
    }

}

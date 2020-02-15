/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

/**
 *
 * @author Brandon Velasquez Osorio
 * @param <T> dato generico
 */
public class SinglyLinkedList<T extends Number & Comparable> implements Ilist<T> {

    public Node<T> head;
    private int x;
    public int cantidad = 0;
    public int cont=0;

    public SinglyLinkedList() {
        this.head = null;
    }
    @Override
    public void add(T d) {

        Node<T> newNode = new Node<>(d);
        newNode.setNextNode(this.head);
        this.head = newNode;
        cantidad++;
        
    }
    // 8.Insertar nuevos nodos ordenados de mayor a menor e impedir datos
    // duplicados (si el dato ya se encuentra en la lista, no ingresarlo 
    // y lanzar excepción).
    @Override
    public void addOrderedMajor(T d) {
        boolean a=true;
        Node<T> newNode = new Node<>(d);
        if (isEmpty() || d.compareTo(this.head.getData()) > 0) {
           if(this.head!=null)
           {
                if(d==this.head.getData()){ 
                    a=false;
                }
                if(a){
                    newNode.setNextNode(this.head);
                    this.head = newNode;
                    cantidad++;
                }
                else {
                    System.out.println("Ya existe ese dato");}
           }
           else {
               newNode.setNextNode(this.head);
               this.head = newNode;
               cantidad++;
           }
        } else {
            
            Node<T> current = this.head;//
            while (current.getNextNode() != null
                    && d.compareTo(current.getNextNode().getData()) <= 0) {
                if(d==current.getData()){ 
                    a=false;
                    break;
                }
                current = current.getNextNode();
            }
            if(d==current.getData()) a=false;
            if(a){
                newNode.setNextNode(current.getNextNode());
                current.setNextNode(newNode);
                cantidad++;
            }
            else{ 
                System.out.println("Ya existe ese dato");}
        }
        
    }
    @Override
    public boolean isEmpty() {
        return this.head == null;
    }
    //        1.Mostrar todos los datos de la lista.
    @Override
    public String showData() {
        String data = "";
        Node<T> current = this.head;
        while (current != null) {
            data = data + current.getData() + " ";
            current = current.getNextNode();
        }
        return data;
    }
    //7. Insertar nuevos nodos al final de la lista 
    //(si el dato ya se encuentra en la lista, no ingresarlo y lanzar excepción).
    @Override
    public void addLast(T d) {
        if (isEmpty()) {
            add(d);
            cantidad++;
        } 
        else {
            boolean a=true;
            Node<T> newNode = new Node<>(d);
            Node<T> current = this.head;
            while (current.getNextNode() != null) {
                if(d.compareTo(current.getData())==0)a=false;
                current = current.getNextNode();
            }
            if(a) {
                cantidad++;
                current.setNextNode(newNode);
            }
            else System.out.println("Ya existe ese dato");
        }

    }
    // 9.Eliminar un nodo con un dato específico ingresado por el usuario.
    @Override
    public void delete(T d)throws Exception{
        if (isEmpty()) {
            throw new Exception("No existen datos por borrar");
        } else {
            boolean a=true;
            Node<T> current = this.head;
            while (current != null&&current.getNextNode()!=null) {
                if(d.compareTo(current.getNextNode().getData())==0){
                    a=false;
                    break;    
                }
                current = current.getNextNode();
            }
            if(a)System.out.println("No se encuentra ese dato");
            else{
                current.setNextNode(current.getNextNode().getNextNode());
                cantidad--;
            }
        }
    }
    @Override
    public void deleteHead() throws Exception {
        if (isEmpty()) {
            throw new Exception("No existen datos por borrar");
        } else {
            this.head = head.getNextNode();
            cantidad--;
        }
    }
    @Override
    public void deleteLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("No existen datos por borrar");
        } else {
            Node<T> current = this.head;
            while (current.getNextNode().getNextNode() != null)
                current = current.getNextNode();
            current.setNextNode(null);
            cantidad--;
        }

    }
    //          3.Mostrar el dato mayor.
    @Override
    public T getMajor() throws Exception {
        if (isEmpty()) throw new Exception("No existen datos ");
        else{
            Node<T> comparate = this.head;
            Node<T> current  = this.head;
            
            while(current != null){
                if(comparate.getData().compareTo(current.getData())<0) 
                    comparate.setData((T) current.getData());
                current = current.getNextNode();
            }
            return comparate.getData();
        }
        
    }
    //          4.Mostrar el dato menor.
    @Override
    public T getMinor() throws Exception{
        if (isEmpty()) throw new Exception("No existen datos ");
        else{
            Node<T> comparate = this.head;
            Node<T> current  = this.head;
            
            while(current != null){
                if(comparate.getData().compareTo(current.getData())>0)
                    comparate.setData((T) current.getData());
                current = current.getNextNode();
                
            }
            return comparate.getData();
        }
    }
    //          5.Mostrar el promedio de datos.
    @Override
    public double getAverage() throws Exception{
        if (isEmpty()) throw new Exception("No existen datos ");
        else{
            Node<T> current  = this.head;
            double suma=0;
            while(current != null){
                suma+= current.getData().intValue();
                current = current.getNextNode();
            }
            return suma/cantidad;
        }
    }
    // 6.Determinar si un dato ingresado por el usuario existe en la lista
    @Override
    public boolean exist(int a)throws Exception{
        if (isEmpty()) throw new Exception("No existen datos ");
        else{
            Node<T> current  = this.head;
            while(current.getNextNode() != null){
                if(a==Integer.parseInt(current.getData().toString()))return true;
            current = current.getNextNode();
            }
            return false;
        }
    } 
    //10. Insertar nuevos nodos después de un dato especificado por el usuario 
    //(si no se encuentra el dato, lanzar excepción).
    @Override
    public void NewHead(T afterOf, T date) throws Exception{
        if (isEmpty()) throw new Exception("No existen datos por borrar");
        else{
            boolean a=true;
            Node<T> current = this.head;
            while (current != null&&current.getNextNode()!=null) {
                if(afterOf.compareTo(current.getNextNode().getData())==0){
                    a=false;
                    break; 
                    }
                current = current.getNextNode();
            }
            if(a) System.out.println("No se encuentra ese dato");
            else{
                Node<T> newNode = new Node<>(date);
                newNode.setNextNode(current.getNextNode().getNextNode());
                current.getNextNode().setNextNode(newNode);
                cantidad++;
            }
        }
    }
    //11.Modificar el dato de un nodo especifico (solicitar el dato anterior).
    @Override
    public void newDate(T currentData, T date) throws Exception{
        if (isEmpty()) {
            throw new Exception("No existen datos por borrar");
        } else {
            boolean a=true;
            Node<T> current = this.head;
            while (current != null) {
                if(currentData.compareTo(current.getData())==0){
                    a=false;
                    break;    
                }
                current = current.getNextNode();
            }
            if(a) System.out.println("No se encuentra ese dato");
            else current.setData(date);
        }
    }
    /**
     * 13. Determinar si otra lista es igual.
     * @param L lista a comparar
     * @return verdadero si son iguales
     * @throws Exception 
     */
    public boolean comparate(SinglyLinkedList<T> L) throws Exception{
        if (isEmpty()||L.isEmpty()) throw new Exception("No existen datos ");
        else{
            if(cantidad!=L.cantidad)return false;
            else{
                int count=0;
                Node<T> comparate = L.head;
                Node<T> current  = this.head;
            
                while(current != comparate||!(current==null && comparate==null)){
                    count++;
                    comparate=comparate.getNextNode();
                    current = current.getNextNode();
                }
                return count==cantidad;
            }
        
        }
    }
}

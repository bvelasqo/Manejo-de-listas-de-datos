/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

/**
 *
 * @author s208e19
 */
public class Listas {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        //  ListaOrdenada doble
        CircularDoublyLinkedList<Integer> listDouble1 = new CircularDoublyLinkedList<>();
        listDouble1.addOrdered(22);
        listDouble1.addOrdered(44);
        listDouble1.addOrdered(88);
        listDouble1.addOrdered(11);
        listDouble1.addOrdered(33);
        listDouble1.addOrdered(99);
        listDouble1.addOrdered(55);
        listDouble1.addOrdered(77);
        listDouble1.addOrdered(77);
        System.out.println("Lista Doble");
        System.out.println(listDouble1.showData());
        CircularDoublyLinkedList<Integer> listDouble2 = listDouble1.DivideList(55);
        System.out.println(listDouble2.showData());
        
        CircularSinglyLinkedList<Integer> listSingly1 = new CircularSinglyLinkedList<>();
        listSingly1.addOrdered(22);
        listSingly1.addOrdered(44);
        listSingly1.addOrdered(88);
        listSingly1.addOrdered(11);
        listSingly1.addOrdered(33);
        listSingly1.addOrdered(99);
        listSingly1.addOrdered(55);
        listSingly1.addOrdered(77);
        System.out.println("Lista Simple");
        System.out.println(listSingly1.showData());
        System.out.println(listSingly1.SpecificNode(33));
        CircularSinglyLinkedList<Integer> listSingly2 = new CircularSinglyLinkedList<>();
        listSingly2.addOrdered(555);
        listSingly2.addOrdered(444);
        listSingly2.addOrdered(888);
        listSingly2.addOrdered(111);
        listSingly2.addOrdered(333);
        listSingly2.addOrdered(999);
        listSingly2.addOrdered(222);
        listSingly2.addOrdered(777);
        System.out.println("Lista Simple");
        System.out.println(listSingly2.showData());
        
        CircularSinglyLinkedList<Integer> listSingly3 = listSingly1.joinList(listSingly2);
        System.out.println(listSingly3.showData());
    }

}

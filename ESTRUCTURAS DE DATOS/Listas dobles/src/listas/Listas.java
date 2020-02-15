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
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        DoublyLinkedList<Integer> myDoublelist = new DoublyLinkedList<>();
        myDoublelist.addOrdered(66);
        myDoublelist.addOrdered(11);
        myDoublelist.addOrdered(99);
        myDoublelist.addOrdered(33);
        myDoublelist.addOrdered(44);
        myDoublelist.addOrdered(22);
        myDoublelist.addOrdered(101);
        myDoublelist.addNode(33, 32);
        myDoublelist.addNode(100, 32);        
        System.out.println(myDoublelist.deleteNode(11));
        System.out.println(myDoublelist.deleteNode(101));
        System.out.println(myDoublelist.deleteNode(100));
        System.out.println(myDoublelist.showData());
        System.out.println(myDoublelist.searchData(33));
        System.out.println(myDoublelist.searchData(100));

    }

}

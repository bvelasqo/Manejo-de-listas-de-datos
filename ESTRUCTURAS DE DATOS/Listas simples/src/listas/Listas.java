/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Brandon Velasquez
 */
public class Listas {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        
        SinglyLinkedList<Integer> Lista1 = new SinglyLinkedList<>();
        Lista1.addOrderedMajor(50);
        Lista1.addOrderedMajor(30);
        Lista1.addOrderedMajor(40);
        Lista1.addOrderedMajor(70);
        Lista1.addOrderedMajor(80);
        Lista1.addOrderedMajor(10);
        Lista1.addOrderedMajor(100);
        Lista1.addOrderedMajor(20);
        Lista1.addOrderedMajor(60);
        
        SinglyLinkedList<Integer> Lista2= new SinglyLinkedList<>();
        Lista2.addOrderedMajor(50);
        Lista2.addOrderedMajor(30);
        Lista2.addOrderedMajor(40);
        Lista2.addOrderedMajor(70);
        Lista2.addOrderedMajor(80);
        Lista2.addOrderedMajor(10);
        Lista2.addOrderedMajor(100);
        Lista2.addOrderedMajor(20);
        Lista2.addOrderedMajor(60);
 
        SinglyLinkedList<Integer> Lista3= new SinglyLinkedList<>();
        //punto 8
        Lista3.addOrderedMajor(5);
        Lista3.addOrderedMajor(10);
        Lista3.addOrderedMajor(20);
        Lista3.addOrderedMajor(25);
        Lista3.addOrderedMajor(15);
        Lista3.addOrderedMajor(35);
        Lista3.addOrderedMajor(10);
        Lista3.addOrderedMajor(20);
        
        SinglyLinkedList<Integer> Lista4= new SinglyLinkedList<>();
        //punto 10
        Lista4.add(2);
        Lista4.add(6);
        Lista4.add(8);
        Lista4.add(4);
        Lista4.add(12);
        Lista4.add(10);
        Lista4.add(16);
        Lista4.add(14);
        Lista4.NewHead(4, 18);
        Lista4.NewHead(4, 20);
        
        
        SinglyLinkedList<Integer> Lista5= new SinglyLinkedList<>();
        //punto 7
        Lista5.add(3);
        Lista5.add(12);
        Lista5.add(9);
        Lista5.add(6);
        Lista5.add(15);
        Lista5.addLast(21);
        Lista5.add(18);
        Lista5.addLast(12);
        //punto 9
        Lista5.delete(6);
        Lista5.delete(90);
        
        SinglyLinkedList<Integer> Lista6= new SinglyLinkedList<>();
        Lista6.addOrderedMajor(4);
        Lista6.addOrderedMajor(8);
        Lista6.addOrderedMajor(12);
        Lista6.addOrderedMajor(16);
        Lista6.addOrderedMajor(28);
        Lista6.addOrderedMajor(24);
        Lista6.addOrderedMajor(20);
        Lista6.addOrderedMajor(36);
        //punto 11
        Lista6.newDate(36, 32);
        try {
            
        } catch (Exception ex) {
            Logger.getLogger(Listas.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
//        1.Mostrar todos los datos de la lista.
//        2.Mostrar la cantidad de datos.
//        3.Mostrar el dato mayor.
//        4.Mostrar el dato menor.
//        5.Mostrar el promedio de datos.
        System.out.println("Lista1: "+Lista1.showData());
        System.out.println("Promedio de datos:  " + Lista1.getAverage());
        System.out.println("Mayor lista1  " + Lista1.getMajor());
        System.out.println("Menor lista1  "+Lista1.getMinor());
        System.out.println("cantidad de datos:  " + Lista1.cantidad);
        System.out.println();
        
        System.out.println("Lista2: "+Lista2.showData());
        System.out.println("Promedio de datos:  " + Lista2.getAverage());
        System.out.println("Mayor lista2  "+Lista2.getMajor());
        System.out.println("Menor lista2  "+Lista2.getMinor());
        System.out.println("cantidad de datos:  "+Lista2.cantidad);
        System.out.println();
        
        System.out.println("Lista3: "+Lista3.showData());
        System.out.println("Promedio de datos:  " + Lista3.getAverage());
        System.out.println("Mayor lista3  "+Lista3.getMajor());
        System.out.println("Menor lista3  "+Lista3.getMinor());
        System.out.println("cantidad de datos:  "+Lista3.cantidad);
        System.out.println();
        
        System.out.println("Lista4: "+Lista4.showData());
        System.out.println("Promedio de datos:  " + Lista4.getAverage());
        System.out.println("Mayor lista4  " + Lista4.getMajor());
        System.out.println("Menor lista4  "+Lista4.getMinor());
        System.out.println("cantidad de datos:  " + Lista4.cantidad);
        System.out.println();
        
        System.out.println("Lista5: "+Lista5.showData());
        System.out.println("Promedio de datos:  " + Lista5.getAverage());
        System.out.println("Mayor lista5  " + Lista5.getMajor());
        System.out.println("Menor lista5  "+Lista5.getMinor());
        System.out.println("cantidad de datos:  " + Lista5.cantidad);
        System.out.println();
        
        System.out.println("Lista6: "+Lista6.showData());
        System.out.println("Promedio de datos:  " + Lista6.getAverage());
        System.out.println("Mayor lista6  " + Lista6.getMajor());
        System.out.println("Menor lista6  "+Lista6.getMinor());
        System.out.println("cantidad de datos:  " + Lista6.cantidad);
        System.out.println();
        
        //punto 13
        if(Lista1.comparate(Lista3))System.out.println("Son Iguales");
        else System.out.println("No son iguales");
        if(Lista1.comparate(Lista2))System.out.println("Son Iguales");
        else System.out.println("No son iguales");
        
        //punto 6
        if(Lista5.exist(3))System.out.println("Existe");
        else System.out.println("No existe");
        if(Lista5.exist(1))System.out.println("Existe");
        else System.out.println("No existe");
    }
    // 12.Determinar si otra lista tiene el mismo tamaño.
        public boolean comparateSize(SinglyLinkedList<Integer> L1,SinglyLinkedList<Integer> L2){
        return L1.cantidad==L2.cantidad;
        }
    
}

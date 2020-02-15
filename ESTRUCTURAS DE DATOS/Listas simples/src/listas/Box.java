/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

/**
 *
 * @author s103e28
 */
public class Box<T> {
    
    private T l1;
    private T l2;
    private T l3;

    public Box(T l1, T l2, T l3) {
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
    }

    /**
     * @return the l1
     */
    public T getL1() {
        return l1;
    }

    /**
     * @param l1 the l1 to set
     */
    public void setL1(T l1) {
        this.l1 = l1;
    }

    /**
     * @return the l2
     */
    public T getL2() {
        return l2;
    }

    /**
     * @param l2 the l2 to set
     */
    public void setL2(T l2) {
        this.l2 = l2;
    }

    /**
     * @return the l3
     */
    public T getL3() {
        return l3;
    }

    /**
     * @param l3 the l3 to set
     */
    public void setL3(T l3) {
        this.l3 = l3;
    }
    
    
    
}

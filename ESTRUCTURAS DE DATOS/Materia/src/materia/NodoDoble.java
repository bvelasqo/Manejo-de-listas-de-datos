/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package materia;

/**
 *
 * @author s103e28
 */
public final class NodoDoble<T> {

    private T data;
    private NodoDoble<T> nextNode;
    private NodoDoble<T> previousNode;
    
    public NodoDoble(T d,NodoDoble pn, NodoDoble nn){
        setData(d);
        setPreviousNode(pn);
        setNextNode(nn);
    }
    
    public NodoDoble(T d){
       this(d,null,null) ;
    }

    
    /**
     * @return the data
     */
    public T getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(T data) {
        this.data = data;
    }

    /**
     * @return the nextNode
     */
    public NodoDoble<T> getNextNode() {
        return nextNode;
    }

    /**
     * @param nextNode the nextNode to set
     */
    public void setNextNode(NodoDoble<T> nextNode) {
        this.nextNode = nextNode;
    }

    /**
     * @return the previousNode
     */
    public NodoDoble<T> getPreviousNode() {
        return previousNode;
    }

    /**
     * @param previousNode the previousNode to set
     */
    public void setPreviousNode(NodoDoble<T> previousNode) {
        this.previousNode = previousNode;
    }
}

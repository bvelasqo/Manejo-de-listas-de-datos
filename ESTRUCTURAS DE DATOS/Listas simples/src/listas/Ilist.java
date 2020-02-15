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
public interface Ilist<T> {
    
    /**
     * Agregar un dato
     * @param d dato
     */
    public void add(T d);

    /**
    *Agregar un dato al final
    *@param d dato
     */
    public void addLast(T d);

    /**
    *Agregar un dato ordenado de menor a mayor
    *@param d dato
     */
    public void addOrderedMajor(T d);

    /**
    *Borrar un dato al inicio
    * @throws Exception verifica si está vacía
     */
    public void deleteHead() throws Exception;

    /**
    *Borrar un dato al final
    * @throws Exception verifica si está vacía
     */
    public void deleteLast() throws Exception;
    
    /**
    *Verificar si la lisa esta vacia
    *@return verdadero si esta vacia
     */
    public boolean isEmpty();

    /**
    *Mostrar todos los datos de la lista
    *@return String con todos los datos
     */
    public String showData();
    
    /**
    *Eliminar un dato en especifico
    *@param d dato a eliminar
    * @throws Exception verifica si está vacía
     */
    public void delete(T d)throws Exception;
    
    /**
    @return mayor de los elementos de la lista
    * @throws Exception verifica si está vacía
    */
    public T getMajor() throws Exception;
    
    /** 
    * @return menor de los elementos de la lista
    * @throws Exception verifica si está vacía
    */
    public T getMinor() throws Exception;
    
    /**
    @return promedio de los elementos de la lista
    * @throws Exception verifica si está vacía
    */
    public double getAverage() throws Exception;
    
    /**
    Valida si existe un numero específico
    @param a numero específico
    * @throws Exception verifica si está vacía
    @return Verdadero si existe
    */
    public boolean exist(int a)throws Exception;
    
    /**
    Se ingresan datos despues de un dato especifico
    @param afterOf el dato al que los nuevos 
    datos tomaran de referencia
    * @throws Exception verifica si está vacía
    @param date nuevo dato
    */
    public void NewHead(T afterOf, T date) throws Exception;
    
    /**
    Cambia dato específico
    @param currentData dato actual del nodo
    * @throws Exception verifica si está vacía
    @param date nuevo dato del nodo
    */
    public void newDate(T currentData, T date) throws Exception;
        
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package materia;

public interface Ilist<T> {

    /*
    *Agregar un dato al inicio
    *@param el dato
     */
    public void add(T d);

    /*
    *Agregar un dato al final
    *@param el dato
     */
    public void addLast(T d);

    /*
    *Verificar si la lisa esta vacia
    *@return verdadero si esta vacia
     */
    public boolean isEmpty();

    /*
    *Mostrar todos los datos de la lista
    *@return String con todos los datos
     */
    public String showData();

}

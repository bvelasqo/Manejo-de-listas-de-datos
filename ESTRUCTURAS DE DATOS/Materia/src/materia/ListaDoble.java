/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package materia;

/**
 *
 * @author s103e28
 * @param <T>
 */
public class ListaDoble<T extends Estudiantes> implements Ilist<T> {

    private NodoDoble<T> head;
    private NodoDoble<T> tail;

    public ListaDoble() {
        head = tail = null;
    }
    
    @Override
    public void add(T d) {
        if (isEmpty()) {
            head = tail = new NodoDoble<>(d);
        } else {
            head = new NodoDoble<>(d, null, head);
            head.getNextNode().setPreviousNode(head);
        }

    }

    @Override
    public void addLast(T d) {
        if (isEmpty()) {
            head = tail = new NodoDoble<>(d);
        } else {
            tail = new NodoDoble<>(d, tail, null);
            tail.getPreviousNode().setNextNode(tail);
        }
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public String showData() {
        String data = "";
        NodoDoble<T> current = this.head;
        while (current != null) {
            data = data + current.getData().getCedula() + " "
                    + current.getData().getNombre() + " "
                    + current.getData().getBarrio() + " "
                    + current.getData().getNotaFinal() + "\n";
            current = current.getNextNode();
        }
        return data;
    }
    
    public String searchData(String codigo) {

        NodoDoble<T> current = this.head;

        while (current != null) {
            if (current.getData().getCedula().equals(codigo)) {
                return current.getData().getCedula() + " "
                    + current.getData().getNombre() + " "
                    + current.getData().getBarrio() + " "
                    + current.getData().getNotaFinal() + "\n";
            }
            current = current.getNextNode();
        }

        return "No existe ese estudiante";
    }
    public String searchNeighborhood(String barrio) {

        NodoDoble<T> current = this.head;
        String data="";
        while (current != null) {
            if (current.getData().getBarrio().equals(barrio)) {
                data += current.getData().getCedula() + " "
                    + current.getData().getNombre() + " "
                    + current.getData().getBarrio() + " "
                    + current.getData().getNotaFinal() + "\n";
            }
            current = current.getNextNode();
        }
        
        return data;
    }
}

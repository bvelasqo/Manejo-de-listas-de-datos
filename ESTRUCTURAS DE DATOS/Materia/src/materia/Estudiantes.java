/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package materia;

/**
 *
 * @author Brandon Velasquez
 */
public final class Estudiantes {
    private String Cedula;
    private String Nombre;
    private String Barrio;
    private double NotaFinal;

    public Estudiantes(String Cedula, String Nombre, String Barrio, double NotaFinal){
        setCedula(Cedula);
        setBarrio(Barrio);
        setNombre(Nombre);
        setNotaFinal(NotaFinal);
    }
    /**
     * @return the Cedula
     */
    public String getCedula() {
        return Cedula;
    }

    /**
     * @param Cedula the Cedula to set
     */
    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @return the Barrio
     */
    public String getBarrio() {
        return Barrio;
    }

    /**
     * @param Barrio the Barrio to set
     */
    public void setBarrio(String Barrio) {
        this.Barrio = Barrio;
    }

    /**
     * @return the NotaFinal
     */
    public double getNotaFinal() {
        return NotaFinal;
    }

    /**
     * @param NotaFinal the NotaFinal to set
     */
    public void setNotaFinal(double NotaFinal) {
        this.NotaFinal = NotaFinal;
    }
}

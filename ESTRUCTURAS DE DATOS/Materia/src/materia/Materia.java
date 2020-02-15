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
public class Materia {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here}
        ListaDoble<Estudiantes>lista = new ListaDoble<>();
        ListaDoble<Estudiantes>aprobados = new ListaDoble<>();
        ListaDoble<Estudiantes>reprobados = new ListaDoble<>();

        crearEstudiante("1001243609", "Brandon", "Belen", 4.8,lista,aprobados,reprobados);
        crearEstudiante("1001444444", "Camilo", "Floresta", 1.5,lista,aprobados,reprobados);
        crearEstudiante("1001111111", "Yenifer", "Belen", 2.9,lista,aprobados,reprobados);
        crearEstudiante("1001555555", "Daniel", "Calazans", 3.0,lista,aprobados,reprobados);
        crearEstudiante("1001999999", "Alejandra", "Niquia", 5.0,lista,aprobados,reprobados);
        crearEstudiante("1001666666", "Valentina", "Belen", 3.3,lista,aprobados,reprobados);
        crearEstudiante("1001222222", "Oscar", "Calazans", 1.2,lista,aprobados,reprobados);
        crearEstudiante("1001333333", "Julieta", "Floresta", 4.6,lista,aprobados,reprobados);
        crearEstudiante("1001000000", "Wilmar", "Rincon", 4.1,lista,aprobados,reprobados);
        crearEstudiante("1001777777", "Paula", "Niquia", 3.8,lista,aprobados,reprobados);
        System.out.println("Estudiantes");
        System.out.println();
        System.out.println("CODIGO---NOMBRE---BARRIO---NOTA");
        System.out.println(lista.showData());
        System.out.println();

        System.out.println("aprobados");
        System.out.println();
        System.out.println("CODIGO---NOMBRE---BARRIO---NOTA");
        System.out.println(aprobados.showData());
        System.out.println();

        System.out.println("reprobados");
        System.out.println();
        System.out.println("CODIGO---NOMBRE---BARRIO---NOTA");
        System.out.println(reprobados.showData());
        
        System.out.println("Busqueda por codigo");
        System.out.println();
        System.out.println("CODIGO---NOMBRE---BARRIO---NOTA");
        System.out.println(lista.searchData("1001243609"));
        System.out.println();
        
        System.out.println("Busqueda por barrio");
        System.out.println();
        System.out.println("CODIGO---NOMBRE---BARRIO---NOTA");
        System.out.println(lista.searchNeighborhood("Belen"));
        System.out.println();
    }
    public static  void crearEstudiante(String Cedula, String Nombre, String Barrio,
            double NotaFinal, ListaDoble<Estudiantes> lista,ListaDoble<Estudiantes> aprobados,
            ListaDoble<Estudiantes> reprobados){
        Estudiantes e = new Estudiantes(Cedula, Nombre, Barrio, NotaFinal);
        if(NotaFinal<3.0){
            lista.addLast(e);
            reprobados.add(e);
        }
        else{
            lista.add(e);
            aprobados.add(e);
        }
    }
}

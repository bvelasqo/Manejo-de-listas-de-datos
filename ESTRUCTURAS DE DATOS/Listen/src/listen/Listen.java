/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listen;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Brandon Velasquez
 */
public class Listen {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        int opcion=0;
        Scanner teclado=new Scanner(System.in);
        System.out.println("¡BIENVENIDO A LISTEN IT! :)");
        Playlist<String> playlist = new Playlist<>();
        while(opcion!=6){
            System.out.println("¡Menú principal! \n 1) Agregar video \n 2) Eliminar");
            System.out.println(" 3) Actualizar \n 4) Ver lista \n 5) Reproducción automática");
            System.out.println(" 6) Salir");
            System.out.print(" Ingrese una opción del 1 al 6: ");
            try {
                opcion = teclado.nextInt();
            } catch (InputMismatchException e) {
                opcion=0;
                teclado = new Scanner(System.in);
            }
            switch (opcion) {
                case 1:
                    teclado = new Scanner(System.in);
                    System.out.print("Ingrese nombre del video: ");
                    playlist.addLast(teclado.nextLine());
                    System.out.println("\nVIDEO AGREGADO \n");
                    break;
                case 2:
                    teclado = new Scanner(System.in);
                    System.out.print("Ingrese nombre de canción que desea eliminar: ");
                    playlist.delete(teclado.nextLine());
                    break;
                case 3:
                    teclado = new Scanner(System.in);
                    System.out.print("Ingrese nombre de canción que desea cambiar: ");
                    String CurrentName = teclado.nextLine();
                    teclado = new Scanner(System.in);
                    System.out.print("Ingrese nuevo nombre de la canción: ");
                    String NewName = teclado.nextLine();
                    playlist.update(CurrentName, NewName);
                    break;
                case 4:
                    System.out.println("\nPlaylist\n");
                    System.out.println(playlist.showSongs());
                    break;
                case 5:
                    teclado = new Scanner(System.in);
                    boolean again = true;
                    while (again) {
                        try {playlist.showSong();}
                        catch (InterruptedException e) {}
                        System.out.println("\n Última canción ¿Desea iniciar nuevamente? s/n");
                        switch (teclado.next().toLowerCase()) {
                            case "s":
                                again=true;
                                break;
                            case "n":
                                again=false;
                                break;
                            default:
                                System.out.println("\n Última canción ¿Desea iniciar nuevamente? s/n");
                                break;
                        }
                    }   
                    break;
            }
        }
    }    
}
   
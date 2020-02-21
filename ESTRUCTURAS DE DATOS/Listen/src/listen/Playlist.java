/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listen;

/**
 *
 * @author Brandon Velasquez
 * @param <T>
 */
public class Playlist<T extends Comparable> {
    
    Songs<T> head;
    Songs<T> tail;
    int cantidad=0;

    private Songs<T> addSongs(T d) {
        Songs<T> newSongs = new Songs<>(d);
        if (isEmpty()) {
            head = tail = newSongs;
            newSongs.setNextSongs(newSongs);
        } else {
            newSongs.setNextSongs(head);
            tail.setNextSongs(newSongs);
        }
        cantidad++;
        return newSongs;
    }


    public void add(T d) {
        head = addSongs(d);
    }


    public void addLast(T d) {
        tail = addSongs(d);
    }
    
    public void update(T CurrentName, T NewName){
        if(isEmpty())System.out.println("\n No hay canciones  :( \n");
        else if(exist(CurrentName)==null)System.out.println("\n No existe esa canción :( \n");
        else {
            exist(CurrentName).getNextSongs().setSong(NewName);
            System.out.println("\n VIDEO ACTUALIZADO \n");
        }
    }
    
    public Songs<T> exist(T d){
        if(isEmpty()){
            System.out.println("\n No hay canciones  :( \n");
            return null;
        }
        else{
            Songs<T> current = this.tail;
            do{
                if(d.compareTo(current.getNextSongs().getSong())==0)return current;
                current=current.getNextSongs();
            }while(current!=tail);
            return null;
        }
    }

    public void delete(T d) {
         if (isEmpty()) {
             System.out.println("\n No hay canciones  :( \n");
        } else if (head == tail) {
            head = null;
        } else {
            Songs<T> current = exist(d);
            if(current != null){
                if(current.getNextSongs() == head){
                    current.setNextSongs(head.getNextSongs());
                    head=current.getNextSongs();
                }
                else if(current.getNextSongs() == tail){
                    current.setNextSongs(head);
                    tail=current;
                }
                else current.setNextSongs(current.getNextSongs().getNextSongs());
                System.out.println("\n VIDEO BORRADO\n");
            }
        }
    }
    
    public boolean isEmpty() {
        return head == null;
    }


    public void showSong() throws InterruptedException {
        if(isEmpty())System.out.println("\n No hay canciones  :( \n");
        else {
            Songs<T> current = this.head;
            do {
                System.out.println(current.getSong());
                Thread.sleep(2000);
                current = current.getNextSongs();
            } while (current != head);
        }
    }
    
    public String showSongs(){
        if(isEmpty())System.out.println("\n No hay canciones  :( \n");
        else {
            String playlist = "";
            Songs<T> current = this.head;
            do {
                playlist += current.getSong() + " \n ";
                current = current.getNextSongs();
            } while (current != head);
            return playlist;
        }
        return "";
    }
}

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
public class Songs<T> {
    private T song;
    private Songs<T> nextSongs;

    public Songs(T d) {
        this.song = d;
        nextSongs = null;
    }

    /**
     * @return the song
     */
    public T getSong() {
        return song;
    }

    /**
     * @param song the song to set
     */
    public void setSong(T song) {
        this.song = song;
    }

    /**
     * @return the nextSongs
     */
    public Songs getNextSongs() {
        return nextSongs;
    }

    /**
     * @param nextSongs the nextSongs to set
     */
    public void setNextSongs(Songs nextSongs) {
        this.nextSongs = nextSongs;
    }

}

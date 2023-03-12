/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spotify;

public class NodoArtist {
    private String name;
    private SongList songs;
    private NodoArtist next;
    private NodoArtist previous;

    public NodoArtist(String name, SongList songs) {
        this.name = name;
        this.songs = songs;
        this.next = null;
        this.previous = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SongList getSongs() {
        return songs;
    }

    public void setSongs(SongList songs) {
        this.songs = songs;
    }

    public NodoArtist getNext() {
        return next;
    }

    public void setNext(NodoArtist next) {
        this.next = next;
    }

    public NodoArtist getPrevious() {
        return previous;
    }

    public void setPrevious(NodoArtist previous) {
        this.previous = previous;
    }
}

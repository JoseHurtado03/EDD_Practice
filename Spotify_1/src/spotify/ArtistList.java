/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spotify;

import javax.swing.JOptionPane;

public class ArtistList {
    private NodoArtist head;
    private NodoArtist tail;
    private int size;
    
    public ArtistList(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public NodoArtist getHead() {
        return head;
    }

    public void setHead(NodoArtist head) {
        this.head = head;
    }

    public NodoArtist getTail() {
        return tail;
    }

    public void setTail(NodoArtist tail) {
        this.tail = tail;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    public boolean isEmpty(){
        return head == null;
    }
    
    public NodoArtist insertBegin(NodoArtist artist){
        if (isEmpty()){
            setHead(artist);
            setTail(artist);
            size++;
        } else {
            artist.setNext(getHead());
            getHead().setPrevious(artist);
            setHead(artist);
            NodoArtist pointer = getHead();
            while (pointer.getNext() != null){
                pointer = pointer.getNext();
            }
            setTail(pointer);
            }
        size++;
        return artist;
        }
    public NodoArtist append(NodoArtist artist){
        if (isEmpty()){
            setHead(artist);
            setTail(artist);
            size++;
        } else {
            NodoArtist pointer = getHead();
            while (pointer.getNext() != null){
                pointer = pointer.getNext();
            }
            pointer.setNext(artist);
            artist.setPrevious(pointer);
            setTail(artist);     
        }
        size++;
        return artist;
    }
    
    public NodoArtist getArtist(int index){
        int cont = 0;
        NodoArtist current = getHead();
        while (cont < index){
            current = current.getNext();
            cont++;
        }
        return current;
    }
    
    public String printArtists(){
        String artistsInfo = "";
        NodoArtist current = getHead();
        while (current != null){
            artistsInfo += "ARTISTA: "+current.getName()+ " Canciones: \n"+current.getSongs().printSongs()+"\n";
            current = current.getNext();
        }
        return artistsInfo;
    }
    
    public String printArtist(NodoArtist artist){
        if (artist != null) {
            String info = "Nombre: " + artist.getName() + " Canciones: \n" + artist.getSongs().printSongs();
            return info;
        }
        return null;
    }
    
    public NodoArtist searchArtist(String name){
        NodoArtist current = getHead();
        for (int i = 0; i < size; i++) {
            if(current.getName().equalsIgnoreCase(name)){
                return current;
            } else{
                current = current.getNext();
            }
        }
        JOptionPane.showMessageDialog(null, "Artista no encontrado");
        return null;
    }
    
    public NodoSong searchSong(String name){
        NodoArtist currentA = getHead();
        while (currentA != null){
            SongList songs = currentA.getSongs();
            NodoSong currentSong = songs.getHead();
            while (currentSong != null){
                if (currentSong.getName().equals(name)){
                    return currentSong;
                } else{
                    currentSong = currentSong.getNext();
                }
            }
            currentA = currentA.getNext();
        }
        JOptionPane.showMessageDialog(null, "Canción no encontrada");
        return null;
    }
}

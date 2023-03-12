/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spotify;

public class SongList {
    private NodoSong head;
    private NodoSong tail;
    private int size;
    
    public SongList(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public NodoSong getHead() {
        return head;
    }

    public void setHead(NodoSong head) {
        this.head = head;
    }

    public NodoSong getTail() {
        return tail;
    }

    public void setTail(NodoSong tail) {
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
    
    public NodoSong insertBegin(NodoSong song){
        if (isEmpty()){
            setHead(song);
            setTail(song);
            size++;
        } else {
            song.setNext(getHead());
            getHead().setPrevious(song);
            setHead(song);
            NodoSong pointer = getHead();
            while (pointer.getNext() != null){
                pointer = pointer.getNext();
            }
            setTail(pointer);
            }
        size++;
        return song;
        }
    public NodoSong append(NodoSong song){
        if (isEmpty()){
            setHead(song);
            setTail(song);
            size++;
        } else {
            NodoSong pointer = getHead();
            while (pointer.getNext() != null){
                pointer = pointer.getNext();
            }
            pointer.setNext(song);
            song.setPrevious(pointer);
            setTail(song);     
        }
        size++;
        return song;
    }
    
    public String printSongs(){
        String songsInfo = "";
        NodoSong currentSong = getHead();
        while (currentSong != null){
            songsInfo += currentSong.getName()+". Idioma: "+currentSong.getLanguage()+". Año: "+currentSong.getYear()+"\n";
            currentSong = currentSong.getNext();
        }
        return songsInfo;
    }
}

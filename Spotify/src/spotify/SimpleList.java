/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spotify;

public class SimpleList {
    private Nodo head;
    private int size;

    public SimpleList() {
        this.head = null;
        this.size = 0;
    }

    public Nodo getHead() {
        return head;
    }

    public void setHead(Nodo head) {
        this.head = head;
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
    
    public Nodo insertBegin(Song song) {
        Nodo node = new Nodo(song);
        if (isEmpty()) {
            setHead(node);
        } else {
            node.setNext(head);
            setHead(node);
        }
        size++;
        return node;
    }
    
    public Nodo insertFinal(Song song){
        Nodo node = new Nodo(song);
        if (isEmpty()) {
            setHead(node);
        } else {
            Nodo pointer = getHead();
            while (pointer.getNext() != null) {
                pointer = pointer.getNext();
            }
            pointer.setNext(node);
        }
        size++;
        return node;
    }
    
    public Nodo insertInIndex(int index, Song song) {
        Nodo node = new Nodo(song);
        if (isEmpty()) {
            setHead(node);
        } else {
            if (index > getSize()) {
                System.out.println("The index is bigger than the size");
                return insertFinal(song);
            } else {
                Nodo pointer = getHead();
                int cont = 0;
                while (cont < (index-1) && pointer.getNext() != null) {
                    pointer = pointer.getNext();
                    cont++;
                }
                node.setNext(pointer.getNext());
                pointer.setNext(node);
            }
        }
        size++;
        return node;
    }
    
    public Nodo deleteBegin(){
        if (!isEmpty()){
            Nodo pointer = getHead();
            setHead(pointer.getNext());
            pointer.setNext(null);
            size--;
            return pointer;
        }
        return null;
    }
    
    public Nodo deleteFinal(){
        if (!isEmpty()){
            Nodo pointer = getHead();
            if (getSize() == 1) {
                setHead(null);
                size--;
            } else {
                while (pointer.getNext() != null && pointer.getNext().getNext() != null){
                    pointer = pointer.getNext();
                }
                Nodo nodeReturn = pointer.getNext();
                pointer.setNext(null);
                size--;
                return nodeReturn;
            }
        }
        return null;
    }
    
    public Nodo deleteInIndex(int index) {
        if (!isEmpty()){
            Nodo pointer = getHead();
            if (index > getSize()) {
                System.out.println("The index is bigger than the size");
                return deleteFinal();
            } else {
                int cont = 0;
                while (cont < (index -1) && pointer.getNext() != null){
                    pointer = pointer.getNext();
                    cont++;
                }
                Nodo temp = pointer.getNext();
                pointer.setNext(temp.getNext());
                temp.setNext(null);
                size--;
            }
        }
        return null;
    }
    
    public Song getSong(int index) {
        if (isEmpty()) {
            return null;
        } else {
            Nodo pointer = getHead();
            int cont = 0;
            while (cont < index && pointer.getNext() != null) {
                pointer = pointer.getNext();
                cont++;
            }
            return pointer.getElement();
        }
    }
    
    public void printList(){
        for (int i = 0; i < getSize(); i++) {
            Song song = getSong(i);
            System.out.println("Canción: "+song.getName()+" "+ "Número: "+song.getNum()+" "+"Artista: "+song.getArtist()+" "+ "Número de Reproducciones: "+song.getNumRepro()+" "+"Año: "+song.getYear()+" "+"Idioma: "+song.getLenguage());
        }
    }
    
    public String SearchSong(String name){
        Nodo pointer = getHead();
        if (!isEmpty()){
            for (int i = 0; i < getSize(); i++) {
                if (pointer.getElement().getName().equalsIgnoreCase(name)){
                    return "La canción encontrada es: "+ Integer.toString(pointer.getElement().getNum())+", "+ pointer.getElement().getName()+", "+ pointer.getElement().getArtist()+", "+ Integer.toString(pointer.getElement().getNumRepro())+", "+Integer.toString(pointer.getElement().getYear())+", "+pointer.getElement().getLenguage();
                }
                pointer = pointer.getNext();
            }
            return "La canción no fue encontrada";
        }
        return "La lista no tiene ninguna canción";
    }
    
    public SimpleList ArtistFilter(String artist){
        Nodo pointer = getHead();
        SimpleList filterList = new SimpleList();
        if (!isEmpty()){
            for (int i = 0; i < getSize(); i++) {
                if(pointer.getElement().getArtist().equalsIgnoreCase(artist)){
                    filterList.insertFinal(pointer.getElement());
                    pointer = pointer.getNext();
                } else{
                    pointer = pointer.getNext();
                }
            }
        }
        return filterList;
    }
    
    public String ReturnSong(){
        String cadena = "";
        if (!isEmpty()){
            Nodo pointer = getHead();
            for (int i = 0; i < getSize(); i++) {
                cadena = cadena+pointer.getElement().printSong()+"\n";
                pointer = pointer.getNext();
            }
        }
        return cadena;
    }
}

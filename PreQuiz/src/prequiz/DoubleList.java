/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prequiz;

public class DoubleList {
    private Nodo head;
    private Nodo tail;
    private int length;
    
    public DoubleList(){
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public Nodo getHead() {
        return head;
    }

    public void setHead(Nodo head) {
        this.head = head;
    }

    public Nodo getTail() {
        return tail;
    }

    public void setTail(Nodo tail) {
        this.tail = tail;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
    
    public boolean isEmpty(){
        return head == null;
    }
    
    public Nodo insertBegin(int element){
        Nodo node = new Nodo(element);
        if (isEmpty()){
            setHead(node);
            setTail(node);
            length++;
        } else {
            node.setNext(getHead());
            getHead().setPrevious(node);
            setHead(node);
            Nodo pointer = getHead();
            while (pointer.getNext() != null){
                pointer = pointer.getNext();
            }
            setTail(pointer);
            }
        length++;
        return node;
        }
    public Nodo append(int element){
        Nodo node = new Nodo(element);
        if (isEmpty()){
            setHead(node);
            setTail(node);
            length++;
        } else {
            Nodo pointer = getHead();
            while (pointer.getNext() != null){
                pointer = pointer.getNext();
            }
            pointer.setNext(node);
            node.setPrevious(pointer);
            setTail(node);     
        }
        length++;
        return node;
    }
    public Nodo insertarInIndex(int index, int element){
        Nodo node = new Nodo(element);
        if (isEmpty()){
            setHead(node);
            setTail(node);
            length++;
        } else{
            if (index > getLength()){
                System.out.println("El índice es más grande que el tamaño de la lista");
                append(element);
            } else {
                if (index < getLength()/2){
                    Nodo pointer = getTail();
                    int cont = 0;
                    while (cont < (getLength() - index) && pointer.getPrevious()!= null){
                        pointer = pointer.getPrevious();
                        cont++;
                    }
                    node.setNext(pointer.getNext());
                    node.setPrevious(pointer);
                    pointer.getNext().setPrevious(node);
                    pointer.setNext(node);
                } else{
                    Nodo pointer = getHead();
                    int cont = 0;
                    while (cont < index-1 && pointer.getNext() != null){
                        pointer = pointer.getNext();
                        cont++;
                    }
                    node.setNext(pointer.getNext());
                    node.setPrevious(pointer);
                    pointer.getNext().setPrevious(pointer);
                    pointer.setNext(node);
                }
            }
        }
        length++;
        return node;
    }
    public Nodo deleteBegin(){
        if (!isEmpty()){
            if (getLength() == 1){
                setTail(null);
            }
            Nodo pointer = getHead();
            setHead(pointer.getNext());
            pointer.setNext(null);
            length--;
            return pointer;
        }
        return null;
    }
    public Nodo deleteFinal(){
        if (!isEmpty()){
            Nodo pointer = getHead();
            if (getLength() == 1){
                setHead(null);
                length--;
            } else{
                while (pointer.getNext() != null && pointer.getNext().getNext() != null){
                    pointer = pointer.getNext();
                }
                pointer.getNext().setPrevious(null);
                Nodo nodeReturn = pointer.getNext();
                pointer.setNext(null);
                setTail(pointer);
                length--;
                return nodeReturn;
            }
        }
        return null;
    }
    public Nodo deleteInIndex(int index){
        if (!isEmpty()){
            Nodo pointer = getHead();
            if (index > getLength()){
                System.out.println("El índice es más grande que el tamaño de la lista");
                deleteFinal();
            } else{
                if (index > getLength()/2){
                    pointer = getTail();
                    int cont = 0;
                    while (cont < (getLength()-index) && pointer.getPrevious() != null){
                        pointer = pointer.getPrevious();
                        cont++;
                    }
                    Nodo temp = pointer.getNext();
                    pointer.setNext(temp.getNext());
                    temp.getNext().setPrevious(pointer);
                    temp.setNext(null);
                    temp.setPrevious(null);
                    length--;
                } else{
                    pointer = getHead();
                    int cont = 0;
                    while (cont < (index-2) && pointer.getNext() != null){
                        pointer = pointer.getNext();
                        cont++;
                    }
                    Nodo temp = pointer.getNext();
                    pointer.setNext(temp.getNext());
                    temp.getNext().setPrevious(pointer);
                    temp.setNext(null);
                    temp.setPrevious(null);
                    length--;
                }
            }
        }
        return null;
    }
    public int getElement(int index) {
        if (isEmpty()) {
            return -1;
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
        for (int i = 0; i < getLength()-1; i++) {
            Object elemento = getElement(i);
            System.out.println("Lista:"+elemento);
        }
    }
    
    public Integer searchElement(Integer element){
        Nodo pointer = getHead();
        while (pointer != null){
            if (pointer.getElement() == element){
                return pointer.getElement();
            } else{
                pointer = pointer.getNext();
            }
        }
        return null;
    }
    
    public Nodo deleteElement(Integer element){
        Nodo pointer = getHead();
        Nodo nodoReturn = null;
        while (pointer != null){
            if (pointer.getElement() == element){
                nodoReturn = pointer;
                break;
            } else{
                pointer = pointer.getNext();
            }
        }
        if (pointer == null){
            return null;
        } else{
            if (pointer == getHead()){
                setHead(pointer.getNext());
                pointer.getNext().setPrevious(null);
                pointer.setNext(null);
            } else if(pointer == getTail()){
                setTail(pointer.getPrevious());
                pointer.getPrevious().setNext(null);
                pointer.setPrevious(null); 
            } else{
            pointer.getPrevious().setNext(pointer.getNext());
            pointer.getNext().setPrevious(pointer.getPrevious());
            pointer.setNext(null);
            pointer.setPrevious(null);
            
            }
        }
        length--;
        return nodoReturn;
    }
}

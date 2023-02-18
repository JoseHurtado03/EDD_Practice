/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listascirculares;

public class ListaCircularD {
    private Nodo head;
    private Nodo tail;
    private int size;

    public ListaCircularD() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    /**
     * @return the head
     */
    public Nodo getHead() {
        return head;
    }

    /**
     * @param head the head to set
     */
    public void setHead(Nodo head) {
        this.head = head;
    }

    /**
     * @return the tail
     */
    public Nodo getTail() {
        return tail;
    }

    /**
     * @param tail the tail to set
     */
    public void setTail(Nodo tail) {
        this.tail = tail;
    }

    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }
    
    public boolean isEmpty(){
        return getHead() == null;
    }
    
    public Nodo insertBegin(Object element) {
        Nodo node = new Nodo(element);
        if (isEmpty()){
            node.setNext(node);
            node.setPrevious(node);
            setHead(node);
            setTail(node);
        } else{
            node.setNext(getHead());
            node.setPrevious(getTail());
            setHead(node);
        }
        size++;
        return node;
    }
    
    public Nodo append(Object element){
        Nodo node = new Nodo(element);
        if (isEmpty()){
            node.setNext(node);
            node.setPrevious(node);
            setHead(node);
            setTail(node);
        } else{
            Nodo pointer = getHead();
            while (pointer.getNext() != getHead()){
                pointer = pointer.getNext();
            }
            pointer.setNext(node);
            node.setPrevious(pointer);
            setTail(node);
            getHead().setPrevious(getTail());
            getTail().setNext(getHead());
        }
        size++;
        return node;
    }
    
    public Nodo insertInIndex(int index, Object element) {
        Nodo node = new Nodo(element);
        if (isEmpty()) {
            return append(element);
        } else {
            if (index > getSize()) {
                System.out.println("El índice es más grande que el tamaño de la lista");
                return append(element);
            } else {
                if (index > getSize() / 2) {
                    Nodo pointer = getTail();
                    int cont = 0;
                    while (cont < (getSize() - index) && pointer.getPrevious()!= getTail()) {
                        pointer = pointer.getPrevious();
                        cont++;
                    }
                    //5 8 20 1 2 3 4 12
                    //cont 1 pointer 20
                    node.setNext(pointer.getNext());
                    node.setPrevious(pointer);
                    pointer.getNext().setPrevious(node);
                    pointer.setNext(node);
                } else {
                    Nodo pointer = getHead();
                    int cont = 0;
                    while (cont < (index-1) && pointer.getNext()!= getHead()) {
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
        size++;
        return node;
    }
    
    public Nodo deleteBegin(){
        if (!isEmpty()){
            if (getSize() == 1){
                setTail(null);
            }
            Nodo pointer = getHead();
            setHead(pointer.getNext());
            pointer.setNext(null);
            pointer.setPrevious(null);
            getHead().setPrevious(getTail());
            getTail().setNext(getHead());
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
                while (pointer.getNext() != getHead()){
                    pointer = pointer.getNext();
                }
                setTail(pointer.getPrevious());
                pointer.setPrevious(null);
                pointer.setNext(null);
                getTail().setNext(getHead());
                getHead().setPrevious(getTail());
                size--;
                return pointer;
            }
        }
        return null;
    }
    
    public Nodo deleteIndex(int index){
        if (!isEmpty()){
            Nodo pointer = getHead();
            if (index > getSize()) {
                System.out.println("The index is bigger than the size");
                return deleteFinal();
            } else {
                if (index > getSize() / 2) {
                    pointer = getTail();
                    int cont = 0;
                    while (cont <= (getSize() - index -1) && pointer.getPrevious()!= getTail()) {
                        pointer = pointer.getPrevious();
                        cont++;
                    }
                    Nodo temp = pointer.getNext();
                    pointer.setNext(temp.getNext());
                    temp.getNext().setPrevious(pointer);
                    temp.setNext(null);
                    temp.setPrevious(null);
                    size--;
                    
                } else {
                    pointer = getHead();
                    int cont = 0;
                    while (cont < (index-1) && pointer.getNext()!= getHead()) {
                        pointer = pointer.getNext();
                        cont++;
                    }
                    Nodo temp = pointer.getNext();
                    pointer.setNext(temp.getNext());
                    temp.getNext().setPrevious(pointer);
                    temp.setNext(null);
                    temp.setPrevious(null);
                    size--;
                }
            }
        }
        return null;
    }
    
    public Object getElement(int index){
        if (isEmpty()){
            return null;
        } else{
            Nodo pointer = getHead();
            int cont = 0;
            while (cont < index && pointer.getNext() != getHead()){
                pointer = pointer.getNext();
                cont++;
            }
            return pointer.getElement();
        }
    }
    
    public void printList(){
        for (int i = 0; i < getSize(); i++) {
            Object elemento = getElement(i);
            System.out.println("Lista:"+elemento);
        }
    }
}
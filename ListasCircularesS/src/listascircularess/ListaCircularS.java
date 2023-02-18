/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listascircularess;

public class ListaCircularS {
    private Nodo head;
    private Nodo tail;
    private int size;

    public ListaCircularS() {
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
    
    public Nodo insertBegin(Object element){
        Nodo node = new Nodo(element);
        if (isEmpty()){
            node.setNext(node);
            setHead(node);
            setTail(node);
        } else {
            node.setNext(getHead());
            getTail().setNext(node);
            setHead(node);
        }
        size++;
        return node;
    }
    
    public Nodo append(Object element){
        Nodo node = new Nodo(element);
        if (isEmpty()){
            node.setNext(node);
            setHead(node);
            setTail(node);
        } else{
            Nodo pointer = getHead();
            while (pointer.getNext() != getHead()){
                pointer = pointer.getNext();
            }
            pointer.setNext(node);
            node.setNext(getHead());
            setTail(node);
        }
        size++;
        return node;
    }
    
    public Nodo deleteBegin(){
        if (!isEmpty()){
            Nodo pointer = getHead();
            setHead(pointer.getNext());
            getTail().setNext(getHead());
            pointer.setNext(null);
            size--;
            return pointer;
        }
        return null;
    }
    
    public Nodo deleteFinal(){
        if (!isEmpty()){
            if (getSize() == 1){
                setHead(null);
                size--;
                
            } else{
                Nodo pointer = getHead();
                while (pointer.getNext().getNext() != getHead()){
                    pointer = pointer.getNext();
                }
                pointer.getNext().setNext(null);
                Nodo nodeReturn = pointer.getNext();
                setTail(pointer);
                pointer.setNext(getHead());
                size--;
                return nodeReturn;
            }
        }
        return null;
    }
    
    public Object getElemento(int index){
        if (isEmpty()){
            return "La lista está vacía";
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
            Object element = getElemento(i);
            System.out.println("Elemento: "+element);
        }
    }
}

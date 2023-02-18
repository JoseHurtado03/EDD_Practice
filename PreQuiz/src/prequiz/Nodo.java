/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prequiz;

/**
 *
 * @author Usuario
 */
public class Nodo {
    private int element;
    private Nodo next;
    private Nodo previous;
    
    public Nodo(int elemento){
        this.element = elemento;
        this.next = null;
        this.previous = null;
    }

    /**
     * @return the element
     */
    public int getElement() {
        return element;
    }

    /**
     * @param element the element to set
     */
    public void setElement(int element) {
        this.element = element;
    }

    /**
     * @return the next
     */
    public Nodo getNext() {
        return next;
    }

    /**
     * @param next the next to set
     */
    public void setNext(Nodo next) {
        this.next = next;
    }

    /**
     * @return the previous
     */
    public Nodo getPrevious() {
        return previous;
    }

    /**
     * @param previous the previous to set
     */
    public void setPrevious(Nodo previous) {
        this.previous = previous;
    }
}

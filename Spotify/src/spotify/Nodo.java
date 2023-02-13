/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spotify;

public class Nodo {
    private Song element;
    private Nodo next;

    public Nodo(Song element) {
        this.element = element;
        this.next = null;
    }

    /**
     * @return the element
     */
    public Song getElement() {
        return element;
    }

    /**
     * @param element the element to set
     */
    public void setElement(Song element) {
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
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listascirculares2;

public class Nodo {
    private int element;
    private Nodo next;
    private Nodo previous;

    public Nodo(int elemento) {
        this.element = elemento;
        this.next = null;
        this.previous = null;
    }

    public int getElement() {
        return element;
    }

    public void setElement(int elemento) {
        this.element = elemento;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo siguiente) {
        this.next = siguiente;
    }

    public Nodo getPrevious() {
        return previous;
    }

    public void setPrevious(Nodo previous) {
        this.previous = previous;
    }
}

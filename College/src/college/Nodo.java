/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package college;

/**
 *
 * @author Usuario
 */
public class Nodo {
    private Student element;
    private Nodo next;
    private Nodo previous;
    
    public Nodo(Student student){
        this.element = student;
        this.next = null;
        this.previous = null;
    }

    /**
     * @return the element
     */
    public Student getStudent() {
        return element;
    }

    /**
     * @param student the element to set
     */
    public void setElement(Student student) {
        this.element = student;
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

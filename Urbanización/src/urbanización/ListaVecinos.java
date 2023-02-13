/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package urbanización;

import javax.swing.JOptionPane;

public class ListaVecinos {
    private NodoVecino head;
    private int size;

    public ListaVecinos() {
        this.head = null;
        this.size = 0;
    }

    /**
     * @return the head
     */
    public NodoVecino getHead() {
        return head;
    }

    /**
     * @param head the head to set
     */
    public void setHead(NodoVecino head) {
        this.head = head;
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
        return head == null;
    }
    
    public NodoVecino insertBegin(NodoVecino vecino) {
        if (isEmpty()) {
            setHead(vecino);
        } else {
            vecino.setNext(getHead());
            setHead(vecino);
        }
        size++;
        return vecino;
    }
    
    public NodoVecino appendVecino(NodoVecino vecino){
        if (isEmpty()){
            insertBegin(vecino);
        } else{
            NodoVecino pointer = getHead();
            while (pointer.getNext() != null){
                pointer = pointer.getNext();
            }
            pointer.setNext(vecino);
        } 
        size++;
        return vecino;
    } 
    
    public void ShowVecinos(){
        if (isEmpty()){
            JOptionPane.showMessageDialog(null, "La lista de apartamentos está vacía");
        } else {
            NodoVecino pointer = getHead();
            String completeShow = "";
            for (int i = 0; i < getSize(); i++) {
                completeShow += "Nombre: " + pointer.getName() + "\n";
                pointer = pointer.getNext();
            }
            JOptionPane.showMessageDialog(null, completeShow);
        }
    }
}

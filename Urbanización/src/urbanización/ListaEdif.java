/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package urbanización;

import javax.swing.JOptionPane;

public class ListaEdif {
    private NodoEdificio head;
    private int size;

    public ListaEdif() {
        this.head = null;
        this.size = 0;
    }

    /**
     * @return the head
     */
    public NodoEdificio getHead() {
        return head;
    }

    /**
     * @param head the head to set
     */
    public void setHead(NodoEdificio head) {
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
    
    public NodoEdificio insertBegin(NodoEdificio edificio) {
        if (isEmpty()) {
            setHead(edificio);
        } else {
            edificio.setNext(getHead());
            setHead(edificio);
        }
        size++;
        return edificio;
    }
    
    public NodoEdificio appendEdificio(NodoEdificio edificio){
        if (isEmpty()){
            insertBegin(edificio);
        } else{
            NodoEdificio pointer = getHead();
            while (pointer.getNext() != null){
                pointer = pointer.getNext();
            }
            pointer.setNext(edificio);
        } 
        size++;
        return edificio;
    } 
    
    public void ShowEdifs(){
        if (isEmpty()){
            JOptionPane.showMessageDialog(null, "La lista de apartamentos está vacía");
        } else {
            NodoEdificio pointer = getHead();
            String completeShow = "";
            for (int i = 0; i < getSize(); i++) {
                completeShow += "Nombre de Edificio: " + pointer.getEdifName() + "\n";
                pointer = pointer.getNext();
            }
            JOptionPane.showMessageDialog(null, completeShow);
        }
    }
}

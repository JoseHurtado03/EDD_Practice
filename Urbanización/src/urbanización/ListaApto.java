/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package urbanización;

import javax.swing.JOptionPane;

public class ListaApto {
    private NodoApartamento head;
    private int size;

    public ListaApto() {
        this.head = null;
        this.size = 0;
    }

    /**
     * @return the head
     */
    public NodoApartamento getHead() {
        return head;
    }

    /**
     * @param head the head to set
     */
    public void setHead(NodoApartamento head) {
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
    
    public NodoApartamento insertBegin(NodoApartamento apartamento) {
        if (isEmpty()) {
            setHead(apartamento);
        } else {
            apartamento.setNext(getHead());
            setHead(apartamento);
        }
        size++;
        return apartamento;
    }
    
    public NodoApartamento appendApto(NodoApartamento apartamento){
        if (isEmpty()){
            insertBegin(apartamento);
        } else{
            NodoApartamento pointer = getHead();
            while (pointer.getNext() != null){
                pointer = pointer.getNext();
            }
            pointer.setNext(apartamento);
        } 
        size++;
        return apartamento;
    } 
    
    public void ShowAptos(){
        if (isEmpty()){
            JOptionPane.showMessageDialog(null, "La lista de apartamentos está vacía");
        } else {
            NodoApartamento pointer = getHead();
            String completeShow = "";
            for (int i = 0; i < getSize(); i++) {
                completeShow += "Número de Apto: " + pointer.getNumApto() + "\n";
                pointer = pointer.getNext();
            }
            JOptionPane.showMessageDialog(null, completeShow);
        }
    }
}

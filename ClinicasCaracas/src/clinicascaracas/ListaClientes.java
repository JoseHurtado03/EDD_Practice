/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicascaracas;

public class ListaClientes {
    private Nodo head;
    private int size;

    public ListaClientes() {
        this.head = null;
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
    
    public Nodo insertBegin(Cliente cliente) {
        Nodo node = new Nodo(cliente);
        if (isEmpty()) {
            setHead(node);
        } else {
            node.setNext(head);
            setHead(node);
        }
        size++;
        return node;
    }
    
    public Nodo insertFinal(Cliente cliente){
        Nodo node = new Nodo(cliente);
        if (isEmpty()) {
            setHead(node);
        } else {
            Nodo pointer = getHead();
            while (pointer.getNext() != null) {
                pointer = pointer.getNext();
            }
            pointer.setNext(node);
        }
        size++;
        return node;
    }
    
    public Nodo insertInIndex(int index, Cliente cliente) {
        Nodo node = new Nodo(cliente);
        if (isEmpty()) {
            setHead(node);
        } else {
            if (index > getSize()) {
                System.out.println("The index is bigger than the size");
                return insertFinal(cliente);
            } else {
                Nodo pointer = getHead();
                int cont = 0;
                while (cont < (index-1) && pointer.getNext() != null) {
                    pointer = pointer.getNext();
                    cont++;
                }
                node.setNext(pointer.getNext());
                pointer.setNext(node);
            }
        }
        size++;
        return node;
    }
    
    public Nodo deleteBegin(){
        if (!isEmpty()){
            Nodo pointer = getHead();
            setHead(pointer.getNext());
            pointer.setNext(null);
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
                while (pointer.getNext() != null && pointer.getNext().getNext() != null){
                    pointer = pointer.getNext();
                }
                Nodo nodeReturn = pointer.getNext();
                pointer.setNext(null);
                size--;
                return nodeReturn;
            }
        }
        return null;
    }
    
    public Nodo deleteInIndex(int index) {
        if (!isEmpty()){
            Nodo pointer = getHead();
            if (index > getSize()) {
                System.out.println("The index is bigger than the size");
                return deleteFinal();
            } else {
                int cont = 0;
                while (cont < (index -1) && pointer.getNext() != null){
                    pointer = pointer.getNext();
                    cont++;
                }
                Nodo temp = pointer.getNext();
                pointer.setNext(temp.getNext());
                temp.setNext(null);
                size--;
            }
        }
        return null;
    }
    
    public Cliente getCliente(int index) {
        if (isEmpty()) {
            return null;
        } else {
            Nodo pointer = getHead();
            int cont = 0;
            while (cont < index && pointer.getNext() != null) {
                pointer = pointer.getNext();
                cont++;
            }
            return pointer.getCliente();
        }
    }
    
    public void printList(){
        for (int i = 0; i < getSize(); i++) {
            Cliente cliente = getCliente(i);
            System.out.println("Lista:"+cliente.getName()+" "+cliente.getLast_name()+" "+cliente.getDni()+" "+cliente.getAge()+" "+cliente.getSexo());
        }
    }
}

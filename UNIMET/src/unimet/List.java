/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unimet;

interface ListMethods<T>{
    String print(T element);
}

public class List <T>{
    private ListMethods listMethods;
    private Nodo head;
    private int size;
    
    public List(){
        this.head = null;
        this.size = 0;
    }
    
    public List(ListMethods listMethods){
        this.listMethods = listMethods;
        this.head = null;
        this.size = 0;
    }    
    public Nodo getHead() {
        return head;
    }
    
    public void setHead(Nodo head) {
        this.head = head;
    }
    
    public int getSize() {
        return size;
    }
    
    public void setSize(int size) {
        this.size = size;
    }
    
    public boolean isEmpty(){
        return head == null;
    }
    
    public Nodo appendBegin(T element){
        Nodo node = new Nodo(element);
        if (isEmpty()){
            setHead(node);
        } else{
            node.setNext(head);
            setHead(node); 
        }
        size++;
        return node;
    }
    
    public Nodo append(T element){
        Nodo node = new Nodo(element);
        if (isEmpty()){
            setHead(node);
        } else{
            Nodo pointer = getHead();
            while (pointer.getNext() != null){
                pointer = pointer.getNext();
            }
            pointer.setNext(node);
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
    
    public Nodo deleteLast(){
        if (!isEmpty()){
            Nodo pointer = getHead();
            if (getSize() == 1){
                setHead(null);
                size--;
            } else{
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
    
    public Nodo deleteInIndex(int index){
        if (!isEmpty()){
            Nodo pointer = getHead();
            if (index > getSize()){
                System.out.println("El índice es más grande que el tamaño de la lista");
                return deleteLast();
            } else{
                int cont = 0;
                while (cont < (index-1) && pointer.getNext() != null){
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
    
    public Nodo getElement(int index){
        Nodo pointer = getHead();
        int cont = 0;
        while (cont < index){
            pointer = pointer.getNext();
        }
        return pointer;
    }
    
    public String printList(){
        Nodo node = getHead();
        String list = "";
        while (node != null){
            list += this.listMethods.print(node.getElement())+"\n";
            node = node.getNext();
        }
        return list;
    }
}

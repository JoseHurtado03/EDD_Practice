/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listassarray;

public class ListaSArray {
    private int first;
    private int last;
    private int size;
    private Nodo[] array;

    public ListaSArray(int maxSize) {
        this.first = -1;
        this.last = -1;
        this.size = 0;
        this.array = new Nodo[maxSize];
    }

    /**
     * @return the first
     */
    public int getFirst() {
        return first;
    }

    /**
     * @param first the first to set
     */
    public void setFirst(int first) {
        this.first = first;
    }

    /**
     * @return the last
     */
    public int getLast() {
        return last;
    }

    /**
     * @param last the last to set
     */
    public void setLast(int last) {
        this.last = last;
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

    /**
     * @return the array
     */
    public Nodo[] getArray() {
        return array;
    }

    /**
     * @param array the array to set
     */
    public void setArray(Nodo[] array) {
        this.array = array;
    }
    
    public boolean isEmpty(){
        return getFirst() == -1;
    }
    
    public void emptyArray(){
        this.first = -1;
        this.last = -1;
        this.size = 0;
        this.array = new Nodo[this.array.length];
    }
    
    public boolean isFull(){
        return getSize() == this.array.length;
    }
    
    public int searchEmptySlot(){
        for (int i = 0; i < this.array.length; i++) {
            if (this.array[i] == null){
                return i;
            }
        }
        return -1;
    }
    
    public void insertBegin(Object element){
        if (!isFull()){
            Nodo node = new Nodo(element);
            int position = this.searchEmptySlot();
            this.array[position] = node;
            if (isEmpty()){
                this.first = this.last = position;
            } else {
                this.array[position].setNext(this.first);
                this.first = position;
            }
        }
        this.size++;
    }
    
    public void append(Object element){
        if (!isFull()){
            Nodo node = new Nodo(element);
            int position = this.searchEmptySlot();
            this.array[position] = node;
            if (isEmpty()){
                this.first = this.last = position;
            } else {
                this.array[this.last].setNext(position);
                this.last = position;
            }
        }
        this.size++;
    }
    
    public void insertOrdered(Object element){
        if (!isFull()){
            if (isEmpty()) {
                this.insertBegin(element);
            } else if (String.valueOf(element).compareToIgnoreCase(String.valueOf(this.array[this.first].getElement())) <= 0){
                this.insertBegin(element);
            } else if (String.valueOf(element).compareToIgnoreCase(String.valueOf(this.array[this.last].getElement())) >= 0){
                this.append(element);
            } else{
                int previous = this.first;
                int current = this.array[this.first].getNext();
                while (String.valueOf(element).compareToIgnoreCase(String.valueOf(this.array[current].getElement())) > 0){
                    previous = current;
                    current = this.array[current].getNext();
                }
                Nodo node = new Nodo(element);
                int position = this.searchEmptySlot();
                this.array[position] = node;
                this.array[previous].setNext(position);
                this.array[position].setNext(current);
                size++;
            }   
        }
    }
    
    public void printList(){
        String list = "";
        int position = this.first;
        while (position != -1){
            list += this.array[position].getElement()+"\n";
            position = this.array[position].getNext();
        }
        System.out.println(list);
    }
}

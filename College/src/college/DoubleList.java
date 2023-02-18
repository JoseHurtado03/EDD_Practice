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
public class DoubleList {
    private Nodo head;
    private Nodo tail;
    private int length;
    
    public DoubleList(){
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public Nodo getHead() {
        return head;
    }

    public void setHead(Nodo head) {
        this.head = head;
    }

    public Nodo getTail() {
        return tail;
    }

    public void setTail(Nodo tail) {
        this.tail = tail;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
    
    public boolean isEmpty(){
        return head == null;
    }
    
    public Nodo insertBegin(Student student){
        Nodo node = new Nodo(student);
        if (isEmpty()){
            setHead(node);
            setTail(node);
            length++;
        } else {
            node.setNext(getHead());
            getHead().setPrevious(node);
            setHead(node);
            Nodo pointer = getHead();
            while (pointer.getNext() != null){
                pointer = pointer.getNext();
            }
            setTail(pointer);
            }
        length++;
        return node;
        }
    public Nodo append(Student student){
        Nodo node = new Nodo(student);
        if (isEmpty()){
            setHead(node);
            setTail(node);
            length++;
        } else {
            Nodo pointer = getHead();
            while (pointer.getNext() != null){
                pointer = pointer.getNext();
            }
            pointer.setNext(node);
            node.setPrevious(pointer);
            setTail(node);     
        }
        length++;
        return node;
    }
    public Nodo insertarInIndex(int index, Student student){
        Nodo node = new Nodo(student);
        if (isEmpty()){
            setHead(node);
            setTail(node);
            length++;
        } else{
            if (index > getLength()){
                System.out.println("El índice es más grande que el tamaño de la lista");
                append(student);
            } else {
                if (index < getLength()/2){
                    Nodo pointer = getTail();
                    int cont = 0;
                    while (cont < (getLength() - index) && pointer.getPrevious()!= null){
                        pointer = pointer.getPrevious();
                        cont++;
                    }
                    node.setNext(pointer.getNext());
                    node.setPrevious(pointer);
                    pointer.getNext().setPrevious(node);
                    pointer.setNext(node);
                } else{
                    Nodo pointer = getHead();
                    int cont = 0;
                    while (cont < index-1 && pointer.getNext() != null){
                        pointer = pointer.getNext();
                        cont++;
                    }
                    node.setNext(pointer.getNext());
                    node.setPrevious(pointer);
                    pointer.getNext().setPrevious(pointer);
                    pointer.setNext(node);
                }
            }
        }
        length++;
        return node;
    }
    public Nodo deleteBegin(){
        if (!isEmpty()){
            if (getLength() == 1){
                setTail(null);
            }
            Nodo pointer = getHead();
            setHead(pointer.getNext());
            pointer.setNext(null);
            length--;
            return pointer;
        }
        return null;
    }
    public Nodo deleteFinal(){
        if (!isEmpty()){
            Nodo pointer = getHead();
            if (getLength() == 1){
                setHead(null);
                length--;
            } else{
                while (pointer.getNext() != null && pointer.getNext().getNext() != null){
                    pointer = pointer.getNext();
                }
                pointer.getNext().setPrevious(null);
                Nodo nodeReturn = pointer.getNext();
                pointer.setNext(null);
                setTail(pointer);
                length--;
                return nodeReturn;
            }
        }
        return null;
    }
    public Nodo deleteInIndex(int index){
        if (!isEmpty()){
            Nodo pointer = getHead();
            if (index > getLength()){
                System.out.println("El índice es más grande que el tamaño de la lista");
                deleteFinal();
            } else{
                if (index > getLength()/2){
                    pointer = getTail();
                    int cont = 0;
                    while (cont < (getLength()-index) && pointer.getPrevious() != null){
                        pointer = pointer.getPrevious();
                        cont++;
                    }
                    Nodo temp = pointer.getNext();
                    pointer.setNext(temp.getNext());
                    temp.getNext().setPrevious(pointer);
                    temp.setNext(null);
                    temp.setPrevious(null);
                    length--;
                } else{
                    pointer = getHead();
                    int cont = 0;
                    while (cont < (index-2) && pointer.getNext() != null){
                        pointer = pointer.getNext();
                        cont++;
                    }
                    Nodo temp = pointer.getNext();
                    pointer.setNext(temp.getNext());
                    temp.getNext().setPrevious(pointer);
                    temp.setNext(null);
                    temp.setPrevious(null);
                    length--;
                }
            }
        }
        return null;
    }
    public Student getStudents(int index) {
        if (isEmpty()) {
            return null;
        } else {
            Nodo pointer = getHead();
            int cont = 0;
            while (cont < index && pointer.getNext() != null) {
                pointer = pointer.getNext();
                cont++;
            }
            return pointer.getStudent();
        }
    }
    public String printList(){
        String information = "";
        for (int i = 0; i < getLength()-1; i++) {
            Student student = getStudents(i);
            information += "Nombre: "+student.getName()+" Edad: "+student.getAge()+" Año: "+student.getYear()+"\n";
        }
        return information;
    }
    
    public String searchStudent(String name){
        Nodo pointer = getHead();
        for (int i = 0; i < getLength(); i++) {
            if (!pointer.getStudent().getName().equalsIgnoreCase(name)){
                pointer = pointer.getNext();
            } else{
                return "Nombre: "+pointer.getStudent().getName()+" Edad: "+pointer.getStudent().getAge()+" Año: "+pointer.getStudent().getYear()+"\n"+"Nota de Matemáticas: "+pointer.getStudent().getMathGrade()+"\nNota de Lenguaje: "+pointer.getStudent().getLenguageGrade();
            }
        }
        return "El estudiante no se encontró :(";
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prequiz;

public class Main {

    public static void main(String[] args) {
        DoubleList listUno = new DoubleList();
        DoubleList listDos = new DoubleList();
        Function func = new Function();
        listUno.append(1);
        listUno.append(2);
        listUno.append(3);
        listUno.append(4);
        listUno.append(5);
        listDos.append(3);
        listDos.append(4);
        listDos.append(5);
        listDos.append(6);
        listDos.append(7);
        ListGroup lists = func.createLists(listUno, listDos);
        System.out.println("LISTA UNIÓN");
        lists.getUnion().printList();
        System.out.println("\nLISTA INTERSECCIÓN");
        lists.getIntersection().printList();
        System.out.println("\nLISTA COMPLEMENTO");
        lists.getComplement().printList();
    }
    
}

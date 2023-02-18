/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listascirculares;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
//        Lista Circular Doblemente Enlazada
        ListaCircularD list = new ListaCircularD();
        list.append("Hola");
        list.append("Uno");
        list.append("Dos");
        list.append("Tres");
        list.append("Cuatro");
        list.insertBegin("I");
        list.append("F");
        list.printList();
    }
    
}

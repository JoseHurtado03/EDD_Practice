/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasdobles;

public class Main {

    public static void main(String[] args) {
        ListaDoble list = new ListaDoble();
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);
        list.append(6);
        list.append(7);
        list.append(8);
        list.append(9);
        list.append(10);
        System.out.println("LISTA ORIGINAL");
        list.printList();
        System.out.println(" ");
        System.out.println("LISTA PROBANDO EL MÉTODO");
        list.deleteInIndex(20);
        list.printList();
    }
    
}

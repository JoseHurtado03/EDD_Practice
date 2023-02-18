/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listassarray;

public class Main {

    public static void main(String[] args) {
        ListaSArray list = new ListaSArray(10);
        list.insertOrdered("José");
        list.insertOrdered("Alexander");
        list.insertOrdered("Bárbara");
        list.insertOrdered("Ztefanny");
        list.insertOrdered("Aaron");
        list.printList();
    }
    
}

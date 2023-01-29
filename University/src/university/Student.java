/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package university;

/**
 *
 * @author Usuario
 */
public class Student {
    private String name;
    private String last_name;
    private int dni;
    private String trimester;
    public void showStudent(String name, String last_name, int dni, String trimester){
        this.name = name;
        this.last_name = last_name;
        this.dni = dni;
        this.trimester = trimester;
        System.out.println("Nombre: "+name);
        System.out.println("Apellido: "+last_name);
        System.out.println("Cédula: "+dni);
        System.out.println("Trimestre N°: "+trimester);
        
        
    }
}

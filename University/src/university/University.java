/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package university;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class University {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("****BIENVENIDO****");
        int pass_k = 0;
        while (pass_k == 0){
            System.out.println("");
            System.out.println("1- Registrar estudiante");
            System.out.println("2- Ver estudiantes");
            System.out.println("3- Salir");
            System.out.println("");
            System.out.print("Ingresa la opción que deseas realizar: ");
            Scanner sc = new Scanner(System.in);
            int option = sc.nextInt();
            if (option == 1){
                List<Student> students = new ArrayList<Student>();
                System.out.print("Nombre del estudiante: ");
                String name = sc.nextLine();
                System.out.print("Apellido del estudiante: ");
                String last_name = sc.nextLine();
                System.out.print("Cédula del estudiante: ");
                int dni = sc.nextInt();
                System.out.print("Trimestre del estudiante: ");
                String trimester = sc.nextLine();
                Student student = new Student();
            } else if (option == 2){
                
            } else if (option == 3){
                
            } else{
                System.out.println("¡ERROR! Opción inválida");
                pass_k++;
            }
        }
    }
    
}

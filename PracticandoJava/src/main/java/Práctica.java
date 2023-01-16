/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
import java.util.Scanner;
public class Práctica {
    public static void main(String[] args){
        System.out.println("¡Hola mundo!");
        System.out.println(" ");
        System.out.println("Estoy prácticando la programación en Java.");
        System.out.println("Es muy diferente a Python, pero necesito aprenderlo");
        System.out.println("Además, ahora tengo que programar en NetBeans :(");
        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe en letras el número que quieras imprimir (1,2,3) ");
        String num = sc.nextLine();
        if (num.equals ("uno")){
           System.out.println("1");
        } else if (num.equals("dos")){
            System.out.println("2");
        } else if (num.equals("tres")){
            System.out.println("3");
        } else{
            System.out.println("Número fuera del rango [1,3]");
        }
    }
}

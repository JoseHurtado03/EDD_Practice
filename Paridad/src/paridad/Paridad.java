/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paridad;

/**
 *
 * @author Usuario
 */
import java.util.Scanner;
import javax.swing.JOptionPane;        
public class Paridad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Números Pares o Impares");
        String num_s = JOptionPane.showInputDialog("Ingresa un número: ");
        int num = Integer.parseInt(num_s);
        if (num % 2 == 0){
            JOptionPane.showMessageDialog(null, "El número es PAR");
        } else{
            JOptionPane.showMessageDialog(null, "El número es IMPAR");
        }
    }
    
}

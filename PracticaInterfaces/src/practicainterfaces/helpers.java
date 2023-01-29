/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicainterfaces;

import javax.swing.JOptionPane;


public class helpers {
    public static int validarNumero(String numString){
        int num;
        try{
            num = Integer.parseInt(numString);
            return num;
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "¡ERROR! El input es un número");
        }
        return 0;
    }
}

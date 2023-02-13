/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicascaracas;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Validaciones {
    public int validarNum(String numString){
        int num;
        try{
            num = Integer.parseInt(numString);
            return num;
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "¡ERROR! Debe ser un número");
        }
        return 0;
    }
}

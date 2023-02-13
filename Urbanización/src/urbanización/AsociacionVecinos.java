/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package urbanización;

import javax.swing.JOptionPane;

public class AsociacionVecinos {
    private ListaEdif edificios;
    private ListaVecinos vecinos;

    public AsociacionVecinos() {
        this.edificios = new ListaEdif();
        this.vecinos = new ListaVecinos();
    }
    
    public NodoVecino searchVecino(int dni){
        NodoVecino pointer = vecinos.getHead();
        boolean found = false;
        while (!found && pointer != null){
            if (pointer.getDni() == dni){
                found = true;
                JOptionPane.showMessageDialog(null, "Nombre: "+ pointer.getName());
            } else{
                pointer = pointer.getNext();
            }
        }
        if (found){
            return pointer;
        } else{
            JOptionPane.showMessageDialog(null, "No se encontró el vecino");
            return null;
        }
    }
    
    public NodoApartamento searchApto(int dni){
        NodoVecino pointer = vecinos.getHead();
        NodoApartamento apto = null;
        boolean found = false;
        while (!found && pointer != null){
            if (pointer.getDni() == dni){
                found = true;
                apto = pointer.getApartamento();
                JOptionPane.showMessageDialog(null, "Número de Apartamento: "+apto.getNumApto() + "Nombre del Edificio: "+ apto.getEdificio());
            } else{
                pointer = pointer.getNext();
            }
        }
        if (found){
            return apto;
        } else{
            JOptionPane.showMessageDialog(null, "No se encontró el apartamento");
            return null;
        }
    }
    
    public NodoEdificio searchEdif(NodoApartamento apto){
        NodoEdificio pointer = edificios.getHead();
        boolean found = false;
        while (!found & pointer != null){
            if (apto.getEdificio().getEdifName() == pointer.getEdifName()){
                found = true;
                JOptionPane.showMessageDialog(null, "Nombre del Edificio: "+ pointer.getEdifName());
            } else{
                pointer = pointer.getNext();
            }
        }
        if (found){
            return pointer;
        } else{
            JOptionPane.showMessageDialog(null, "No se encontró el edificio");
            return null;
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicainterfaces;

/**
 *
 * @author Usuario
 */
public class Contador {
    private int numero;

    public Contador(int numero) {
        this.numero = numero;
    }

    public Contador() {
        this.numero = 0;
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }
    public void sumar(int num){
        numero += num; 
    }
    public void restar(int num){
        numero -= num;
    }
    public void multiplicar(int num){
        numero = num*numero;
    }
    public void setNumero(int num){
        this.numero = numero;
    }
}

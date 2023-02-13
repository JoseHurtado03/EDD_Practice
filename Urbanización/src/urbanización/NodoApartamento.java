/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package urbanización;

public class NodoApartamento {
    private NodoApartamento next;
    private int NumApto;
    private ListaVecinos vecinos;
    private NodoEdificio edificio;

    public NodoApartamento(int NumApto) {
        this.next = null;
        this.NumApto = NumApto;
        this.vecinos = new ListaVecinos();
        this.edificio = null;
    }

    /**
     * @return the next
     */
    public NodoApartamento getNext() {
        return next;
    }

    /**
     * @param next the next to set
     */
    public void setNext(NodoApartamento next) {
        this.next = next;
    }

    /**
     * @return the NumApto
     */
    public int getNumApto() {
        return NumApto;
    }

    /**
     * @param NumApto the NumApto to set
     */
    public void setNumApto(int NumApto) {
        this.NumApto = NumApto;
    }

    /**
     * @return the vecinos
     */
    public ListaVecinos getVecinos() {
        return vecinos;
    }

    /**
     * @param vecinos the vecinos to set
     */
    public void setVecinos(ListaVecinos vecinos) {
        this.vecinos = vecinos;
    }

    /**
     * @return the edificio
     */
    public NodoEdificio getEdificio() {
        return edificio;
    }

    /**
     * @param edificio the edificio to set
     */
    public void setEdificio(NodoEdificio edificio) {
        this.edificio = edificio;
    }
    
    
}

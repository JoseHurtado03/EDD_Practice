/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package urbanización;

public class NodoVecino {
    private NodoVecino next;
    private String name;
    private int dni;
    private int tlfNum;
    private NodoApartamento apartamento;

    public NodoVecino(String name, int dni, int tlfNum) {
        this.next = null;
        this.name = name;
        this.dni = dni;
        this.tlfNum = tlfNum;
        this.apartamento = null;
    }

    /**
     * @return the next
     */
    public NodoVecino getNext() {
        return next;
    }

    /**
     * @param next the next to set
     */
    public void setNext(NodoVecino next) {
        this.next = next;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the dni
     */
    public int getDni() {
        return dni;
    }

    /**
     * @param dni the dni to set
     */
    public void setDni(int dni) {
        this.dni = dni;
    }

    /**
     * @return the tlfNum
     */
    public int getTlfNum() {
        return tlfNum;
    }

    /**
     * @param tlfNum the tlfNum to set
     */
    public void setTlfNum(int tlfNum) {
        this.tlfNum = tlfNum;
    }

    /**
     * @return the apartamento
     */
    public NodoApartamento getApartamento() {
        return apartamento;
    }

    /**
     * @param apartamento the apartamento to set
     */
    public void setApartamento(NodoApartamento apartamento) {
        this.apartamento = apartamento;
    }
    
    
}

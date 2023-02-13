/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package urbanización;

public class NodoEdificio {
    private NodoEdificio next;
    private String edifName;
    private ListaApto apartamentos;

    public NodoEdificio(String edifName) {
        this.next = null;
        this.edifName = edifName;
        this.apartamentos = new ListaApto();
    }

    /**
     * @return the next
     */
    public NodoEdificio getNext() {
        return next;
    }

    /**
     * @param next the next to set
     */
    public void setNext(NodoEdificio next) {
        this.next = next;
    }

    /**
     * @return the edifName
     */
    public String getEdifName() {
        return edifName;
    }

    /**
     * @param edifName the edifName to set
     */
    public void setEdifName(String edifName) {
        this.edifName = edifName;
    }

    /**
     * @return the apartamentos
     */
    public ListaApto getApartamentos() {
        return apartamentos;
    }

    /**
     * @param apartamentos the apartamentos to set
     */
    public void setApartamentos(ListaApto apartamentos) {
        this.apartamentos = apartamentos;
    }
    
    
}

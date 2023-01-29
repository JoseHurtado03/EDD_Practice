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
public class Global {
    private static Contador counter = new Contador();

    /**
     * @return the count
     */
    public static Contador getCounter() {
        return counter;
    }

    /**
     * @param aCount the count to set
     */
    public static void setCounter(Contador aCount) {
        counter = aCount;
    }

    static void getCounter(Contador counter) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

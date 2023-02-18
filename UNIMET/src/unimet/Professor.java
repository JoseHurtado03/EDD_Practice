/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unimet;

public class Professor {
    private String name;
    private int dni;
    private String subject;

    public Professor(String name, int dni, String subject) {
        this.name = name;
        this.dni = dni;
        this.subject = subject;
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
     * @return the subject
     */
    public String getSubject() {
        return subject;
    }

    /**
     * @param subject the subject to set
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }
    
    public String printProfessor(){
        return "Nombre: "+getName()+"\nCédula: "+getDni()+"\nMateria: "+getSubject()+"\n";
    }
}

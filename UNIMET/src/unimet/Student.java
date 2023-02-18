/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unimet;

public class Student {
    private String name;
    private int dni;
    private String career;

    public Student(String name, int dni, String career) {
        this.name = name;
        this.dni = dni;
        this.career = career;
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
     * @return the career
     */
    public String getCareer() {
        return career;
    }

    /**
     * @param career the career to set
     */
    public void setCareer(String career) {
        this.career = career;
    }
    
    public String printStudent(){
        return "Nombre: "+getName()+"\nCédula: "+getDni()+"\nCarrera: "+getCareer()+"\n";
    }
}

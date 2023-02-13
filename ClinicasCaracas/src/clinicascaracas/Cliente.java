/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicascaracas;

public class Cliente {
    private String name;
    private String last_name;
    private int dni;
    private int age;
    private String sexo;
    private boolean seguro;
    private String estudio;

    public Cliente(String name, String last_name, int dni, int age, String sexo, boolean seguro, String estudio) {
        this.name = name;
        this.last_name = last_name;
        this.dni = dni;
        this.age = age;
        this.sexo = sexo;
        this.seguro = seguro;
        this.estudio = estudio;
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
     * @return the last_name
     */
    public String getLast_name() {
        return last_name;
    }

    /**
     * @param last_name the last_name to set
     */
    public void setLast_name(String last_name) {
        this.last_name = last_name;
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
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the sexo
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the seguro
     */
    public boolean isSeguro() {
        return seguro;
    }

    /**
     * @param seguro the seguro to set
     */
    public void setSeguro(boolean seguro) {
        this.seguro = seguro;
    }

    /**
     * @return the estudio
     */
    public String getEstudio() {
        return estudio;
    }

    /**
     * @param estudio the estudio to set
     */
    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }
    
    
    
}

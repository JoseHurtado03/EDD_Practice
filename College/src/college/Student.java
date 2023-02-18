/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package college;

public class Student {
    private String name;
    private int age;
    private int year;
    private int mathGrade;
    private int lenguageGrade;

    public Student(String name, int age, int year, int mathGrade, int lenguageGrade) {
        this.name = name;
        this.age = age;
        this.year = year;
        this.mathGrade = mathGrade;
        this.lenguageGrade = lenguageGrade;
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
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * @return the mathGrade
     */
    public int getMathGrade() {
        return mathGrade;
    }

    /**
     * @param mathGrade the mathGrade to set
     */
    public void setMathGrade(int mathGrade) {
        this.mathGrade = mathGrade;
    }

    /**
     * @return the lenguageGrade
     */
    public int getLenguageGrade() {
        return lenguageGrade;
    }

    /**
     * @param lenguageGrade the lenguageGrade to set
     */
    public void setLenguageGrade(int lenguageGrade) {
        this.lenguageGrade = lenguageGrade;
    }
    
}
    

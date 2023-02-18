/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package college;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import javax.swing.JOptionPane;


public class Function {
    public DoubleList readData(){
        DoubleList students = new DoubleList();
        String line;
        String students_txt = "";
        String path = "test\\students.txt";
        File file = new File(path);
        try{
            if (!file.exists()){
                file.createNewFile();
            }else{
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                while ((line = br.readLine()) != null){
                   if (!line.isEmpty()){
                       students_txt += line + "\n";
                   } 
                }
                if (!"".equals(students_txt)){
                    String[] students_split = students_txt.split("\n");
                    for (int i = 0; i < students_split.length; i++) {
                        String[] aStudent = students_split[i].split("/");
                        String name = aStudent[0];
                        int age = Integer.parseInt(aStudent[1]);
                        int year = Integer.parseInt(aStudent[2]);
                        int mathGrade = Integer.parseInt(aStudent[3]);
                        int lenguageGrade = Integer.parseInt(aStudent[4]);
                        Student student = new Student(name, age, year, mathGrade, lenguageGrade);
                        students.append(student);
                    }
                }
                br.close();
                JOptionPane.showMessageDialog(null, "Carga de datos exitosa");
            }
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error al leer la lista de estudiantes");
        }
        return students;
    }
    
//    public void saveData(DoubleList students){
//        String current_students = "";
//        if (!students.isEmpty()){
//            Nodo pointer = students.getHead();
//            for (int i = 0; i < students.getLength(); i++) {
//                current_students += pointer.getStudent().getName()+"/"+pointer.getStudent().getAge()+"/"+pointer.getStudent().getYear()+"/"+pointer.getStudent().getMathGrade()+"/"+pointer.getStudent().getLenguageGrade()+"\n";
//                pointer = pointer.getNext();
//            }
//        }
//        try{
//            PrintWriter pw = new PrintWriter("test\\students.txt");
//            pw.print(current_students);
//            pw.close();
//            JOptionPane.showMessageDialog(null, "Datos guardadados exitosamente");
//        } catch(Exception e){
//            JOptionPane.showMessageDialog(null, e);
//        }
//    }
}
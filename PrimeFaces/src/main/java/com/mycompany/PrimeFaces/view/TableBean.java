/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.PrimeFaces.view;

import com.mycompany.PrimeFaces.models.Student;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author dt532
 */
@Named(value = "tableBean")
@RequestScoped
public class TableBean {
    
    private List<Student> students;
    
    public TableBean(){
        students = new ArrayList<>();
        students.add(new Student("Dominik", "Tomkiewicz", 4.30));
        students.add(new Student("Wojciech", "Marciniak", 4.89));
        students.add(new Student("Mikolaj", "Mierzejewski", 3.89));
        students.add(new Student("Wojciech", "Rzeczycki", 4.32));
    }

    /**
     * @return the students
     */
    public List<Student> getStudents() {
        return students;
    }

    /**
     * @param students the students to set
     */
    public void setStudents(List<Student> students) {
        this.students = students;
    }
    
}

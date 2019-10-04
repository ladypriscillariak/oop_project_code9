/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.iuea.oop.modal;


public class CourseUnit {
    
    private int id;
    private String name;
    private double creditUnit;
    private String description;
    private String content;
    private String courseCode;
    private String year;

    public CourseUnit() {
    }

    public CourseUnit(int id, String name, double creditUnit, String description, String content, String courseCode, String year) {
        this.id = id;
        this.name = name;
        this.creditUnit = creditUnit;
        this.description = description;
        this.content = content;
        this.courseCode = courseCode;
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCreditUnit() {
        return creditUnit;
    }

    public void setCreditUnit(double creditUnit) {
        this.creditUnit = creditUnit;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

   
}

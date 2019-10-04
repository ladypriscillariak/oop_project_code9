/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.iuea.oop.modal;


public class Grade {
    private int id;
    private double assignment;
    private double courseWork;
    private double practical;
    private double presentation;
    private double exam;
    private double finalMark;
    private double courseGrade;
    private int studentId;

    public Grade() {
    }

    public Grade(int id, double assignment, double courseWork, double practical, double presentation, double exam, double finalMark, double courseGrade, int studentId) {
        this.id = id;
        this.assignment = assignment;
        this.courseWork = courseWork;
        this.practical = practical;
        this.presentation = presentation;
        this.exam = exam;
        this.finalMark = finalMark;
        this.courseGrade = courseGrade;
        this.studentId = studentId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAssignment() {
        return assignment;
    }

    public void setAssignment(double assignment) {
        this.assignment = assignment;
    }

    public double getCourseWork() {
        return courseWork;
    }

    public void setCourseWork(double courseWork) {
        this.courseWork = courseWork;
    }

    public double getPractical() {
        return practical;
    }

    public void setPractical(double practical) {
        this.practical = practical;
    }

    public double getPresentation() {
        return presentation;
    }

    public void setPresentation(double presentation) {
        this.presentation = presentation;
    }

    public double getExam() {
        return exam;
    }

    public void setExam(double exam) {
        this.exam = exam;
    }

    public double getFinalMark() {
        return finalMark;
    }

    public void setFinalMark(double finalMark) {
        this.finalMark = finalMark;
    }

    public double getCourseGrade() {
        return courseGrade;
    }

    public void setCourseGrade(double courseGrade) {
        this.courseGrade = courseGrade;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    
    

}

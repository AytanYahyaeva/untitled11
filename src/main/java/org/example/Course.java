package org.example;
//1. Course class-ı yarat
//Field-lər:
//courseName
// capacity
//enrolledStudents
//Bütün field-lər private olsun.
//Constructor yarat.
//Methodlar:
//boolean registerStudent()
//void displayCourseInfo()
//registerStudent() çağırıldıqda:
//
//Əgər capacity dolmayıbsa → enrolledStudents 1 artsın və true qaytarsın.
//Capacity dolubsa → false qaytarsın.
public class Course {
    private String courseName;
    private int capasity;
    private int enrolledStudents;

    public void setCourseName(String courseName){
        this.courseName = courseName;
    }
    public String getCourseName(){
        return courseName;
    }
    public void setCapasity(int capasity){
        this.capasity=capasity;
    }
    public int getCapasity(){
        return capasity;
    }
    public void setEnrolledStudents(int enrolledStudents){
        this.enrolledStudents=enrolledStudents;
    }
    public int getEnrolledStudents(){
        return enrolledStudents;
    }

    public Course(String courseName,int capasity,int enrolledStudents){
        this.courseName = courseName;
        this.capasity = capasity;
        this.enrolledStudents = 0;
    }

    public Course() {
    }

    boolean registerStudent(){
        if (capasity > enrolledStudents){
            enrolledStudents++;
            return true;
        }else {
           return false;
        }

    }
    void displayCourseInfo(){
        System.out.println("Name of the course: " + courseName + " capasity: " + capasity + " enrolled Student " + enrolledStudents);

    }


}

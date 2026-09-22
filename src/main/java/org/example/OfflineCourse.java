package org.example;//package org.example;
//3. OfflineCourse class-ı yarat
//Course-dan inherit etsin.
//Əlavə field:
//roomNumber
//Məsələn:
//        "Room 204"
//displayCourseInfo() methodunu override et.

import org.example.Course;

public class OfflineCourse extends Course {
    public String roomNumber;
    public OfflineCourse(String courseName, int capasity, int enrolledStudents, String roomNumber) {
        setCourseName(courseName);
        setCapasity(capasity);
        setEnrolledStudents(enrolledStudents);
        this.roomNumber = roomNumber;
    }
    @Override
    public void displayCourseInfo(){
        System.out.println("Room " + roomNumber);
    }
}

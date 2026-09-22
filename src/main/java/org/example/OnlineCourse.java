package org.example;
//2. OnlineCourse class-ı yarat
//Course-dan inherit etsin.
//Əlavə field:
//platform
//Məsələn:
//        "Zoom"
//        "Microsoft Teams"
//displayCourseInfo() methodunu override et.
public class OnlineCourse extends Course {
    public String platform;
    public OnlineCourse(String courseName,int capasity,int enrolledStudents,String platform){
        this.platform = platform;
        setCourseName(courseName);
        setCapasity(capasity);
        setEnrolledStudents(enrolledStudents);
    }
    @Override
    public void displayCourseInfo(){
        System.out.println("Platform: " + platform);

    }
}

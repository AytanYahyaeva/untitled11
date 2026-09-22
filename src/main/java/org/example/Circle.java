package org.example;
//4. main() daxilində
//Bir neçə kurs yarat:
//
//Course javaCourse =
//        new OnlineCourse("Java", 2, 0, "Zoom");
//
//Course testingCourse =
//        new OfflineCourse("Software Testing", 3, 0, "Room 204");
//Sonra Java kursuna 3 tələbə qeydiyyatdan keçirməyə çalış.
//
//Məsələn:
//
//        System.out.println(javaCourse.registerStudent());
//        System.out.println(javaCourse.registerStudent());
//        System.out.println(javaCourse.registerStudent());
//Nəticədə:
//
//        true
//        true
//        false
//olmalıdır.
//Daha sonra:
//        javaCourse.displayCourseInfo();
//testingCourse.displayCourseInfo();
//çağır.
public class Circle {
    public static void main(String[] args) {
        Course javaCourse = new OnlineCourse("Java", 2, 0, "Zoom");
        Course testingCourse = new OfflineCourse("Software Testing", 3, 0, "Room 204");
        System.out.println(javaCourse.registerStudent());
        System.out.println(javaCourse.registerStudent());
        System.out.println(javaCourse.registerStudent());

    }
}
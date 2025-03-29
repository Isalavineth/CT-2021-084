package Q_05;

public class Main {
    public static void main(String[] args) {
        //crating an object of Course class
        Course oop = new Course();
        //setting values to the object
        oop.setCourseName("Object Oriented Programming");
        oop.setCourseCode("CTEC22043");

        //creating an object of Lecturer class
        Lecturer kumar = new Lecturer();
        //setting values to the object
        kumar.setLecturerName("Kumar");
        kumar.setCourseTeaching("Object Oriented Programming");

        //creating an object of Student class
        Student sanga = new Student();
        //setting values to the object
        sanga.setStudentName("Sanga");
        sanga.setDegreeName("Information and Communication Technology");
        sanga.setCourseFollowing("Object Oriented Programming");

        //setting lecturerInCharge to the course
        oop.setLecturerInCharge(kumar);

        //displaying the student details
        System.out.println("Student Details: ");
        System.out.println("Name: "+sanga.getStudentName());
        System.out.println("Course Following: "+sanga.getCourseFollowing());
        System.out.println("Degree Name: "+sanga.getDegreeName()+"\n");

        //displaying the course details
        System.out.println("Course Details: ");
        System.out.println("Course Name: "+oop.getCourseName());
        System.out.println("Course Code: "+oop.getCourseCode());
        System.out.println("Lecturer In Charge: "+oop.getLecturerInCharge().getLecturerName()+"\n");

        //displaying the lecturer details
        System.out.println("Lecturer Details: ");
        System.out.println("Lecturer Name: "+kumar.getLecturerName());
        System.out.println("Courses Teaching: "+kumar.getCourseTeaching()+"\n");
    }
}

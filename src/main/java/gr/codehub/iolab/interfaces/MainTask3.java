package gr.codehub.iolab.interfaces;


import gr.codehub.iolab.domain.Course;
import gr.codehub.iolab.domain.CourseEnrollmentException;
import gr.codehub.iolab.domain.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainTask3 {

    private static Logger logger = LoggerFactory.getLogger(MainTask2.class);

    public static void main(String[] args) {
        Student alice = new Student("S001", "Alice Johnson");
        Course cs101 = new Course("CS101", "Introduction to Programming");
        Course cs102 = new Course("CS102", "Data Structures");
        Course cs103 = new Course("CS103", "Algorithms");
        Course cs104 = new Course("CS104", "Software Engineering");
        Course cs105 = new Course("CS105", "Databases");
        Course cs106 = new Course("CS106", "AI Fundamentals");

        try {
            int code = alice.addEnrollment(cs101);
            code = alice.addEnrollment(cs102);
            alice.addEnrollment(cs103);
            alice.addEnrollment(cs104);
            alice.addEnrollment(cs105);
            code = alice.addEnrollment(cs106);
            code = alice.addEnrollment(cs106);
            code = alice.addEnrollment(cs106);
        } catch (CourseEnrollmentException e) {
            logger.error("Something happened in a ThomasBusiness operation: {}", e.getMessage());
        }
    }
}

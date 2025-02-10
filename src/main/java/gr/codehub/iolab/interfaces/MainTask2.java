package gr.codehub.iolab.interfaces;

import gr.codehub.iolab.domain.Course;
import gr.codehub.iolab.domain.CourseEnrollmentException;
import gr.codehub.iolab.domain.Enrollment;
import gr.codehub.iolab.domain.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class MainTask2 {

    private static Logger logger = LoggerFactory.getLogger(MainTask2.class);

    public static void main(String[] args) {
        String className = MainTask2.class.getSimpleName();
        logger.trace("Trace message from {}", className);
        logger.debug("Debug message from {}", className);
        logger.info("Info message from {}", className);
        logger.warn("Warn message from {}", className);
        logger.error("Error message from {}", className);
        System.out.println("Hello world!");

        Student s1 = new Student("ABCD", "Thomas Varsamidis");
        Student s2 = new Student("A199", "Panos Varsamidis");
        List<Student> allStudents = new ArrayList<>();

        allStudents.add(s1);
        allStudents.add(s2);
        allStudents.add(new Student("B543", "Iason Varsamidis"));

        logger.info("The last student in the list is {}", allStudents.getLast().getName());
        Student s3 = allStudents.getLast();

        logger.info("The first student {} has id={}", s1.getName(), s1.getStudentId());

        Course c1 = new Course("C1", "Intro to Databases");

        Enrollment e1 = new Enrollment(s1, c1);

        try {
            s1.addEnrollment(e1);
            s1.addEnrollment(e1);
            s1.addEnrollment(e1);
            s1.addEnrollment(e1);
            s1.addEnrollment(e1);
            s1.addEnrollment(e1);
            s1.addEnrollment(e1);
            s1.addEnrollment(e1);
            s1.addEnrollment(e1);
            s1.addEnrollment(e1);
            s1.addEnrollment(e1);
        } catch (CourseEnrollmentException e) {
            logger.error("Something happened in a ThomasBusiness operation: {}", e.getMessage());
        }
        logger.info("Student {} has enrolled in {} courses",
                s1.getName(),
                s1.getEnrollments().size()
        );

        logger.info("Clearing enrollments");
        s1.clearEnrollments();

        logger.info("Student {} has enrolled in {} courses",
                s1.getName(),
                s1.getEnrollments().size()
        );
    }
}

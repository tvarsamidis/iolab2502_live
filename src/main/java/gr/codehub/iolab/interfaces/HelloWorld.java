package gr.codehub.iolab.interfaces;

import gr.codehub.iolab.domain.Course;
import gr.codehub.iolab.domain.Enrollment;
import gr.codehub.iolab.domain.Student;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class HelloWorld {

//    private static final Logger logger = LoggerFactory.getLogger(HelloWorld.class);

    private static final ch.qos.logback.classic.Logger logger =
            (ch.qos.logback.classic.Logger) LoggerFactory.getLogger(HelloWorld.class);

    public static void main(String[] args) {
        logger.info("This is the logger speaking!");
        logger.warn("This is a warning!");
        logger.error("The code reached an error case");
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


        s1.getEnrollments().add(e1);
        s1.getEnrollments().add(e1);
        s1.getEnrollments().add(e1);

        logger.info("Student {} has enrolled in {} courses",
                s1.getName(),
                s1.getEnrollments().size()
                );

    }
}

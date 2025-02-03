package gr.codehub.iolab.interfaces;

import gr.codehub.iolab.domain.Course;
import gr.codehub.iolab.domain.Enrollment;
import gr.codehub.iolab.domain.Student;
import org.slf4j.LoggerFactory;

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
        logger.info("The first student {} has id={}", s1.getName(), s1.getStudentId());

        Course c1 = new Course("C1", "Intro to Databases");

        Enrollment e1 = new Enrollment(s1, c1);

        logger.info("Student {} enrolled in course {}", e1.getStudent().getName(),
                e1.getCourse().getTitle());



    }
}

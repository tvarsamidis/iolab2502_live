package gr.codehub.iolab.interfaces;

import ch.qos.logback.classic.Level;
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

        Student s1 = new Student("ABCD", "Thomas Student2");
        logger.info("The first student {} has id={}", s1.getName(), s1.getId());

    }
}

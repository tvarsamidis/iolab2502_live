package gr.codehub.iolab;

import ch.qos.logback.classic.Level;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloWorld {

//    private static final Logger logger = LoggerFactory.getLogger(HelloWorld.class);

    private static final ch.qos.logback.classic.Logger logger =
            (ch.qos.logback.classic.Logger) LoggerFactory.getLogger(HelloWorld.class);

    public static void main(String[] args) {
        logger.setLevel(Level.WARN);
        logger.info("This is the logger speaking!");
        logger.warn("This is a warning!");
        logger.error("The code reached an error case");
        System.out.println("Hello world!");
    }
}

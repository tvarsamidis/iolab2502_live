package gr.codehub.iolab.interfaces;

import gr.codehub.iolab.domain.Enrollment;
import gr.codehub.iolab.infrastructure.CsvDataLoader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.List;

public class MainTask4 {
    private static Logger logger = LoggerFactory.getLogger(MainTask2.class);

    public static void main(String[] args) throws IOException {
        List<Enrollment> enrollments = CsvDataLoader.loadEnrollmentByNIO("data/enrollments.csv");
        for (Enrollment e: enrollments) {
            logger.info("{}: {}", e.getStudent().getName(), e.getCourse().getTitle());
        }
    }
}

package gr.codehub.iolab.infrastructure;

import gr.codehub.iolab.domain.Course;
import gr.codehub.iolab.domain.Enrollment;
import gr.codehub.iolab.domain.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvDataLoader {
    private static Logger logger = LoggerFactory.getLogger(CsvDataLoader.class);

    public static List<Enrollment> loadEnrollmentByNIO(String filePath) throws IOException {
        // List<String> lines = Files.readAllLines(Path.of("data/enrollments.csv"));
        List<Enrollment> enrollments = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("\\s*,\\s*");
                Student s = new Student(parts[0], parts[1]);
                Course c = new Course(parts[2], parts[3]);
                enrollments.add(new Enrollment(s, c));
            }
        }
        return enrollments;
    }
}

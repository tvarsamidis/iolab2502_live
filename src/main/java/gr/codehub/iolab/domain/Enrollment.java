package gr.codehub.iolab.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Enrollment {
    // private int enrollmentId; // should be here but ignored for session convenience
    private Student student;
    private Course course;
}

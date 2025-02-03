package gr.codehub.iolab.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Enrollment {

    // private int enrollmentId;

    private Student student;

    private Course course;

}

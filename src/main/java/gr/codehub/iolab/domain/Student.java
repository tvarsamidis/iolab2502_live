package gr.codehub.iolab.domain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Student {

    private static Logger logger = LoggerFactory.getLogger(Student.class);

    private String studentId;
    private String name;
    private Set<Enrollment> enrollments;

    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
        enrollments = new HashSet<>();
    }

    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public List<Enrollment> getEnrollments() {
        List<Enrollment> enrollmentsCopy = new ArrayList<>();
        enrollmentsCopy.addAll(enrollments);
        return enrollmentsCopy;
    }

    public void clearEnrollments() {
        enrollments.clear();
    }

    private boolean isAlreadyEnrolled(Enrollment e){
        return enrollments.contains(e);
    }

    public int addEnrollment(Enrollment e) throws CourseEnrollmentException {
        if (isAlreadyEnrolled(e)) {
            throw new CourseEnrollmentException("Cannot enroll on same course twice");
        } else if (enrollments.size() >= 5) {
            throw new CourseEnrollmentException("Cannot enroll on more than 5 courses");
        } else {
            enrollments.add(e);
            logger.info("ADDED NEW ENROLLMENT FOR STUDENT {}", e.getCourse().getTitle());
            return 0;
        }
    }

    public int addEnrollment(Course c) throws CourseEnrollmentException {
        Enrollment e = new Enrollment(this, c);
        return addEnrollment(e);
    }
}

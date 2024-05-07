package izo.wtamamagementsystem.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Table;

@Entity
@Table(name = "course_details")
public class CourseDetails {
    @Id
    @Column(name = "id_course_details")
    private String idCourseDetails;

    @Column(name = "id_student")
    private String idStudent;

    @Column(name = "id_lesson")
    private String idLesson;

    @Column(name = "grade")
    private String grade;

    // Getters and Setters
}
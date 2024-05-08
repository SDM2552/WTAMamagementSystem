package izo.wtamamagementsystem.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Table;


@Entity
@Table(name = "CourseApply")
public class CourseApply {
    @Id
    @Column(name = "id_course_apply")
    private int idCourseApply;

    @Column(name = "course_name")
    private String courseName;

    @Column(name = "couse_apply_date")
    private String couseApplyDate;

    @Column(name = "couse_apply_status")
    private String couseApplyStatus;

    @Column(name = "id_lesson")
    private String idLesson;

    @Column(name = "id_student")
    private String idStudent;

    // Getters and Setters
}
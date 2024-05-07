package izo.wtamamagementsystem.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Table;

//개설강의
@Entity
@Table(name = "lesson")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Lesson {
    @Id
    @Column(name = "id_lesson")
    private String idLesson;

    @Column(name = "course_name", nullable = false)
    private String courseName;

    @Column(name = "assignment", nullable = false)
    private String assignment;

    @Column(name = "credit", nullable = false)
    private int credit;

    @Column(name = "lesson_type", nullable = false)
    private String lessonType;

    @Column(name = "id_schedule", nullable = false)
    private String idSchedule;

    @Column(name = "id_cors", nullable = false)
    private int idCors;

    @Column(name = "id_room", nullable = false)
    private String idRoom;

    @Column(name = "id_prof", nullable = false)
    private String idProf;

    @Column(name = "capacity", nullable = false)
    private String capacity;

    @Column(name = "id_syllabus", nullable = false)
    private String idSyllabus;
}
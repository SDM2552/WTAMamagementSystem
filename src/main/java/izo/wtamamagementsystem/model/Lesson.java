package izo.wtamamagementsystem.model;

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
    private int idLesson;
    //개설강의

    @Column(name = "course_name", nullable = false)
    private String courseName;
    //과정이름

    @Column(name = "assignment", nullable = false)
    private String assignment;
    //과제

    @Column(name = "credit", nullable = false)
    private int credit;
    //학점

    @Column(name = "lesson_type", nullable = false)
    private String lessonType;
    //수업구분

    @Column(name = "id_schedule", nullable = false)
    private String idSchedule;
    //시간표
    
    @Column(name = "id_cors", nullable = false)
    private int idCors;
    //교육과정번호
    
    @Column(name = "id_room", nullable = false)
    private String idRoom;
    //강의실
    
    @Column(name = "id_prof", nullable = false)
    private String idProf;
    //강사번호
    
    @Column(name = "capacity", nullable = false)
    private String capacity;
    //정원
    
    @Column(name = "id_syllabus", nullable = false)
    private String idSyllabus;
    //강의계획서
}
package izo.wtamanagementsystem.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Table;

@Entity
@Table(name = "course_details")
public class CourseDetails {
    @Id
    @Column(name = "id_course_details")
    private int idCourseDetails;
    //학생수강내역

    @Column(name = "id_student")
    private String idStudent;
    //학생번호
    
    @Column(name = "id_lesson")
    private String idLesson;
    //개설강의
    
    @Column(name = "grade")
    private String grade;
    //성적
    
    // Getters and Setters
}
package izo.wtamamagementsystem.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Syllabus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idSyllabus;
    //교과목 개요
    private String course_overview;
    //강의 방식
    private String teaching;
    //교재
    private String book;
    //수업목표
    private String objective;
    //평가 방식
    private String evaluation;
    //비고
    private String remarks;
    //강사번호
    private int idProf;
}

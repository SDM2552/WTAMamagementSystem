package izo.wtamamagementsystem.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
public class Syllabus {
    //id
    private int idSyllabus;
    //교과목 개요
    private String course_overview;
    //교재
    private String book;
    //강의 방식
    private String teaching;
    //평가 방식
    private String evaluation;
    //비고
    private String remarks;
    //강사번호
    private int idProf;
}

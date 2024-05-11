package izo.wtamanagementsystem.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ProgramMid {   //중분류
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDetail;  //세부교육과정코드
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProgram;  //교육과정코드
    private String lessonName;  //교육명
    private int lessonMember;   //수강정원
    private int idProf; //교수id
    private int lecFee; //강의료

}

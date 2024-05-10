package izo.wtamanagementsystem.model;

import lombok.Data;

@Data
public class ProgramMid {   //중분류
    private int idDetail;  //세부교육과정코드
    private int idProgram;  //교육과정코드
    private String lessonName;  //교육명
    private int lessonMember;   //수강정원
    private int idProf; //교수id
    private int lecFee; //강의료

}

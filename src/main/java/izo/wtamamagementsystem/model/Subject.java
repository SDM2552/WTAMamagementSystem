package izo.wtamamagementsystem.model;

import lombok.Data;

@Data
public class Subject {
    private int id_subject;  //과목
    private String subject_name;    //과목이름
    private String subject_type;    //과목구분
    private String subject_code;    //과목코드
}

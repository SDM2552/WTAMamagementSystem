package izo.wtamamagementsystem.model;

import lombok.Data;

@Data
public class Lmt_cors_mst {

    private int id_cors; //교육과정번호
    private String cors_nm; //교육과정명
    private String ent_yr; //입학년도
    private String sel_cd;  //모집전형번호[YYYY999]
    private String nth_cd;  //기수코드
    private String stas_cors_div;   //통계용과정구분
    private String dtl_cors_div;    //상세과정구분
    private String cors_cont;   //수업내용
    private String time_brf;    //강의시간요약
    private String cors_brf;    //수업내용요약
    private int std_credit;     //이수기준학점
    private String id_subject;  //과목

}

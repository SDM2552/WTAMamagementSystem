package izo.wtamamagementsystem.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ClassRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idClassRequest;
    //개설강좌정보
    private String classInfo;
    //본 수업일자
    private String classDate;
    //보강일자
    private String makeUpDate;
    //보강 사유
    private String remarks;
    //보강신청일시
    private String appDate;
    //보강처리일시
    private String procDate;
    //(신청)교수번호
    private int idProf;
}

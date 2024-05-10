package izo.wtamamagementsystem.entity;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
public class Program {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProgram; //교육과정코드
    private String programName; //교육분류명
    private String progDesc;    //교육과정내용
}

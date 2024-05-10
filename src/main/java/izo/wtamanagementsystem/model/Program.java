package izo.wtamanagementsystem.model;

import lombok.Data;

@Data
public class Program {
    private int idProgram; //교육과정코드
    private String programName; //교육분류명
    private String progDesc;    //교육과정내용
}

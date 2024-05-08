package izo.wtamamagementsystem.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//교육과정정보
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Imt_cors_mstDTO {
    private int id_cors_mst;
    private String corsNm;
    private String entYr;
    private String selCd;
    private String nthCd;
    private String stasCorsDiv;
    private String dtlCorsDiv;
    private String corsCont;
    private String timeBrf;
    private String corsBrf;
    private int stdCredit;
    private String idSubject;

}
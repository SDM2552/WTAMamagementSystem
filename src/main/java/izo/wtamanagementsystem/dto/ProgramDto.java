package izo.wtamanagementsystem.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProgramDto {
    private int idProgram; //교육과정코드
    private String programName; //교육분류명
    private String progDesc;    //교육과정내용
}

package izo.wtamanagementsystem.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Course_applyDTO {
    private int id_Course_Apply;
    private String courseName;
    private String couseApplyDate;
    private String couseApplyStatus;
    private String idLesson;
    private String idStudent;
    private String idDetail;
}
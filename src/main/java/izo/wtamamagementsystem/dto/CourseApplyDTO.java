package izo.wtamamagementsystem.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CourseApplyDTO {
    private String idCourseApply;
    private String courseName;
    private String couseApplyDate;
    private String couseApplyStatus;
    private String idLesson;
    private String idStudent;
}
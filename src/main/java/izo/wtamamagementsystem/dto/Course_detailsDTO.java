package izo.wtamamagementsystem.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Course_detailsDTO {
    private String idCourseDetails;
    private String idStudent;
    private String idLesson;
    private String grade;

}
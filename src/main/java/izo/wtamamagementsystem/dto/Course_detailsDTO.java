package izo.wtamamagementsystem.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Course_detailsDTO {
    private int id_course_Details;
    private int id_student;
    private int id_lesson;
    private String grade;

}
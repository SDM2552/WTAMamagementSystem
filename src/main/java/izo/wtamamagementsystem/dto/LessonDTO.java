package izo.wtamamagementsystem.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//개설강의
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LessonDTO {
    private int id_lesson;
    private String courseName;
    private int credit;
}
package izo.wtamamagementsystem.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//개설강의
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LessonDTO {
    private String idLesson;
    private String courseName;
    private int credit;
}
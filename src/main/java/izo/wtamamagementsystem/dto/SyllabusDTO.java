package izo.wtamamagementsystem.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SyllabusDTO {
    private int id_syllabus;
    private String course_overview;
    private String book;

}
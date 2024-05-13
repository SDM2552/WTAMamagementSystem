package izo.wtamanagementsystem.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CompletionDTO {

    private int id_completion;
    private String id_student;
    private String course;
    private String score;
    private Date completetion_date;
}

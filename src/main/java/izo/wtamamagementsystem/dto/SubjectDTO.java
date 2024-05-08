package izo.wtamamagementsystem.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SubjectDTO {
   private int id_subject;
   private String subject_name;
   private String subject_type;
    private String 	subject_code;
}

package izo.wtamanagementsystem.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Program {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProgram; // 교육과정 코드
    private String programName; // 교육 분류명
    private String programDesc; // 교육과정 내용 설명
}
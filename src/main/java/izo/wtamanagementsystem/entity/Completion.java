package izo.wtamanagementsystem.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Completion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCompletion;
    private Long idStudent;
    private String course;
    private String score;
    private String completetionDate;

    // 생성자, 게터, 세터 등의 필요한 메서드를 추가하세요
}

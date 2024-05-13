package izo.wtamanagementsystem.model;

public class Program {
    private Long idProgram; // 프로그램 ID
    private String idCategory; // 카테고리 ID
    private String programName; // 프로그램 이름
    private String startProgram; // 프로그램 시작 날짜
    private String endProgram; // 프로그램 종료 날짜
    private String programTarget; // 프로그램 대상
    private Long idRoom; // 강의실 ID
    private String programMethod; // 프로그램 방법 (예: 이론, 실습)
    private String programDuration; // 프로그램 기간
    private String programExpense; // 프로그램 비용

    // 기본 생성자
    public Program() {}

    // Getter and Setter
    // (Lombok @Data 어노테이션을 사용하여 자동으로 생성할 수도 있습니다.)
}
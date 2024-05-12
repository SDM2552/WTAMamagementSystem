package izo.wtamanagementsystem.model;

public class Program {
    private Long idProgram;           // 프로그램 ID
    private String idCategory;        // 카테고리 ID
    private String programName;       // 프로그램 이름
    private String startProgram;      // 프로그램 시작 날짜
    private String endProgram;        // 프로그램 종료 날짜
    private String programTarget;     // 프로그램 대상
    private Long idRoom;              // 강의실 ID
    private String programMethod;     // 프로그램 방법 (이론, 실기 등)
    private String programPer;        // 프로그램 기간
    private String programExpense;    // 프로그램 비용

    // Constructors
    public Program() {}

    // Getter and Setter methods
    public Long getIdProgram() {
        return idProgram;
    }

    public void setIdProgram(Long idProgram) {
        this.idProgram = idProgram;
    }

    public String getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(String idCategory) {
        this.idCategory = idCategory;
    }

    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }

    public String getStartProgram() {
        return startProgram;
    }

    public void setStartProgram(String startProgram) {
        this.startProgram = startProgram;
    }

    public String getEndProgram() {
        return endProgram;
    }

    public void setEndProgram(String endProgram) {
        this.endProgram = endProgram;
    }

    public String getProgramTarget() {
        return programTarget;
    }

    public void setProgramTarget(String programTarget) {
        this.programTarget = programTarget;
    }

    public Long getIdRoom() {
        return idRoom;
    }

    public void setIdRoom(Long idRoom) {
        this.idRoom = idRoom;
    }

    public String getProgramMethod() {
        return programMethod;
    }

    public void setProgramMethod(String programMethod) {
        this.programMethod = programMethod;
    }

    public String getProgramPer() {
        return programPer;
    }

    public void setProgramPer(String programPer) {
        this.programPer = programPer;
    }

    public String getProgramExpense() {
        return programExpense;
    }

    public void setProgramExpense(String programExpense) {
        this.programExpense = programExpense;
    }
}
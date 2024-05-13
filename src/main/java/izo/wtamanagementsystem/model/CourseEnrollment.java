package izo.wtamanagementsystem.model;

public class CourseEnrollment {
    private Long idEnrollment; // 수강 등록의 고유 식별자
    private Long idStudent;    // 학생의 고유 식별자
    private Long idProgram;    // 프로그램의 고유 식별자
    private String enrollmentDate; // 등록 날짜

    // 기본 생성자
    public CourseEnrollment() {}

    // 모든 필드를 포함하는 생성자
    public CourseEnrollment(Long idEnrollment, Long idStudent, Long idProgram, String enrollmentDate) {
        this.idEnrollment = idEnrollment;
        this.idStudent = idStudent;
        this.idProgram = idProgram;
        this.enrollmentDate = enrollmentDate;
    }

    // 게터 및 세터 메소드
    public Long getIdEnrollment() {
        return idEnrollment;
    }

    public void setIdEnrollment(Long idEnrollment) {
        this.idEnrollment = idEnrollment;
    }

    public Long getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(Long idStudent) {
        this.idStudent = idStudent;
    }

    public Long getIdProgram() {
        return idProgram;
    }

    public void setIdProgram(Long idProgram) {
        this.idProgram = idProgram;
    }

    public String getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(String enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }
}
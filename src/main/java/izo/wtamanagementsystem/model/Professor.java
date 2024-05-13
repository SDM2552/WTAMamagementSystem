package izo.wtamanagementsystem.model;


public class Professor extends User {
    private String faculty;

    public Professor() {
        super();  // 상속받은 User 클래스의 생성자 호출
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }
}

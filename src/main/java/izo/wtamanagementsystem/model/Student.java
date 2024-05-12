package izo.wtamanagementsystem.model;

public class Student extends User {
    private String major;

    public Student() {
        super();  // 상속받은 User 클래스의 생성자 호출
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
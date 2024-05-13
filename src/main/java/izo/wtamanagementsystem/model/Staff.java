package izo.wtamanagementsystem.model;

public class Staff extends User {
    private String department;

    public Staff() {
        super();  // 상속받은 User 클래스의 생성자 호출
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
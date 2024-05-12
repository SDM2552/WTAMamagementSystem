package izo.wtamanagementsystem.model;

public class User {
    private Long id;  // ID 타입을 Long으로 변경
    private String loginId;
    private String password;
    private String role;  // 역할 (예: STUDENT, PROFESSOR 등)
    private String registDate;  // 등록 날짜

    // Constructors, Getters, and Setters
    public User() {}

    public User getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getRegistDate() {
        return registDate;
    }

    public void setRegistDate(String registDate) {
        this.registDate = registDate;
    }
}
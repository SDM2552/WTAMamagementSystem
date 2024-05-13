package izo.wtamanagementsystem.model;

<<<<<<< HEAD
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
=======
import lombok.Data;

@Data
public class Professor {

    private int idProf;
    //이름
    private String name;
    //생년월일
    private String birth;
    //연락처
    private String tel;
    //성별
    private String gender;
    //주소
    private String address;
    //회원번호
    private int idUser;
}
>>>>>>> master

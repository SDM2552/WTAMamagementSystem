package izo.wtamanagementsystem.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProfessorDTO {
   private int id_prof;
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
    private int id_user;

}

package izo.wtamanagementsystem.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {

  private  int id_user;
  private String name;
  private Date birth;
  private String tel;
  private int id_users;
  private String password;
  private String email;
  private String role;
}

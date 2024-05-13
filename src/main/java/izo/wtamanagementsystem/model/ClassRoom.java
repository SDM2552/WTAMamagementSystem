package izo.wtamanagementsystem.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
public class ClassRoom {


    private int roomId;    //강의실코드
    private String roomName;   //강의실명

}

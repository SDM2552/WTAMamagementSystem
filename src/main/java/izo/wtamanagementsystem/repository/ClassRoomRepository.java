package izo.wtamanagementsystem.repository;


import izo.wtamanagementsystem.model.ClassRoom;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ClassRoomRepository {

    public int insert(ClassRoom classRoom);
    public int update(int roomId);
    public int delete(int roomId);

}

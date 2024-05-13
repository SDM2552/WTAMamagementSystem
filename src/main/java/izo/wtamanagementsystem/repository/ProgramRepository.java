package izo.wtamanagementsystem.repository;


import izo.wtamanagementsystem.model.Program;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProgramRepository {

    public int insert(Program program);
    public int update(int pgmId);
    public int delete(int pgmId);

}

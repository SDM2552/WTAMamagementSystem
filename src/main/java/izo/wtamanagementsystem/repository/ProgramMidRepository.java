package izo.wtamanagementsystem.repository;


import izo.wtamanagementsystem.model.Program;
import izo.wtamanagementsystem.model.ProgramMid;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProgramMidRepository {

    public int insert(ProgramMid programMid);
    public int update(int programId);
    public int delete(int programId);

}

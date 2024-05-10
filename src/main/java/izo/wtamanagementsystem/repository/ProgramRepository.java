package izo.wtamanagementsystem.repository;


import izo.wtamanagementsystem.model.Program;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProgramRepository {

    public void insert(Program program);
}

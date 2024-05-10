package izo.wtamamagementsystem.repository;

import izo.wtamamagementsystem.model.Program;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProgramRepository {

    public void insert(Program program);
}

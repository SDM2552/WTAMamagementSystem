package izo.wtamanagementsystem.repository;


import izo.wtamanagementsystem.model.ClassRomm;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CategoryRepository {

    public int insert(ClassRomm category);
    public int update(int cateId);
    public int delete(int cateId);

}

package izo.wtamanagementsystem.repository;


import izo.wtamanagementsystem.model.Category;
import izo.wtamanagementsystem.model.ClassRoom;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CategoryRepository {

    public int insert(Category category);
    public int update(int cateId);
    public int delete(int cateId);

}

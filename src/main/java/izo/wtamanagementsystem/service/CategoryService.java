package izo.wtamanagementsystem.service;


import izo.wtamanagementsystem.model.Category;
import izo.wtamanagementsystem.model.ClassRoom;
import izo.wtamanagementsystem.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public List<ClassRoom> getAllPrograms() {
        List<ClassRoom> category = new ArrayList<>();
        return category;
    }

    public int insertCategory(Category category) {
        int insertCategory = categoryRepository.insert(category);
        return insertCategory;
    }

    public int updateCategory(int cateId) {
        int updateCategory = categoryRepository.update(cateId);
        return updateCategory;
    }

    public int deleteCategory(int cateId) {
        int deleteCategory = categoryRepository.delete(cateId);
        return deleteCategory;
    }

}

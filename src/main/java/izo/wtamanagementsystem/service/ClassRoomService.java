package izo.wtamanagementsystem.service;

import izo.wtamanagementsystem.model.ClassRoom;
import izo.wtamanagementsystem.repository.CategoryRepository;
import izo.wtamanagementsystem.repository.ClassRoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClassRoomService {
    @Autowired
    private ClassRoomRepository classRoomRepository;

    public List<ClassRoom> getAllPrograms() {
        List<ClassRoom> classRoom = new ArrayList<>();
        return classRoom;
    }

    public int insertCategory(ClassRoom category) {
        int insertCategory = classRoomRepository.insert(category);
        return insertCategory;
    }

    public int updateCategory(int cateId) {
        int updateCategory = classRoomRepository.update(cateId);
        return updateCategory;
    }

    public int deleteCategory(int cateId) {
        int deleteCategory = classRoomRepository.delete(cateId);
        return deleteCategory;
    }

}

package izo.wtamanagementsystem.service;

import izo.wtamanagementsystem.mapper.CourseMapper;
import izo.wtamanagementsystem.model.CourseEnrollment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
    @Autowired
    private CourseMapper courseMapper;

    public void enrollCourse(CourseEnrollment enrollment) {
        courseMapper.enrollCourse(enrollment);
    }

    public void withdrawCourse(Long enrollmentId) {  // int를 Long으로 변경
        courseMapper.withdrawCourse(enrollmentId);
    }

    public boolean canEnroll(Long user) {
        // 여기서는 User 객체의 role을 확인합니다.
        return user != null && "STUDENT".equals(user.getRole());
    }

    public void enrollCourse(Long idStudent, Long idProgram) {
    }
}
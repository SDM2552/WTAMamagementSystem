package izo.wtamanagementsystem.service;

import izo.wtamanagementsystem.mapper.CourseMapper;
import izo.wtamanagementsystem.model.CourseEnrollment;
import izo.wtamanagementsystem.model.User;
import izo.wtamanagementsystem.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
    @Autowired
    private CourseMapper courseMapper;

    @Autowired
    private UserRepository userRepository; // UserRepository 추가

    public void enrollCourse(CourseEnrollment enrollment) {
        courseMapper.enrollCourse(enrollment);
    }

    public void withdrawCourse(Long idEnrollment) {
        courseMapper.withdrawCourse(idEnrollment);
    }

    public boolean canEnroll(Long userId) {
        // 데이터베이스에서 User 객체를 검색
        User user = userRepository.findById(userId).orElse(null);
        // User 객체가 null이 아니고, 역할이 STUDENT인지 확인
        return user != null && "STUDENT".equals(user.getRole());
    }

    public void enrollCourse(Long idStudent, Long idProgram) {
        CourseEnrollment enrollment = new CourseEnrollment();
        enrollment.setIdStudent(idStudent);
        enrollment.setIdProgram(idProgram);
        // 현재 날짜를 등록 날짜로 설정 (실제 사용시에는 적절한 날짜 처리 필요)
        enrollment.setEnrollmentDate(new java.util.Date().toString()); // 날짜 설정 예제
        courseMapper.enrollCourse(enrollment);
    }
}
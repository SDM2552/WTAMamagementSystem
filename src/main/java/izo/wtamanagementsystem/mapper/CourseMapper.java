package izo.wtamanagementsystem.mapper;

import izo.wtamanagementsystem.model.CourseEnrollment;
import org.apache.ibatis.annotations.*;

public interface CourseMapper {
    @Insert("INSERT INTO course_enrollment (id_student, id_program, enrollment_date) VALUES (#{idStudent}, #{idProgram}, #{enrollmentDate})")
    void enrollCourse(CourseEnrollment enrollment);

    @Update("UPDATE course_enrollment SET status = 'withdrawn_pending' WHERE id_enrollment = #{idEnrollment}")
    void withdrawCourse(Long idEnrollment);  // int를 Long으로 변경
}
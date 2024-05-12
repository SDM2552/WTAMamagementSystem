package izo.wtamanagementsystem.mapper;

import izo.wtamanagementsystem.model.CourseEnrollment;
import org.apache.ibatis.annotations.*;

public interface CourseMapper {
    @Insert("INSERT INTO course_enrollment (student_id, program_id, enrollment_date) VALUES (#{studentId}, #{programId}, #{enrollmentDate})")
    void enrollCourse(CourseEnrollment enrollment);

    @Update("UPDATE course_enrollment SET status = 'withdrawn_pending' WHERE enrollment_id = #{enrollmentId}")
    void withdrawCourse(Long enrollmentId);  // int를 Long으로 변경
}
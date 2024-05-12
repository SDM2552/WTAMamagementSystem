CREATE TABLE `Syllabus` (
                            `id_program` VARCHAR(20) NOT NULL COMMENT '수N',
                            `course_overview` TEXT NOT NULL,
                            `objective` TEXT NOT NULL,
                            `teaching` TEXT NOT NULL,
                            `book` TEXT NOT NULL,
                            `evaluation` TEXT NOT NULL,
                            `remarks` TEXT NOT NULL,
                            `id_professor` VARCHAR(20) NOT NULL,
                            PRIMARY KEY (`id_program`),
                            FOREIGN KEY (`id_program`) REFERENCES `program` (`id_program`)
);

CREATE TABLE `students` (
                            `id_student` VARCHAR(20) NOT NULL,
                            `name` VARCHAR(10) NOT NULL,
                            `birth` VARCHAR(14) NOT NULL,
                            `tel` VARCHAR(20) NOT NULL,
                            `address` VARCHAR(100) NOT NULL,
                            `gender` VARCHAR(10) NOT NULL,
                            `id_user` VARCHAR(20) NOT NULL,
                            PRIMARY KEY (`id_student`)
);

CREATE TABLE `class_Request` (
                                 `id_class_request` VARCHAR(20) NOT NULL,
                                 `class_date` VARCHAR(10) NOT NULL,
                                 `make_up_date` VARCHAR(10) NOT NULL,
                                 `remarks` TEXT NOT NULL,
                                 `app_date` VARCHAR(10) NOT NULL,
                                 `proc_date` VARCHAR(10) NOT NULL,
                                 `id_professor` VARCHAR(20) NOT NULL,
                                 `id_week` VARCHAR(20) NOT NULL,
                                 `id_program` VARCHAR(20) NOT NULL COMMENT '수N',
                                 PRIMARY KEY (`id_class_request`)
);

CREATE TABLE `professor` (
                             `id_professor` VARCHAR(20) NOT NULL,
                             `name` TEXT NOT NULL,
                             `birth` VARCHAR(10) NOT NULL,
                             `tel` VARCHAR(20) NOT NULL,
                             `gender` VARCHAR(10) NOT NULL,
                             `address` TEXT NOT NULL,
                             `id_user` VARCHAR(20) NOT NULL,
                             PRIMARY KEY (`id_professor`)
);

CREATE TABLE `user` (
                        `id_user` VARCHAR(20) NOT NULL,
                        `login_id` VARCHAR(20) NOT NULL,
                        `password` VARCHAR(20) NOT NULL,
                        `role` VARCHAR(10) NOT NULL,
                        `regist_date` VARCHAR(10) NOT NULL,
                        PRIMARY KEY (`id_user`)
);

CREATE TABLE `admin` (
                         `id_admin` VARCHAR(20) NOT NULL,
                         `name` VARCHAR(10) NOT NULL,
                         `birth` VARCHAR(14) NOT NULL,
                         `tel` VARCHAR(20) NOT NULL,
                         `address` VARCHAR(100) NOT NULL,
                         `id_user` VARCHAR(50) NOT NULL,
                         `gender` VARCHAR(5) NOT NULL,
                         `id_user2` VARCHAR(20) NOT NULL,
                         PRIMARY KEY (`id_admin`)
);

CREATE TABLE `course_apply` (
                                `id_course_apply` VARCHAR(20) NOT NULL,
                                `course_name` VARCHAR(20) NOT NULL,
                                `course_apply_date` VARCHAR(10) NOT NULL,
                                `course_apply_status` VARCHAR(20) NOT NULL,
                                `id_student` VARCHAR(20) NOT NULL,
                                `id_lecture_detail` VARCHAR(20) NOT NULL,
                                PRIMARY KEY (`course_apply_id`)
);

CREATE TABLE `program` (
                           `id_program` VARCHAR(20) NOT NULL COMMENT '수N',
                           `id_category` VARCHAR(20) NOT NULL,
                           `program_name` TEXT NOT NULL COMMENT '드론취득과정',
                           `start_program` VARCHAR(10) NOT NULL,
                           `end_program` VARCHAR(10) NOT NULL,
                           `program_target` TEXT NOT NULL,
                           `id_room` VARCHAR(20) NOT NULL,
                           `program_method` TEXT NOT NULL COMMENT '이론,실기',
                           `program_per` TEXT NOT NULL,
                           `program_expense` VARCHAR(20) NOT NULL,
                           PRIMARY KEY (`id_program`)
);

CREATE TABLE `classroom` (
                             `id_room` VARCHAR(20) NOT NULL COMMENT '수N',
                             `room_name` VARCHAR(20) NOT NULL,
                             PRIMARY KEY (`id_room`)
);

CREATE TABLE `notice` (
                          `id_notice` VARCHAR(20) NOT NULL,
                          `title` TEXT NOT NULL,
                          `content` TEXT NOT NULL,
                          `created_time` VARCHAR(19) NOT NULL,
                          `views` INT NOT NULL,
                          PRIMARY KEY (`id_notice`)
);

CREATE TABLE `exam_submission` (
                                   `id_submission` VARCHAR(20) NOT NULL,
                                   `id_program` VARCHAR(20) NOT NULL COMMENT '수N',
                                   `id_exam` VARCHAR(20) NOT NULL,
                                   `id_student` VARCHAR(20) NOT NULL,
                                   `id_file` VARCHAR(20) NOT NULL,
                                   PRIMARY KEY (`id_submission`)
);

CREATE TABLE `exam` (
                        `id_exam` VARCHAR(20) NOT NULL,
                        `name` TEXT NOT NULL,
                        `start_time` VARCHAR(19) NOT NULL,
                        `end_time` VARCHAR(19) NOT NULL,
                        `status` VARCHAR(20) NOT NULL,
                        `count` VARCHAR(20) NOT NULL,
                        `description` TEXT NOT NULL,
                        `id_program` VARCHAR(20) NOT NULL COMMENT '수N',
                        `id_professor` VARCHAR(20) NOT NULL,
                        `id_file` VARCHAR(20) NOT NULL,
                        PRIMARY KEY (`id_exam`)
);

CREATE TABLE `file` (
                        `id_file` VARCHAR(20) NOT NULL,
                        `id_subfile` VARCHAR(20) NOT NULL,
                        `origin_filename` TEXT NOT NULL,
                        `save_filename` TEXT NOT NULL,
                        `file_path` TEXT NOT NULL,
                        PRIMARY KEY (`id_file`, `id_subfile`)
);

CREATE TABLE `attendance` (
                              `id_lecture_detail` VARCHAR(20) NOT NULL,
                              `id_student` VARCHAR(20) NOT NULL,
                              `division` VARCHAR(10) NOT NULL,
                              PRIMARY KEY (`id_lecture_detail`, `id_student`),
                              FOREIGN KEY (`id_student`) REFERENCES `students` (`id_student`)
);

CREATE TABLE `category` (
                            `id_category` VARCHAR(20) NOT NULL COMMENT '수N',
                            `category_name` VARCHAR(100) NOT NULL COMMENT '명V100',
                            PRIMARY KEY (`id_category`)
);

CREATE TABLE `schedule` (
                            `id_schedule` VARCHAR(20) NOT NULL,
                            `id_program` VARCHAR(20) NOT NULL COMMENT '수N',
                            `schedule` TEXT NOT NULL,
                            `start_schedule` VARCHAR(10) NOT NULL,
                            `end_schedule` VARCHAR(10) NOT NULL,
                            `learning_contents` TEXT NOT NULL,
                            `learning_detail` TEXT NOT NULL,
                            `note` TEXT NOT NULL,
                            PRIMARY KEY (`id_schedule`, `id_program`),
                            FOREIGN KEY (`id_program`) REFERENCES `Syllabus` (`id_program`)
);

CREATE TABLE `student_status` (
                                  `id_student_status` VARCHAR(20) NOT NULL,
                                  `sub_day` VARCHAR(10) NOT NULL,
                                  `attendance_time` VARCHAR(19) NOT NULL,
                                  `absence_time` VARCHAR(19) NOT NULL,
                                  `lateness` VARCHAR(20) NOT NULL,
                                  `mid_exam` VARCHAR(20) NOT NULL,
                                  `final_exam` VARCHAR(20) NOT NULL,
                                  `converted_mark` VARCHAR(20) NOT NULL,
                                  `id_student` VARCHAR(20) NOT NULL,
                                  `id_program` VARCHAR(20) NOT NULL COMMENT '수N',
                                  PRIMARY KEY (`id_student_status`)
);

CREATE TABLE `completion` (
                              `id_completion` INT NOT NULL,
                              `attendance` VARCHAR(50) NOT NULL COMMENT 'FK',
                              `assignment_or` TEXT NOT NULL COMMENT 'FK',
                              `completion_date` VARCHAR(10) NOT NULL,
                              `completion_status` VARCHAR(20) NOT NULL,
                              PRIMARY KEY (`id_completion`)
);

-- 조인용테이블(수강내역)
CREATE TABLE `course_enrollment` (
                                     `id_enrollment` INT AUTO_INCREMENT PRIMARY KEY,
                                     `id_student` VARCHAR(20),
                                     `id_program` VARCHAR(20),
                                     `enrollment_date` VARCHAR(40),
                                     FOREIGN KEY (`id_student`) REFERENCES `students` (`id_student`),
                                     FOREIGN KEY (`id_program`) REFERENCES `program` (`id_program`)
);
-- 데이터베이스 users테이블에 role추가, 역할구분
ALTER TABLE users
    ADD COLUMN role VARCHAR(255) NOT NULL DEFAULT 'STUDENT';
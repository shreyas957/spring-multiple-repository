package org.example.testing;

import org.example.testing.student.Student;
import org.example.testing.student.StudentRepo;
import org.example.testing.teacher.Teacher;
import org.example.testing.teacher.TeacherRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TestingApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestingApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(StudentRepo studentRepo, TeacherRepo teacherRepo) {
        return args -> {
            studentRepo.save(new Student("John", "Doe", 20, "Math"));
            teacherRepo.save(new Teacher("Jane", "Doe", 30, "Math"));
        };
    }
}

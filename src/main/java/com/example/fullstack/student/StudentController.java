package com.example.fullstack.student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/students")
public class StudentController {
    @GetMapping
    public List<Student> getAllStudents() {
        List<Student> students = Arrays.asList(
                new Student(1L,
                        "Oguz",
                        "oevrensel@gmail.com",
                        Gender.MALE),
                new Student(2L,
                        "Uzay",
                        "uzay@hotmail.com",
                        Gender.MALE),
                new Student(3L,
                        "Cem",
                        "cem@hotmail.com",
                        Gender.MALE)
        );
        return students;
    }
}

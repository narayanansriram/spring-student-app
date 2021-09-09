package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.stereotype.Service;

@Service // Same as @Component, @Service is for semantics
public class StudentService {
    public List<Student> getStudents() {
    return List.of(new Student(1L, "Mara",
		"mara@gmail.com", LocalDate.of(1993,Month.FEBRUARY, 5), 28));
	}
}

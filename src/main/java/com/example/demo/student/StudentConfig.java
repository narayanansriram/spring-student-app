package com.example.demo.student;


import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            
     Student mara = new Student("Mara",
		"mara@gmail.com", LocalDate.of(1993, Month.FEBRUARY, 5));

    Student alex = new Student("Alex",
    "alex@gmail.com", LocalDate.of(1939, Month.NOVEMBER, 15));

    repository.saveAll(List.of(mara,alex));
};
    };
    }

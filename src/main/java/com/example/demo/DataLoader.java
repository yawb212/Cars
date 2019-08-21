package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    CourseRepository repository;

    @Override
    public void run(String... strings) throws Exception{
        Course course;
        course = new Course("Astrophysics", "Neil D Tyson", "Just a course on stars", 3);
        repository.save(course);

        course = new Course("Calculus", "Carol Henley",
                "Rate of Change of the Rate of Chage", 3);
        repository.save(course);

        course = new Course("Frenchman English", "Geraldine Pegram",
                "Learn your language children", 3);
        repository.save(course);
    }
}

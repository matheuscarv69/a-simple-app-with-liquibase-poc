package com.matheuscarv69.liquibase_poc.application.controller;

import com.matheuscarv69.liquibase_poc.domain.model.Student;
import com.matheuscarv69.liquibase_poc.domain.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class StudentController {

    private final StudentService service;

    @GetMapping("/students")
    public ResponseEntity<List<Student>> findAll() {

        var studentsList = service.findAll();

        return ResponseEntity.ok(studentsList);

    }

}

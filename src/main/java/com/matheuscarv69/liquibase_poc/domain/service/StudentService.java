package com.matheuscarv69.liquibase_poc.domain.service;

import com.matheuscarv69.liquibase_poc.domain.model.Student;
import com.matheuscarv69.liquibase_poc.domain.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository repository;

    public List<Student> findAll() {

        return repository.findAll();

    }

}

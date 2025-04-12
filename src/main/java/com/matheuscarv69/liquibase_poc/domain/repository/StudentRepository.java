package com.matheuscarv69.liquibase_poc.domain.repository;

import com.matheuscarv69.liquibase_poc.domain.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}

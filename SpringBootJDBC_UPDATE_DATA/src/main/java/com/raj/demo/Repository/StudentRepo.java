package com.raj.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.raj.demo.entity.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, String> {

}

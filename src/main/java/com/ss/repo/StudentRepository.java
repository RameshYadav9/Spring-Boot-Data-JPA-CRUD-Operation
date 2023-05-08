package com.ss.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.ss.entity.Student;

public interface StudentRepository extends CrudRepository<Student,Integer> {

	List<Student> findByName(String name);

}

package com.ss;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ss.entity.Student;
import com.ss.repo.StudentRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		StudentRepository studentRepo = context.getBean(StudentRepository.class);
		
//		Student s1 = new Student();
//		s1.setId(101);
//		s1.setName("ramesh");
//		s1.setFee(220000.0);
//		
//		studentRepo.save(s1);
//		
//		Student s2 = new Student(102,"amit",11000.0);
//		Student s3 = new Student(103,"raj",21000.0);
//		Student s4 = new Student(104,"ansit",13000.0);
//		
//		
//		studentRepo.saveAll(Arrays.asList(s2,s3,s4));
		
		
		//fetch the student by id
		
//		Optional<Student> s = studentRepo.findById(101);
//		if (s.isPresent())
//			System.out.println(s.get());
//		else
//			System.out.println("student not found");
		
		//to fetch the all student from database
		
		
//		Iterable<Student> student = studentRepo.findAll();
//		student.forEach(System.out::println);
		
		
		//for deleting the student in to databse
		
		
//		if (studentRepo.existsById(101)) {
//			studentRepo.deleteById(101);
//		    System.out.println("student deleted");
//		}else
//			System.out.println("student not found");
//
		//fetch the student from database by name
		
		List<Student> student = studentRepo.findByName("raj");
		if (!student.isEmpty())
			System.out.println(student.get(0));
		else
			System.out.println("student not found");
		
		context.close();
		
	}

}

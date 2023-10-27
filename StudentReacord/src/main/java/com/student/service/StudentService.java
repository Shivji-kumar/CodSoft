package com.student.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.entity.Student;
import com.student.repository.StudentRepo;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepo repo;
	
	public void addStudent(Student e) {
		repo.save(e);
		
	}
	public List<Student> getAllStudent(){
		return repo.findAll();
	}
	
	public Student getStudentById(int id) {
		Optional<Student> e= repo.findById(id);
		if(e.isPresent()) {
			return e.get();
		}
		
		return null;
	}
	
	public void deleteStudent(int id) {
		repo.deleteById(id);
	}

}

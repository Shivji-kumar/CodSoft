package com.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.student.entity.Student;
import com.student.service.StudentService;

import jakarta.servlet.http.HttpSession;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService service;
	
	@GetMapping("/")
	public String home(Model m) {
		List<Student> student = service.getAllStudent();
		m.addAttribute("student",student);
		return "index";
	}
	
	@GetMapping("/addstud")
	public String addStudentForm() {
		
		return "add_stud";
	}
	
	@PostMapping("/register")
	public String studentRegister(@ModelAttribute Student s,HttpSession session) {
		System.out.println(s);
		service.addStudent(s);
		session.setAttribute("msg", "Student Added Success..");
		return "redirect:/";
	}
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable int id,Model m) {
		Student s = service.getStudentById(id);
		m.addAttribute("student", s);
		return "edit";
	}
	
	@PostMapping("/update")
	public String updateStudent(@ModelAttribute Student s,HttpSession session) {
		service.addStudent(s);
		session.setAttribute("msg", "Student data Update Success..");
		return "redirect:/";
	}
	
	@GetMapping("/delete/{id}")
	public String deleteStudent(@PathVariable int id,HttpSession session) {
		service.deleteStudent(id);
		session.setAttribute("msg", "Student data Delete Success..");
		return "redirect:/";
	}
	
	

}

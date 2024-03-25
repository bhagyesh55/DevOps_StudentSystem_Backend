package com.fullStack.studentSystem.Controller;

import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fullStack.studentSystem.Model.Student;
import com.fullStack.studentSystem.Service.StudentService;

@RestController
@CrossOrigin("http://localhost:3000")
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@GetMapping("/allstudents")
	public List<Student> getAllStudents(){
		return studentService.getAllStudent();
	}
	
	@PostMapping("/updateStudents")
	public ResponseEntity<String> saveStudent(@RequestBody Student student){
		studentService.saveStudent(student);
		return new ResponseEntity<String>("Student Added to DB...", HttpStatus.CREATED);
	}
}

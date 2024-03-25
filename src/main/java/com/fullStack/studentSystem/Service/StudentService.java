package com.fullStack.studentSystem.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fullStack.studentSystem.Model.Student;
import com.fullStack.studentSystem.Repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	
	
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}
	
	public  List<Student> getAllStudent(){
		return (List<Student>) studentRepository.findAll();
	}
	
	@Transactional
	public void updateStudent(int id, Student student) {
		studentRepository.updateStudentInfo(student.getId(), student.getName(),student.getAddress());
	}

}

package com.fullStack.studentSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.fullStack.studentSystem.Model.Student;


public interface StudentRepository extends CrudRepository<Student, Integer>{
	
	@Modifying
	@Query("update Student set id=?1, name=?2, address=?3")
	void updateStudentInfo(int id, String name, String address);
	
	
	

}

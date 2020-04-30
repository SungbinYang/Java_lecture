package kr.ac.mjc.java.jdbc.dao;

import java.util.List;

import kr.ac.mjc.java.jdbc.Student;

public class JdbcListExUsingDao {
	
	public static void main(String[] args) {
		StudentDao studentDao = new StudentDao();
		List<Student> studentList = studentDao.listStudents();
		for (Student student : studentList)
			System.out.println(student);
	}

}

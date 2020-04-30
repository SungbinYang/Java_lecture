package kr.ac.mjc.java.jdbc.dbutils;

import java.util.List;

import kr.ac.mjc.java.jdbc.Student;

public class JdbcListEx {
	
	public static void main(String[] args) {
		StudentDao studentDao = new StudentDao();
		List<Student> studentList = studentDao.listStudents();
		for (Student student : studentList)
			System.out.println(student);
	}

}

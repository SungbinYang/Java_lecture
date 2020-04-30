package kr.ac.mjc.java.jdbc.dbutils;

import java.util.List;

import kr.ac.mjc.java.jdbc.Student;

public class JdbcAddEx {
	
	public static void main(String[] args) {
		StudentDao studentDao = new StudentDao();
		Student student = new Student(null, "주지훈", "전자공학과");
		studentDao.addStudent(student);
		System.out.println("학생을 추가했습니다. " + student);

		List<Student> studentList = studentDao.listStudents();
		for (Student st : studentList)
			System.out.println(st);
	}

}

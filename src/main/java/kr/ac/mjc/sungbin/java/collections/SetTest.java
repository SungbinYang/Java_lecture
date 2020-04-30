package kr.ac.mjc.sungbin.java.collections;

import java.util.HashSet;
import java.util.Set;

public class SetTest {
	
	public static void main(String[] args) {
		Set<Student> studentSet = new HashSet<>();

		Student s1 = new Student("1", "주지훈");
		Student s2 = new Student("2", "황우슬혜");
		Student s3 = new Student("1", "홍길동");

		studentSet.add(s1);
		studentSet.add(s2);
		studentSet.add(s3); // s1과 학번이 같아서 안들어감

		for (Student student : studentSet)
			System.out.println(student);
	}

}

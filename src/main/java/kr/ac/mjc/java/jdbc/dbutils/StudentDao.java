package kr.ac.mjc.java.jdbc.dbutils;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.mariadb.jdbc.MariaDbDataSource;

import kr.ac.mjc.java.jdbc.Student;

public class StudentDao {

	private final String LIST_STUDENTS = "select id, name, dept from student";
	private final String GET_STUDENT = "select id, name, dept from student where id=?";
	private final String ADD_STUDENT = "insert student(id,name,dept) values(?,?,?)";
	private final String UPDATE_STUDENT = "update student set name=?, dept=? where id=?";
	private final String DELETE_STUDENT = "delete from student where id=?";

	private DbUtils dbUtils = null;

	public StudentDao() {
		DataSource ds = new MariaDbDataSource(
				"jdbc:mariadb://localhost:3306/jdbc?user=jdbc&password=javaprogramming");
		this.dbUtils = new DbUtils(ds);
	}

	public List<Student> listStudents() {
		// Functional interface를 anonymous class로 구현
		RowMapper<Student> mapper = new RowMapper<>() {
			@Override
			public Student mapRow(ResultSet rs) throws SQLException {
				Student student = new Student();
				student.setId(rs.getString("id"));
				student.setName(rs.getString("name"));
				student.setDept(rs.getString("dept"));
				return student;
			}
		};
		return dbUtils.list(LIST_STUDENTS, mapper);
	}

	public Student getStudent(String id) {
		// Functional interface의 구현체를 lambda expression으로 표현
		return dbUtils.get(GET_STUDENT, (rs) -> {
			Student student = new Student();
			student.setId(rs.getString("id"));
			student.setName(rs.getString("name"));
			student.setDept(rs.getString("dept"));
			return student;
		}, id);
	}

	public int addStudent(Student student) {
		return dbUtils.update(ADD_STUDENT, student.getId(), student.getName(),
				student.getDept());
	}

	public int updateStudent(Student student) {
		return dbUtils.update(UPDATE_STUDENT, student.getName(),
				student.getDept(), student.getId());
	}

	public int deleteStudent(String id) {
		return dbUtils.update(DELETE_STUDENT, id);
	}
}